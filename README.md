<h1 align="center">
  Mensageria com Kafka e Spring
</h1>

Sistema para introduzir o conceito de mensageria apresentado [nesse vídeo](https://youtu.be/97TF2xZgAhU) utilizando Apache Kafka e Spring Boot.

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring for Kafka](https://docs.spring.io/spring-kafka/reference/html/)
- [Kafka](https://kafka.apache.org)
- [Docker Compose](https://docs.docker.com/compose/)

## Como Executar

- Rodar o Kafka com o Docker Compose:
```
$ docker-compose up
```

- Adicionar o hostname `kafka` no arquivo /etc/hosts
- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/messaging-0.0.1-SNAPSHOT.jar
```

- Enviar um hello
```
$ http :8080/kafka/hello/david

HTTP/1.1 200
Connection: keep-alive
Content-Length: 3
Content-Type: text/plain;charset=UTF-8
Date: Tue, 08 Aug 2023 11:28:29 GMT
Keep-Alive: timeout=60

Ok!
```

- Visualizar mensagem recebida no log:
```
Consumer Message: Olá, david
```