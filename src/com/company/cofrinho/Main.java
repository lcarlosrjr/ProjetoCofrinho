package com.company.cofrinho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();

		while (true) {
			System.out.println("\n--- COFRINHO ---");
			System.out.println("[1] - Adicionar Moeda");
			System.out.println("[2] - Remover Moeda");
			System.out.println("[3] - Listar Moedas");
			System.out.println("[4] - Valor total convertido para Real");
			System.out.println("[5] - Encerrar");
			System.out.print("Digite a opção desejada: ");

			int opcao;

			do {
				while (!sc.hasNextInt()) { // Verifica se o valor digitado é um inteiro.
					System.out.print("Opção inválida. Digite um número válido: ");
					sc.next();
				}
				opcao = sc.nextInt();
				if (opcao <= 0 || opcao > 5) { // Verifica se o valor digitado está entre as opções de menu.
					System.out.print("Opção inválida. Digite novamente uma opção válida: ");

				}
			} while (opcao <= 0 || opcao > 5); // Repete enquanto o valor não estiver entre 1 e 5.

			switch (opcao) {
			case 1:
				// Adição de moedas no cofrinho.
				System.out.println("\nEscolha o tipo da moeda que deseja adicionar:");
				System.out.println("[1] - Real");
				System.out.println("[2] - Dólar");
				System.out.println("[3] - Euro");
				System.out.println("[4] - Voltar ao menu principal");
				System.out.print("Digite a opção desejada: ");

				int opcaoAdicionar = Integer.parseInt(sc.next());

				if (opcaoAdicionar == 1) {
					System.out.print("Digite o valor da moeda que deseja adicionar: ");
					double valor = Double.parseDouble(sc.next());
					Real real = new Real(valor);
					cofrinho.adicionar(real); // Adiciona Real no cofrinho.
					break;
				} else if (opcaoAdicionar == 2) {
					System.out.print("Digite o valor da moeda que deseja adicionar: ");
					double valor = Double.parseDouble(sc.next());
					Dolar dolar = new Dolar(valor);
					cofrinho.adicionar(dolar); // Adiciona Dólar no cofrinho.
					break;
				} else if (opcaoAdicionar == 3) {
					System.out.print("Digite o valor da moeda que deseja adicionar: ");
					double valor = Double.parseDouble(sc.next());
					Euro euro = new Euro(valor);
					cofrinho.adicionar(euro); // Adiciona Euro no cofrinho.
					break;
				} else if (opcaoAdicionar == 4) {
					break; // Sai do swith e volta ao menu principal
				} else {
					System.out.println("Opção inválida."); // Digitado moeda inválida.
					break;
				}

			case 2:
				// Remoção de moedas no cofrinho.
				System.out.println("Qual moeda voce deseja remover ?");
				System.out.println("[1] - Real");
				System.out.println("[2] - Dólar");
				System.out.println("[3] - Euro");
				System.out.println("[4] - Voltar ao menu principal");
				System.out.print("Digite a opção desejada: ");

				int opcaoRemover = Integer.parseInt(sc.next());

				if (opcaoRemover == 1) {
					System.out.print("\nDigite o valor da moeda que deseja remover: ");
					double valor = Double.parseDouble(sc.next());
					Real real = new Real(valor);
					cofrinho.remover(real); // Remove a moeda Real no cofrinho.
					break;
				} else if (opcaoRemover == 2) {
					System.out.print("\nDigite o valor da moeda que deseja remover: ");
					double valor = Double.parseDouble(sc.next());
					Dolar dolar = new Dolar(valor);
					cofrinho.remover(dolar); // Remove a moeda Dolar no cofrinho.
					break;
				} else if (opcaoRemover == 3) {
					System.out.print("\nDigite o valor da moeda que deseja remover: ");
					double valor = Double.parseDouble(sc.next());
					Euro euro = new Euro(valor);
					cofrinho.remover(euro); // Remove a moeda Euro no cofrinho.
					break;
				} else if (opcaoRemover == 4) {
					break; // Sai do swith e volta ao menu principal
				} else {
					System.out.println("\nOpção inválida."); // Digitado moeda inválida.
					break;
				}
			case 3:
				// Lista as moedas presentes no cofrinho.
				System.out.println("\nListar moedas:");
				cofrinho.listagemMoedas(); // Chama o método de listar moedas da classe Cofrinho.
				break;
			case 4:
				// Chama o método de converter moedas da classe Cofrinho e exibe o total
				// convertido em Reais e com duas casas decimais.
				System.out.printf("\nValor total convertido em Real: %.2f", cofrinho.totalConvertido());
				break;
			case 5:
				System.out.println("\nEncerrando o programa...");
				sc.close(); // Fecha o Scanner para evitar vazamentos de recursos.
				System.exit(1); // Encerra o programa.
			default:
				System.out.println("\nOpção inválida, tente novamente.");
			}
		}
	}
}
