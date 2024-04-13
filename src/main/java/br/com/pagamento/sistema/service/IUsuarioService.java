package br.com.pagamento.sistema.service;

import java.util.List;

import br.com.pagamento.sistema.models.Produto;
import br.com.pagamento.sistema.models.Usuario;

public interface IUsuarioService {
	public List<Usuario>buscarUser();
	public void save(Usuario usuario);
}
