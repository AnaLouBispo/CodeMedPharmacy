package br.com.pagamento.sistema.service.repo;
	import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pagamento.sistema.models.Cart;

	public interface CarrinhoRepository extends JpaRepository<Cart, Long> {
	    // Aqui você pode adicionar métodos adicionais se precisar
	}


