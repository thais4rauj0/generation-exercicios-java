package arrays.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String[]args) {
		
		/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
		 * O programa deve executar os seguintes passos: 
			*(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
			(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
			(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
			(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/
	
		int [] A = new int[6];
		int x, soma, posicao=0;
		
		Scanner leitor = new Scanner (System.in);
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5]=7;
		
		soma = A[0] + A[5];
		
		System.out.println("\nSoma de A[0] e A[5]: " + soma);
		
		A[3] = 100;
		
		for(x=0;x<6;x++) {
			
			posicao++;
			
			System.out.println("\nPosição "+ posicao +": " + A[x]);
		}
	}

}
