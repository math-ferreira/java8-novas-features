package com.alura;

public class Conta implements Comparable<Conta> {

	private String nome;
	private int conta;
	private int agencia;

	public Conta(String nome, int conta, int agencia) {
		super();
		this.nome = nome;
		this.conta = conta;
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	@Override
	public String toString() {
		return "Conta: nome=" + nome + ", conta=" + conta + ", agencia=" + agencia;
	}

	@Override
	public int compareTo(Conta outraConta) {
		return this.nome.compareTo(outraConta.nome);
	}

}