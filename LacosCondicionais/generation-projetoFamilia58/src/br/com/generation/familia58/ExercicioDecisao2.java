package br.com.generation.familia58;

import java.util.Scanner;

public class ExercicioDecisao2 {
	public static void main (String[]args) {
		/*2- Faça um programa que entre com três números e coloque em ordem crescente.*/
		
		Scanner leitor = new Scanner(System.in);
		int n1, n2, n3, m1 = 0, m2 = 0, m3 = 0;
		
		System.out.println("Digite 3 números: ");
		n1 = leitor.nextInt();
		n2 = leitor.nextInt();
		n3 = leitor.nextInt();
		
		if (n1 <= n2 && n1<= n3 && n2 <= n3) {
			System.out.println("\n" + n1 + "\n" + n2 + "\n" + n3);
		}else if (n1<= n2 && n1 <= n3 && n1<= n2) {
			System.out.println("\n"+ n1 +"\n" + n3 +"\n" + n2);
		}else if (n2 <= n1 && n2 <= n3 && n1 <= n3) {
			System.out.println("\n" + n2 + "\n" + n1 + "\n" + n3);
		}else if (n2<= n1 && n2 <= n3 && n3<= n1) {
			System.out.println("\n" + n2 + "\n" + n3 + "\n" + n1);
		}else if (n3<= n1 && n3<=n2 && n1<= n2) {
			System.out.println("\n" + n3 + "\n" + n1 + "\n" + n2);
		}else if (n3<=n1 && n3<=n2 && n2<=n1) {
			System.out.println("\n" + n3 + "\n" + n2 + "\n" + n1);
		}
	
	}

}
