package generics.ex3;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		LocalDate dataLan = LocalDate.parse("2024-02-22");
		Jogo jogo1 = new Jogo(2087460, "Ruff Ghanor", 55.99, dataLan, "DX Gameworks", "DX Gameworks, Magalu Games, Nonsense Creations");
		
		dataLan = LocalDate.parse("2022-10-21");
		Jogo jogo2 = new Jogo(1687950, "Persona 5 Royal", 289.00, dataLan, "ATLUS", "SEGA");
		
		Pedido<Jogo> pedido = new Pedido<>();
		
		pedido.adicionarProduto(jogo1);
		pedido.adicionarProduto(jogo2);
		pedido.mostrarLista();
		
	}
}