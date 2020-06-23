package com.foke.domain;

public class Principal {

	public static void main(String[] args) {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();		
		
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("queijo");
		carrinho.adicionaPizza(pizza1);
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("presunto");
		carrinho.adicionaPizza(pizza2);
		
		Pizza piza3 = new Pizza();
		piza3.adicionaIngrediente("frango");
		piza3.adicionaIngrediente("queijo");
		carrinho.adicionaPizza(piza3);
		
		
		System.out.println(carrinho.getPrecoTotal());
		
		System.out.println(Pizza.contaIngrediente());
	}
}
