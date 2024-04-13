package br.com.pagamento.sistema.service;

import java.util.List;

import br.com.pagamento.sistema.models.Produto;
import br.com.pagamento.sistema.models.Usuario;

public interface IProdutoService {

	public Produto salvarProduto(Produto products);
	public List<Produto>buscarProdutos();
	public Produto buscarProdutoUnico(Long id);
	public void deletarProduto(Long id);
	public void atualizarProduto(Produto products);
	void buscarProdutoUnico(Produto products);
	
	
}
