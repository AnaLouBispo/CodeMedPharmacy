package br.com.pagamento.sistema.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.pagamento.sistema.models.Cart;
import br.com.pagamento.sistema.models.Produto;
import br.com.pagamento.sistema.models.Usuario;
import br.com.pagamento.sistema.service.IProdutoService;
import br.com.pagamento.sistema.service.impl.ServiceCarrinho;
import br.com.pagamento.sistema.service.impl.UsuarioService;

@Controller
@RequestMapping("/codeMed")
public class PagamentoController {

	@Autowired
	private IProdutoService service;

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/")
	public String Home(Model model) {
		List<Produto> products = service.buscarProdutos();
		model.addAttribute("dermocosmeticos", products);
		return "home";
	}

	@PostMapping("/salvar")
	public String salvarProduto(@ModelAttribute Produto products, Model model) {
		service.salvarProduto(products);

		Long id = service.salvarProduto(products).getId();
		String mensagem = "Produto salvo com id: " + id;
		model.addAttribute(mensagem);
		return "redirect:listar";
	};


	@GetMapping("/Carrinho")
	public String listarProduto(@RequestParam(value = "message", required = false) String message, Model model) {
		model.addAttribute("lista", serviceCarrinho.buscarProdutos());

		return "cart";
	}

	@Autowired
	private ServiceCarrinho serviceCarrinho;

	
	@PostMapping("/salvarUser")
    public String salvarUsuario(@ModelAttribute Usuario usuario) {
		 usuarioService.save(usuario);
        return "home2";

	}
	
	@PostMapping
	public String editarUser(@ModelAttribute Usuario usuario) {
		usuarioService.save(usuario);
		
		return "updateUser";
	}
	
	@GetMapping("/adicionar-ao-carrinho")
	public String adicionarAoCarrinho(@RequestParam Long lista, RedirectAttributes attributes) {

		Produto produto = service.buscarProdutoUnico(lista);

		Cart c = new Cart();
		c.setImagem(produto.getImagem());
		c.setNome(produto.getNome());
		c.setDescricao(produto.getDescricao());
		c.setPreco(produto.getPreco());

		serviceCarrinho.save(c);

		attributes.addFlashAttribute("mensagem", "Produto adicionado ao carrinho com sucesso!");
		return "redirect:/codeMed/";
	}
	
	@GetMapping("/ShowInfo")
	public String showUsers(Model model) {
		
		model.addAttribute("lista", usuarioService.buscarUser());
		return "editUser";
	}

	@GetMapping("/updateUser")
	public String update() {
		return "UpdateUser";
	}
	
	
	@GetMapping("/deletar-carrinho")
	public String deletarProduto(@RequestParam Long id, RedirectAttributes attributes) {
		serviceCarrinho.deletarPorId(id);

		return "redirect:Carrinho";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/Acesso")
	public String Acess() {
		return "acess";
	}

	@GetMapping("/Finalizar")
	public String Final() {
		return "final";
	}
	
	@GetMapping("/Cadastro")
	public String Cadastro() {
		return "register";
	}
	
	@GetMapping("/codeMed2")
	public String Menu2() {
		return "home2";
	}
	
	
	

}
