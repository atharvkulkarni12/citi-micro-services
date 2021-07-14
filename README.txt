Day-3
-------
https://github.com/citiuspg/config-server-demo
1. Create a properties file <service-name>-<profile>.properties in git properties repository.
java -jar target/user-service-0.0.1-SNAPSHOT.jar --spring.cloud.config.profile=dev

Day-2
add to app.properties of email-service

spring.application.name=email-service
servet.port=8081
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka
eureka.client.healthcheck.enabled=true



<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger2</artifactId>
	<version>2.4.0</version>
</dependency>
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger-ui</artifactId>
	<version>2.4.0</version>
</dependency>

@EnableSwagger2   add in main class

http://localhost:8080/swagger-ui.html
