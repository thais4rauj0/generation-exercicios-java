package arrays;

import java.util.Scanner;

public class Array {

	public static void main (String[] args) {
	
		float [] media = new float[3];
		float n1,n2,n3,somaMedia=0,mediaGeral=0;
		int x;
		
		Scanner leitor = new Scanner(System.in);
		
		for (x=0;x<3;x++) {
			System.out.println("Digite a primeira nota:");
			n1 = leitor.nextFloat();
			System.out.println("Digite a segunda nota:");
			n2=leitor.nextFloat();
			System.out.println("Digite a terceira nota:");
			n3=leitor.nextFloat();
			
			media[x] = (n1 + n2 + n3) /3;
			
			System.out.printf("\nMédia Aritmética: %.2f",media[x]);
			somaMedia += media[x];
			
		}
		mediaGeral = somaMedia /3;
		
		System.out.printf("\nA média geral: %.2f" , mediaGeral);
	}
}
