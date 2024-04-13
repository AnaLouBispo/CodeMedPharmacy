package br.com.pagamento.sistema.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Usuario {
	@Id
    @GeneratedValue
    private Long id;
	private String nome;
	private String email;
	private String senha;
	
}
