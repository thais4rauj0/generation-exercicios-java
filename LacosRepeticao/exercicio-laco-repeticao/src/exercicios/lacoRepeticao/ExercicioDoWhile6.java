package exercicios.lacoRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile6 {
	
	public static void main (String []args) {
		
		/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
		
		int num, media=0 , soma=0, cont=0;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		
		num = leitor.nextInt();
		
		do {
			 
			
			if (num%3==0) {
				soma+=num;
				cont++;
			}
			
			System.out.println("Digite um número:");
			
			num = leitor.nextInt();
			
		}while(num!=0);
		
		media = soma/cont;
		
		System.out.println("A média dos números múltiplos de 3 é de: " + media);
		
	}

}
