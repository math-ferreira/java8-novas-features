package com.alura.classesanonimas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.alura.Conta;

public class ClassesAnonimas {
	public static void main(String[] args) {
		Conta c1 = new Conta("Matheus", 111, 222);
		Conta c2 = new Conta("Maysa", 333, 555);
		Conta c3 = new Conta("Aline", 999, 444);

		List<Conta> listContas = new ArrayList<>();
		listContas.add(c1);
		listContas.add(c2);
		listContas.add(c3);
		
		// Abaixo são apresentados alguns metodos de ordenação, os 3 ultimos são os mais habituais

		// (1) - Demonstração ordenando por nome, utilizando a classe comparable no metodo sort
		ComparaNome cn = new ComparaNome();
		listContas.sort(cn);
		System.out.println("### (1) Sort nome: \n" + listContas);

		
		// (2) - Demonstração ordenando por agencia, utilizando a classe comparable no metodo sort
		listContas.sort(new ComparaAgencia());
		System.out.println("### (2) Sort agencia: \n" + listContas);

		
		// (3) - Demonstração atraves com classe anonima
		Comparator<Conta> comp = new Comparator<Conta>() {

			@Override
			public int compare(Conta c1, Conta c2) {
				return Integer.compare(c1.getConta(), c2.getConta());
			}
			
		};
		
		System.out.println("### (3) Sort conta: \n" + listContas);

		// (4) - Demonstração ordem natural - Classe Conta ordenado com nome
		listContas.sort(null);
		System.out.println("### (4) Sort natural nome: \n" + listContas);
		
		// (5) Demonstração de metodos da Classe Collections
		
		// Ordenado automaticamente, mas neste caso preciso garantir a ordem natural na Classe Conta
		Collections.sort(listContas);
		System.out.println("### (5) Sort natural Collections nome: \n" + listContas);
		
		// Caso não tenha a ordem natural, devo passar o comparable como segundo argumento
		Collections.sort(listContas, new ComparaNome());
		System.out.println("### (5) Sort Collections nome com Comparable: \n" + listContas);
		
		Collections.reverse(listContas);
		System.out.println("### (5) Reverse natural Collections nome: \n" + listContas);
		
		Collections.shuffle(listContas);
		System.out.println("### (5) Shuffle natural Collections nome: \n" + listContas);
		

	}

}

class ComparaAgencia implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		if (c1.getAgencia() > c2.getAgencia()) {
			return 1;
		} else if (c1.getAgencia() < c2.getAgencia()) {
			return -1;
		}
		return 0;
	}

}

class ComparaNome implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		return c1.getNome().compareTo(c2.getNome());
	}

}
