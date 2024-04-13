// Define o pacote onde a classe está localizada
package br.com.pagamento.sistema.models;

// Importa as classes necessárias
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


//Gera um construtor padrão sem argumentos
// Define a classe "Cart" como uma entidade JPA

// Adiciona getters, setters, toString, equals, e hashCode automaticamente através do Lombok
@Entity
@Data
@NoArgsConstructor
public class Cart {
	
    // Define o ID da entidade
    // Gera automaticamente o valor do ID
	@Id
    @GeneratedValue
    private Long id;

	private String nome;
	private String descricao;
	private double preco;
	private String imagem;
    // Lista de IDs dos produtos no carrinho
    // private List<String> idDeProdutos;

	// public void addProduto(Produto produto) {
		
	// }
}
