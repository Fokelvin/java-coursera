package com.foke.domain;

import java.util.HashMap;
import java.util.Map;

public class Pizza {

	private static Map <String, Integer> mapIngrediente = new HashMap<>();
	Integer quantidadeIngrediente = Integer.valueOf(0);
	
	private static void contabilizaIngrediente(String ingrediente){
		if (!mapIngrediente.containsKey(ingrediente)){
			mapIngrediente.put(ingrediente, 1);
		}else{
			Integer quantidade = mapIngrediente.get(ingrediente);
			quantidade++;
			mapIngrediente.put(ingrediente, quantidade);
		}
	}
	
	public Double getPreco(){
		Integer soma = quantidadeIngrediente;
		if (soma <= 2) {
			return 15d;
		}else if(soma >2 && soma <= 5){
			return 20d;
		}else {
			return 23d;
		}
	}
	
	public void adicionaIngrediente(String ingrediente){
		quantidadeIngrediente++;
		contabilizaIngrediente(ingrediente);
	}
	
	public static String contaIngrediente(){
		String x = "";
		for (Map.Entry<String, Integer> entry : mapIngrediente.entrySet()){
			x += "Ingrediente: " + entry.getKey() + ", " + entry.getValue() + "\n";
		}
		
		return x;
	}
}
