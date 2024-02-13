package br.com.mhps.telafilme;

import br.com.mhps.telafilme.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelafilmeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TelafilmeApplication.class, args);
	}

	@Override
	public void
	run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
