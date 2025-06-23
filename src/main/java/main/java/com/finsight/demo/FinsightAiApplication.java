package main.java.com.finsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FinsightAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinsightAiApplication.class, args);
		System.out.println(FinsightAiApplication.class.getName()); 
	}

}
