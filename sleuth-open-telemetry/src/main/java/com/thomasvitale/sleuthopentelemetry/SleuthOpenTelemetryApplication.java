package com.thomasvitale.sleuthopentelemetry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SleuthOpenTelemetryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthOpenTelemetryApplication.class, args);
	}

}

record Book(String name) {}

@RestController
class BookController {

	private static final Logger log = LoggerFactory.getLogger(BookController.class);

	@GetMapping("books")
	public Flux<Book> getBooks() {
		return Flux.just(
				new Book("Harry Potter"),
				new Book("His Dark Materials"),
				new Book("The Hobbit"),
				new Book("The Lord of the Rings")
		).doFirst(() -> log.info("Returning list of books in the catalog"));
	}

}
