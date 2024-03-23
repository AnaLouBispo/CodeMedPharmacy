// Define o pacote onde a classe está localizada
package br.com.pagamento.sistema.models;

// Importa as classes necessárias
import java.util.List;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import lombok.NoArgsConstructor;

// Define a classe "Cart" como uma entidade JPA
@Entity
// Adiciona getters, setters, toString, equals, e hashCode automaticamente através do Lombok
@Data
// Gera um construtor padrão sem argumentos
@NoArgsConstructor
public class Cart {
	
    // Define o ID da entidade
    @Id
    // Gera automaticamente o valor do ID
    @GeneratedValue
    private Long id;

    // Lista de IDs dos produtos no carrinho
    private List<String> idDeProdutos;
}
