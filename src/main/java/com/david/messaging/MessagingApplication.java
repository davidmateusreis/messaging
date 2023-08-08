package com.david.messaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MessagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingApplication.class, args);
	}

}

@RestController
@RequestMapping("/kafka")
class HelloController {

	private HelloProducer helloProducer;

	public HelloController(HelloProducer helloProducer) {
		this.helloProducer = helloProducer;
	}

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		helloProducer.sendMessage("Hello, " + name);
		return "Ok!";
	}
}
