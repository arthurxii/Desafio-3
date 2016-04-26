package br.unipe.mlpiii.conta.modelo;

public class Conta {
protected double saldo;
protected String numero;
protected int id;
protected boolean status;
protected String titular;

public Conta(double saldo, String numero){
	this.saldo = saldo;
	this.numero = numero;
	this.id = id;
	this.status = status;
	this.titular = titular;
}

public Conta() {
	// TODO Auto-generated constructor stub
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}

public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public String toString() {
	return this.saldo+","+this.numero;
}
}
