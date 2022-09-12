package arrays.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void  main (String[]args) {

		/*2- Faça um programa que receba 6 números inteiros e mostre: 
	• Os números pares digitados;  
	• A soma dos números pares digitados; 
	• Os números ímpares digitados; 
	• A quantidade de números ímpares digitados.
*/

	int [] num = new int[6];
	int [] impares = new int[6];
	int [] pares = new int[6];
	int x,soma = 0;
	
	Scanner leitor = new Scanner (System.in);
	
	for (x=0;x<6;x++) {
		System.out.println("\nDigite um número inteiro:");
		num[x] = leitor.nextInt();
		
			if (num[x] % 2 == 0) {
			
				pares [x] = num[x];
			
				soma += pares [x];
				
			}else{
		
					impares[x] = num[x];
				}
			
	}
	
	System.out.println("\nOs números pares digitados foram: \n");
	
	for (x=0;x<6;x++) {
		if (pares[x]>0 ) {
		System.out.println("\n"+pares[x]);
		}
	}
	System.out.println("Os números ímpares digitados foram:\n");
	for (x=0;x<6;x++) {
		if(impares[x]>0) {
		System.out.println("\n" + impares[x]);
		}
	}
	System.out.println("\nA quantidade de números digitados ímpares foi de :" + impares.length);
	
	
}
}