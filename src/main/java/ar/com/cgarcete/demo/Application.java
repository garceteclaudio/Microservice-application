package ar.com.cgarcete.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import ar.com.cgarcete.demo.entity.Person;
import ar.com.cgarcete.demo.repository.PersonRepository;

@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
//	PAL TOMCAT	
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(Application.class);
//	}
	
//	@Bean
//	CommandLineRunner runner(PersonRepository repository) {
//		
//		return args -> {
//			repository.save(	new Person("nombre1", "ape1")	);
//			repository.save(	new Person("nombre2", "ape2")	);
//			repository.save(	new Person("nombre3", "ape3")	);
//		};
//	}	
	
}
