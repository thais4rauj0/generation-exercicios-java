package br.com.generation.familia58;

import java.util.Scanner;

public class ExercicioDecisao3 {
	public static void main (String[]args) {
		/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		categoria ela se encontra:
		 10-14 infantil
		 15-17 juvenil
		 18-25 adulto*/
			
			Scanner leitor = new Scanner (System.in);
			
			int idade, x=0;
			
			System.out.println("Digite sua idade: ");
			
			idade = leitor.nextInt();
			
			if (idade>= 10 && idade<=14) {
				x = 1;
			} else if (idade>=15 && idade<=17) {
				x = 2;
			}else if (idade>=18 && idade <=25) {
				x = 3;
			}
			
			switch (x) {
				case 1:
					System.out.println("\nVocê pertence ao grupo infantil");
					break;
				case 2:
					System.out.println("\nVocê pertence ao grupo juvenil");
					break;
				case 3:
					System.out.println("\nVocê pertence ao grupo adulto");
					break;
				default:	
					System.out.println("\nOpção Inválida!");
			}
				

	}
}
