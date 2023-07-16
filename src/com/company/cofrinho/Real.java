package com.company.cofrinho;

//Classe "filha" de Moeda
public class Real extends Moeda {
	
	//Construtor com parametro para passar o valor para a classe "mae"
	public Real(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {
		System.out.println("Real: "+valor);

	}

	@Override
	public double converter() {
		return this.valor;
	}
}
