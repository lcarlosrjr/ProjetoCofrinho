package com.company.cofrinho;

//Classe "Mae"
public abstract class Moeda {

	protected double valor;

	public abstract void info();

	public abstract double converter();

	// Sobescrita do metodo para comparar o tipo do Objeto das classes "filhas" (se
	// a classe é Dolar, Real ou Euro)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
}
