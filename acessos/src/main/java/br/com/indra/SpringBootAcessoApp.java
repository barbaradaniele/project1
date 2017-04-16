package br.com.indra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import br.com.indra.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"br.com.indra"})
public class SpringBootAcessoApp {

	 public static void main(String[] args) {
	        SpringApplication.run(SpringBootAcessoApp.class, args);
	    }
	 
}
