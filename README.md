# Kafka con Spring Boot Ejemplo

## Introducción
El objetivo de este ejemplo es poder enviar y recibir mensajes con kafka en Spring Boot.


## Artículos

 * Spanish: [Kafka con Spring Boot Parte Uno](https://refactorizando.com/kafka-spring-boot-parte-uno/)
 * English: [Kafka with Spring Boot](https://refactorizando.com/en/kafka-in-spring-boot-with-example/)
 * [Kafka con Strimzi en Kubernetes](https://refactorizando.com/kafka-kubernetes-strimzi/)

## Configuración

### Arrancar Kafka con Docker

`docker run --rm -p 2181:2181 -p 3030:3030 -p 8081-8083:8081-8083 -p 9581-9585:9581-9585 -p 9092:9092 -e ADV_HOST=localhost landoop/fast-data-dev:latest
`
## Cómo arrancar la aplicación


git clone https://github.com/refactorizando-web/metrics-prometheus.git

`
mvn spring-boot:run
`
La aplicación se arráncara en localhost:8080

### Cómo enviar un mensaje
Para enviar un mensaje hacer una llamada post al endpoint:
`http://localhost:8080/messages/send
`
