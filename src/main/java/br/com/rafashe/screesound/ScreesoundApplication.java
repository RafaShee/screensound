package br.com.rafashe.screesound;

import br.com.rafashe.screesound.principal.Principal;
import br.com.rafashe.screesound.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreesoundApplication implements CommandLineRunner{
	@Autowired
	private ArtistaRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(ScreesoundApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal p = new Principal(repositorio);
		p.exibeMenu();
	}
}
