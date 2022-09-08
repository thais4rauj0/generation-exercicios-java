package br.com.generation.familia58;

import java.util.Scanner;

public class ExercicioDecisao4 {
	public static void main (String[]args) {
		/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.*/
		
		Scanner leitor = new Scanner (System.in);
		
		double n1, raiz, potencia;
		
		System.out.println("Digite um número qualquer");
		n1 = leitor.nextDouble();
		
		if (n1 % 2 == 0) {
			raiz = Math.sqrt(n1);
			System.out.println("\nO número é par e a raiz deste número é: " + raiz);
		}else if(n1 % 2 >= 1) {
			potencia = Math.pow(n1, 2);
			
			System.out.println("\nNo número é ímpar e elevado ao quadrado seu valor é: " + potencia);
		}
	}

}
