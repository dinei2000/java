package br.com.isidrocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.hello.model.Produtos;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!!!! Meu primeiro programa em Spring Boot";
	}
	
	@GetMapping("/hellohtml")
	public String sayHTML() {
		return "   <html> "
				+ "  <body>"
				+ "     <h1> Spring Boot Rules </h1>"
				+ "     <hr>"
				+ "     <p> O Isidro fala pa bune </p>"
				+ "   </body>"
				+ " </html>";
	}
	
	@GetMapping("/produto")
	public Produtos exibirProdutos() {
		Produtos p = new Produtos();
		p.setId(987654321);
		p.setDescricao("Computador TOP");
		p.setPreco(150.00);
		return p;

}
	@PostMapping("/novoproduto")
	public String cadastrarProdutos(@RequestBody Produtos novo) {
		System.out.println("Produto recebido: "+novo.getId()+ "/" + novo.getDescricao() + "/" + novo.getPreco());
		return "ok";

	}
}