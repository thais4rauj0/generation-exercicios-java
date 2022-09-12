package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[]args) {
		
		int [][] numero = new int[2][3];
		int somaNumero=0,linha,coluna, somaDiagonal=0;
		
		Scanner leitor = new Scanner(System.in);
		
		for (linha=0;linha<2;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("\nEntre com um número: ");
				numero[linha][coluna] = leitor.nextInt();
				
				if(numero[linha][coluna]>0) {
					somaNumero += numero [linha][coluna];
				}
				
				somaDiagonal += numero[linha][linha];
			}

	}
		System.out.println("\nSoma dos números maiores que zero:" + somaNumero);
		System.out.println("\nSoma da diagonal principal: " + somaDiagonal);
}
}