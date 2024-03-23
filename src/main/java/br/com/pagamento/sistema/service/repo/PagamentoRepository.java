package br.com.pagamento.sistema.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pagamento.sistema.models.Produto;


public interface PagamentoRepository extends JpaRepository<Produto, Long> {
 
}
