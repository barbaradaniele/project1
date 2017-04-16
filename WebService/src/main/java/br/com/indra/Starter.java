package br.com.indra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "br.com.indra.model")
@EnableJpaRepositories(basePackages = "br.com.indra.repository")
@SpringBootApplication(scanBasePackages = "br.com.indra")
@Component
public class Starter {

	// Spring boot
	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}
}
