package br.com.pagamento.sistema.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
@Entity // Entidade indicando que é um Objeto
@Data // Gera automaticamente o getts and setters
@NoArgsConstructor // Não recebe argumentos
public class Produto {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String descricao;
	private double preco;
	private String imagem;
	
	enum TipoRemedio {
	    CREME, REMEDIO, TARJA_PRETA
	}
	
}
