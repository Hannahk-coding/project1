package com.jw.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan("com.jw.user")
@PropertySource("classpath:application-${spring.profiles.active:dev}.properties")
public class Application {
	
	public static void main(String[] args) {
		try {
			SpringApplication app = new SpringApplication(Application.class);
			app.addListeners(new ApplicationPidFileWriter());
			app.run(args);
	//		SpringApplication.run(Project1Application.class, args);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
