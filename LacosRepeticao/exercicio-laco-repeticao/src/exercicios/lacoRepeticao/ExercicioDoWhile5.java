package exercicios.lacoRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile5 {
	
	public static void main (String []args) {
		
		/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
		
		int num, soma =0;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite um número");
		num = leitor.nextInt();
		
		do {
			soma += num;
			System.out.println("Digite um número");
			num = leitor.nextInt();
			
		}while(num!=0);
		
		System.out.println("A soma dos números diferentes de 0 é de : " + soma);
		
		
	}

}
