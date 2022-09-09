package exercicios.lacoRepeticao;

import java.util.Scanner;

public class ExercicioWhile3 {
	
	public static void main(String[] args) {
		/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)*/
		
		int idade, m21=0, m50=0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("\nInforme sua idade: ");
		
		idade = leitor.nextInt();
		
		while (idade != -99) {
			
				if (idade<= 21) {
					m21++;
				}else if(idade>=50) {
					m50++;
		}	
				
				System.out.println("\nInforme sua idade: ");
				
				idade = leitor.nextInt();
			
	}
		
		System.out.println("A quantidade de pessoas com menos de 21 anos foi de: " + m21);
		System.out.println("A quantidade de pessoas com mais de 50 anos foi de: " + m50);
		

	}
}
