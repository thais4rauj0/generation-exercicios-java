package arrays.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String[]args) {
		
		/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
*/
	int[][] matriz =  new int[3][3];
	int[][] valores = new int[3][3];
	int linha, coluna,maiorDez=0;
	
	Scanner leitor = new Scanner (System.in);
	
	for (linha=0;linha<3;linha++) {
		for(coluna=0;coluna<3;coluna++) {
			
		System.out.println("\nValor linha " + linha +  " e coluna " +coluna + ": ");
		
		matriz[linha][coluna] = leitor.nextInt();
		
		if (matriz[linha][coluna]>=10) {
			valores[linha][coluna] = matriz[linha][coluna];
			maiorDez++;
		}
		}
		
		
	}
	
	
	System.out.println("\nOs valores maiores que 10 digitados foram:\n");
	for(linha=0;linha<3;linha++) {
		for(coluna=0;coluna<3;coluna++) {
			if (valores[linha][coluna]>0) {
				System.out.println("\n" + valores[linha][coluna]);
			}
		}
		
	}
	System.out.println("\nA quantidade de números maiores que 10 digitados foi de:" + maiorDez);
	}
	
}
