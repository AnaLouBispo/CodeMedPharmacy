package br.com.pagamento.sistema.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pagamento.sistema.models.Cart;
import br.com.pagamento.sistema.service.repo.CarrinhoRepository;

@Service
public class ServiceCarrinho {
    
	@Autowired
	private CarrinhoRepository car;
	
    public void save(Cart carrinho) {
    	car.save(carrinho);
    }
    
    public void deletarPorId(Long id) {
    	car.deleteById(id);
    }

    /* public void adicionarProdutoAoCarrinho(Produto produto) {
        // Verifica se já existe um carrinho no banco de dados
        Optional<Cart> optionalCarrinho = car.findById(1L); // Assumindo que o ID do carrinho é 1
        
        Cart carrinho;
        if (optionalCarrinho.isPresent()) {
            // Se o carrinho já existe, adiciona o produto ao carrinho existente
            carrinho = optionalCarrinho.get();
            carrinho.addProduto(produto);
        } else {
            // Se o carrinho não existe, cria um novo carrinho e adiciona o produto
            carrinho = new Cart();
            carrinho.addProduto(produto);
        } 
        
        // Salva o carrinho no banco de dados
        car.save(carrinho);
    } */

    public List<Cart> buscarProdutos() {
        // Retorna todos os carrinhos do banco de dados
        return car.findAll(); 
    }
}
