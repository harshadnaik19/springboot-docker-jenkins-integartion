package com.mstar.SpringDockerJenkinsIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerJenkinsIntegrationApplication {

	@GetMapping("/sayHello")
	public String sayHello(){
		return "hello guyz! welcome to docker jenkins integration tutorial !";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerJenkinsIntegrationApplication.class, args);
	}

}
