package com.company.cofrinho;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listMoedas;

	// Construtor da classe
	public Cofrinho() {
		// Inicialização da lista
		this.listMoedas = new ArrayList<Moeda>();
	}

	// Metodo parar adicionar uma moeda
	public void adicionar(Moeda moeda) {
		// Adiciona uma moeda na lista
		this.listMoedas.add(moeda);
	}

	// Metodo parar remover uma moeda
	public void remover(Moeda moeda) {
		// Remove uma moeda na lista
		this.listMoedas.remove(moeda);
	}

	// Metodo para a listagem das moedas
	public void listagemMoedas() {
		// Verifica se a lista está vazia
		if (this.listMoedas.isEmpty()) {
			System.out.println("Não existe nenhuma moeda no cofrinho!");
			return;
		}

		// Laço de repetição para exibir a informação das moedas caso nao esteja vazio o
		// cofrinho
		for (Moeda moeda : this.listMoedas) {
			moeda.info();
		}
	}

	public double totalConvertido() {
		// Verifica se a lista está vazia e retona 0
		if (this.listMoedas.isEmpty()) {
			return 0;
		}

		// Variavel local para calcular o valor total convertido
		double valotTotalConvertido = 0;

		// Laço de repetiçao para calcular o valor de todas a moedas ja convertidas
		for (Moeda moeda : this.listMoedas) {
			valotTotalConvertido = valotTotalConvertido + moeda.converter();
		}
		return valotTotalConvertido;
	}
}
