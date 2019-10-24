package de.springbootbuch.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application extends SpringBootServletInitializer{

	@RestController
	public static class HelloWorldController {

		@GetMapping("/hello")
		public String helloWorld(
			@RequestParam final String name) {
			return "Hello, " + name + "\n";
		}
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String... args) {
		SpringApplication.run(Application.class, args);
	}
}
