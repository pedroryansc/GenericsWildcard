package generics.ex3;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		LocalDate dataLan = LocalDate.parse("2024-02-22");
		Jogo jogo1 = new Jogo("Ruff Ghanor", 55.99, dataLan, "Nintendo Switch");
		
		dataLan = LocalDate.parse("2022-10-21");
		Jogo jogo2 = new Jogo("Persona 5 Royal", 289.00, dataLan, "PC");
		
		dataLan = LocalDate.parse("2020-11-12");
		Console console = new Console("Playstation 5", 3699.99, dataLan, "Sony");
		
		Pedido pedido = new Pedido<>();
		// ou, para evitar warnings, Pedido<LojaVideogame> pedido = new Pedido<>();
		
		pedido.adicionarProduto(jogo1);
		pedido.adicionarProduto(jogo2);
		pedido.adicionarProduto(console);
		pedido.mostrarLista();
		
		/*
		
		ClasseSemExtends obj = new ClasseSemExtends();
		pedido.adicionarProduto(obj);
		
		// A classe ClasseSemExtends não é uma classe filha de LojaVideogame e, por isto, um objeto seu não pode ser adicionado à lista de produtos.
		
		*/
		
	}
}