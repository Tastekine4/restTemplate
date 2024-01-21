package com.example.javaresttemplate;

import com.example.javaresttemplate.exception.RestTemplateResponseErrorHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JavaRestTemplateApplication {

	private final RestTemplateResponseErrorHandler responseErrorHandler;

	public JavaRestTemplateApplication(RestTemplateResponseErrorHandler restTemplateResponseErrorHandler) {
		this.responseErrorHandler = restTemplateResponseErrorHandler;
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaRestTemplateApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplateBuilder()
				.errorHandler(responseErrorHandler)
				.build();
	}

}
