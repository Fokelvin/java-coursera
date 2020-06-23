package com.foke.domain;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List <Pizza> pizzas = new ArrayList<>();
	
	
	public void adicionaPizza(Pizza pizza){
		pizzas.add(pizza);
	}
	
	public Double getPrecoTotal(){
		Double somaTotal = 0d;
		for(Pizza pizza : pizzas){
			somaTotal += pizza.getPreco();
		}
		return somaTotal;
	}
	
}
