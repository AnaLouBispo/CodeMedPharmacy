package br.com.pagamento.sistema.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pagamento.sistema.exception.PagamentoNotFoundException;
import br.com.pagamento.sistema.models.Produto;
import br.com.pagamento.sistema.service.IProdutoService;
import br.com.pagamento.sistema.service.repo.PagamentoRepository;

@Service
public class ProdutoServiceImpl implements IProdutoService {
	@Autowired
	private PagamentoRepository repo;

	public Produto salvarProduto(Produto products) {
		return repo.save(products);
	}

	@Override
	public List<Produto>buscarProdutos() {
	return repo.findAll();
	}
	@Override
	public Produto buscarProdutoUnico(Long id) {
		Optional<Produto> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		 throw new PagamentoNotFoundException("the id: " + id + "not found");
	}
	@Override
	public void  deletarProduto(Long id) {
		repo.delete(buscarProdutoUnico(id));
	}
	
	@Override
	
	public void buscarProdutoUnico(Produto products) {
		repo.save(products);
	}

	@Override
	public void atualizarProduto(Produto products) {
		// TODO Auto-generated method stub
		
	}


	
}
