package br.com.pagamento.sistema.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.pagamento.sistema.models.Usuario;

public interface UsuarioRepo extends JpaRepository <Usuario, Long> {

}
