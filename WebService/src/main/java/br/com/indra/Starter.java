package br.com.indra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.indra.configuration.JpaConfiguration;

import org.springframework.context.annotation.Import;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"br.com.indra"})
public class Starter {

	// Spring boot
	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}
}
