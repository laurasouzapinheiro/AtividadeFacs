// Crie um programa que peça dois números inteiros ao usuário 
//e mostre qual deles é o maior ou se são iguais.
package atividade1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o numero 1:");
	int num1 = sc.nextInt(); //Atributo é a definiçao da existencia de algo e Metodo é o conjunto de açoes atraves de um comando dado
	System.out.println("Digite o numero 2:");
	int num2 = sc.nextInt();
	if (num1 > num2) {
		System.out.println(num1 +" é maior que " + num2);
	} else if (num1 == num2) {
		System.out.println("Os numeros sao iguais");
		} else  {
			System.out.println(num2 +" é maior que " + num1);
		
	}
	
			
	}
}
