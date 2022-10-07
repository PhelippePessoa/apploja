package br.edu.uerr.apploja.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.uerr.apploja.modelo.Produtos;
import br.edu.uerr.apploja.repositorio.EmpresaRepositorio;
import br.edu.uerr.apploja.repositorio.FornecedorRepositorio;
import br.edu.uerr.apploja.repositorio.ProdutosRepositorio;

@Controller
public class ProdutosControle {

	@Autowired
	ProdutosRepositorio produtosRepositorio;
	
	@Autowired
	EmpresaRepositorio empresaRepositorio;
	
	@Autowired
	FornecedorRepositorio fornecedorRepositorio;
	
	//Listar
	
	//From
	@GetMapping("/cadastroProduto")
	public String novoProdutos(Model model) {
		Produtos produtos = new Produtos();
		
		model.addAttribute("listaEmpresas", empresaRepositorio.findAll());		
		model.addAttribute("listaFornecedores", fornecedorRepositorio.findAll());
		
		
		model.addAttribute("produto",produtos);
		return "formProduto";
	}
	
	//Salvar/Alterar
	
	
	//Deletar
	
	
	
	
}