package com.jw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@ComponentScan("com.jw")
@PropertySource("classpath:application-${spring.profiles.active:dev}.properties")
@EnableAutoConfiguration
@Slf4j
public class Application {
	
	public static void main(String[] args) {
		try {
			SpringApplication app = new SpringApplication(Application.class);
			app.addListeners(new ApplicationPidFileWriter());
			app.run(args);
		} catch(Exception e) {
			log.error("", e);
		}
	}
}
