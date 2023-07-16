package com.company.cofrinho;

//Classe "filha" de Moeda
public class Dolar extends Moeda {

	//Construtor com parametro para passar o valor para a classe "mae"
	public Dolar(double valor) {
		this.valor = valor;
	}
	
	@Override
	public void info() {
		System.out.println("Dolar: "+valor);
	}

	@Override
	public double converter() {
		return this.valor * 4.79;	
	}
}
