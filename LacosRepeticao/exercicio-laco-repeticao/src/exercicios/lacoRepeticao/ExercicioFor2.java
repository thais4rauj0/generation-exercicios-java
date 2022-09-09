package exercicios.lacoRepeticao;

import java.util.Scanner;

public class ExercicioFor2 {
	
	public static void main (String[]args) {
		/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

		int num, x, contPar=0, contImpar=0;
		
		Scanner leitor = new Scanner (System.in);
		
		
		for (x=0;x<=9;x++) {
			
			System.out.println("Informe um número:");
			num = leitor.nextInt();
			
			if(num %2 ==0) {
				contPar++;
			}else if(num%2 >=1) {
				contImpar++;
			}
		}
		
		System.out.println("\nO total de números pares digitados foi de:" + contPar);
		System.out.println("\nO total de números ímpares digitados foi de:" + contImpar);
		
	}
	
}
