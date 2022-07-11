package com.dio.calculadora;

import java.util.Scanner;

public class Caulculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1, n2;	
				
		System.out.println("Digite o primeiro números: ");		
		n1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = scan.nextInt();
		
		int soma = soma(n1, n2);
		int subtracao = subtracao(n1, n2);
		double divisao = divisao(n1, n2);
		int multiplicacao = multiplicacao(n1, n2);
		
		System.out.println("A soma dos dois número é: " + soma);
		System.out.println("A subtração dos dois número é: " + subtracao);
		System.out.println("A divisão dos dois número é: " + divisao);
		System.out.println("A multiplicação dos dois número é: " + multiplicacao);
		
	}
	
	public static int soma (int n1, int n2) {
		return n1 + n2;
	}
	
	public static int subtracao (int n1, int n2) {
		return n1 - n2;
	}
	
	public static double divisao (double n1, double n2) {
		return n1 / n2;
	}
	
	public static int multiplicacao (int n1, int n2) {
		return n1 * n2;
	}
	
	
	
}
