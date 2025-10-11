package atividade1;

import java.util.Scanner;


public class Exercicio4 extends Exercicio3 {

	//public static void deposito(double valor, int numconta) {
		//double saldo = 10000;
		//saldo += valor;
		//System.out.println("Deposito realizado no valor de R$ " + valor);
		//System.out.println("Saldo atual é de " + saldo);
	//}
	public static void saque(double valordesaque) {
		double saldo = 3000;
		if (valordesaque > saldo) {
			System.out.println("Erro. Saldo insuficiente");
			} else {; 
				saldo  = saldo - valordesaque;
			System.out.println("Saque realizado. agora seu saldo é " + saldo);
			}

	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String titular;
		int numconta;
		double valordedeposito;
		double valordesaque;
		System.out.println("digite seu nome");
		titular = keyboard.next();
		System.out.println("digite o numero da conta");
		numconta = keyboard.nextInt();
		System.out.println("Digite o valor do saque");
		valordesaque = keyboard.nextDouble();
		saque(valordesaque);
		
		
		
		
		//valordedeposito = keyboard.nextDouble();
	
		//deposito(valordedeposito, numconta);
	}
	
}
