package br.com.pagamento.sistema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pagamento.sistema.models.Cart;
import br.com.pagamento.sistema.models.Usuario;
import br.com.pagamento.sistema.service.IUsuarioService;
import br.com.pagamento.sistema.service.repo.UsuarioRepo;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private UsuarioRepo userRepository;

	public void save(Usuario usuario) {
		userRepository.save(usuario);
	}

	public void deletarPorId(Long id) {
		userRepository.deleteById(id);
	}

	public void edit(Usuario user) {
		userRepository.save(user);
	}
	public List<Usuario> buscarUser() {
		// Retorna todos os carrinhos do banco de dados
		return userRepository.findAll();
	}


	

	
}
