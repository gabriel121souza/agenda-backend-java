package io.github.gabriel121souza.agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendaApiApplication {
//	/*
//	  Executando um  insert quando sobe aplicação
//	*/
//	@Bean
//	public CommandLineRunner commandLineRunner(@Autowired ContatoRepository contatoRepository) {
//		  return args -> {
//			Contato contato = new Contato();
//			contato.setNome("Daniel Raflas");
//			contato.setEmail("raflas@gmail.com");
//			contato.setFavorito(false);
//			contatoRepository.save(contato);
//		  };
//	}
//	
	public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

}
