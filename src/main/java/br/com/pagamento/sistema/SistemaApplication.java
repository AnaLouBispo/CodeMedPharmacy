package br.com.pagamento.sistema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Anotation => projeto de springboot
@SpringBootApplication
public class SistemaApplication {

	public static void main(String[] args) {
		//Ele cria o contexto que é aplicaçao Spring
		//Varredura, das classes antes de Iniciar
		//Inicia a Aplicação 
		SpringApplication.run(SistemaApplication.class, args);
	}

}
