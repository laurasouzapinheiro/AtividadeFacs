package atividade1;

import java.util.Scanner;

//Faça um algoritmo que leia um valor N. Escreva a seguir os números de 1 a N.
public class Exercicio5 extends Exercicio4 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero:");
		n = sc.nextInt();
		System.out.println("Os numeros de 1 a " + n + "sao " );
		for (int i = 1; i <= n; i++);
		System.out.println(i);
		
		
		
		

		
	}

}
