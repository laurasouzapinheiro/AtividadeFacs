package atividade1;

import java.util.Scanner;
/*Make a program that reads a seller's name, his/her fixed salary and the sale's total made by himself/herself in the month (in money). Considering that this seller receives 15% over all products sold, write the final salary (total) of this seller at the end of the month , with two decimal places.

- Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.

- Don’t forget the blank spaces.The input file contains a text (employee's first name), and two double precision values, that are the seller's salary and the total value sold by him/her.*/

public class Programa {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String nome = sc.next();
	double salario = sc.nextDouble();
	double vendas = sc.nextDouble();
	double porcentagem = (vendas * 15)/100;
	double SalarioTotal = porcentagem + salario;
	System.out.printf("TOTAL = %.2f\n", SalarioTotal);
	
	}

}
