package atividade1;

import java.util.Scanner;

public class SimpleCalculate {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int cod1 = sc.nextInt();
int quantity1 = sc.nextInt();
double price1 = sc.nextDouble();
System.out.println();
int cod2 = sc.nextInt();
int quantity2 = sc.nextInt();
double price2 = sc.nextDouble();
double total = price1 + price2;
System.out.printf("VALOR A PAGAR = R$ %.2f\n", total);
}
}