package br.com.pagamento.sistema.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.pagamento.sistema.models.Produto;
import br.com.pagamento.sistema.service.IProdutoService;

@Controller
@RequestMapping("/codeMed")
public class PagamentoController {

	@Autowired
	private IProdutoService service;

	@GetMapping("/")
	public String Home(Model model) {
		List<Produto> products = service.buscarProdutos();
		model.addAttribute("dermocosmeticos", products);
		model.addAttribute("antibioticos",products);
		model.addAttribute("remedios",products);
		
	
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

	


	// @GetMapping("/editar")
	// public String editarPagamento(Model model, RedirectAttributes attributes,
	// @RequestParam Long id) {
	// String page;
	// try {
	// Pagamento pagamento = service.buscarPagamentoUnico(id);
	// model.addAttribute("pagamento" , pagamento);
	// page = "editarPagamento";
	// } c//atch (PagamentoNotFoundException e) {
	// attributes.addAttribute("message", e.getMessage());
	// page = "redirect:listarPagamentos";
	// }
	// return page;
	// }

	@GetMapping("/Carrinho")
	public String ListarProduto(@RequestParam(value = "message", required = false) String message, Model model) {
		List<Produto> products = service.buscarProdutos();
		model.addAttribute("lista", products);
		model.addAttribute("mensagem", message);
		
		
		
		
		return "cart";

	}

	// @PostMapping("/atualizar")
	// public String atualizarPagamento(@ModelAttribute Pagamento pagamento,
	// RedirectAttributes attributes) {
	// service.atualizarPagamento(pagamento);
	// Long id = pagamento.getId();
	// attributes.addAttribute("message" , "Pagamento salvo com: " + id + "com
	// sucesso");
	// return "redirect:listar";
	// }

	@GetMapping("/deletar")
	public String deletarProduto(@RequestParam Long id, RedirectAttributes attributes) {
		try {
			service.deletarProduto(id);
			attributes.addAttribute("message", "O Pagamento foi deletado, id: " + id);
		} catch (Exception e) {
			attributes.addAttribute("message", e.getMessage());
		}
		return "redirect:listar";
	}

	@GetMapping("/login")
	public String login() {
		// try {
		// service.deletarPagamento(id);
		// attributes.addAttribute("message", "O Pagamento foi deletado, id: " + id);
		// } catch (Exception e) {
		// attributes.addAttribute("message", e.getMessage());
		// }
		return "login";
	}

	@GetMapping("/Cadastro")
	public String Acess() {
		// try {
		// service.deletarPagamento(id);
		// attributes.addAttribute("message", "O Pagamento foi deletado, id: " + id);
		// } catch (Exception e) {
		// attributes.addAttribute("message", e.getMessage());
		// }
		return "acess";
	}

	@GetMapping("/Finalizar")
	public String Final() {
		// try {
		// service.deletarPagamento(id);
		// attributes.addAttribute("message", "O Pagamento foi deletado, id: " + id);
		// } catch (Exception e) {
		// attributes.addAttribute("message", e.getMessage());
		// }
		return "final";
	}

}
