package com.company.cofrinho;

//Classe "filha" de Moeda
public class Euro extends Moeda {

	//Construtor com parametro para passar o valor para a classe "mae"
	public Euro(double valor) {
		this.valor = valor;
	}

	@Override
	public void info() {
		System.out.println("Euro: " + valor);
	}

	@Override
	public double converter() {
		return this.valor * 5.38;
	}
}
