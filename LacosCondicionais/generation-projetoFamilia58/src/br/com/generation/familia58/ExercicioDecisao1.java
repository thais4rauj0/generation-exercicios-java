package br.com.generation.familia58;

import java.util.Scanner;

public class ExercicioDecisao1 {
	
	public static void main (String[] args) {
		/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		
		Scanner leitor = new Scanner(System.in);
		double n1,n2,n3, maior=0;
		
		System.out.println("Digite 3 números:");
		n1 = leitor.nextDouble();
		n2 = leitor.nextDouble();
		n3 = leitor.nextDouble();
		
		if (maior<n1) {
			maior = n1;
		}
		
		if(maior<n2) {
			maior = n2;
		}
		
		if(maior<n3) {
			maior = n3;
		}
		
		System.out.println("Maior número digitado foi: " + maior);
		
		
	}

}
