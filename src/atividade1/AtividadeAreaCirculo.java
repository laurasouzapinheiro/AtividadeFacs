package atividade1;

import java.util.Scanner;

public class AtividadeAreaCirculo  {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double raio = sc.nextDouble();
	double pi = 3.14159;
	double A = (raio * raio) * pi;
	System.out.printf("A=%.4f\n", A);
	}

}
