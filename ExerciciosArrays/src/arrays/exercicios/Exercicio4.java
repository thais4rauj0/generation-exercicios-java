package arrays.exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String[]args) {
		/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes 
		(2) subtrair a primeira matriz da segunda 
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes 
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor 
		da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
		 */
		
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		
		int op, linha, coluna;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("\nPreenchendo Matriz 1");
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("\nDigite o valor da linha " + linha + " e da coluna " + coluna);
				matriz1[linha][coluna] = leitor.nextFloat();
			}
		}
		
		System.out.println("\nPreenchendo Matriz 2");
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("\nDigite o valor da linha " + linha + " e da coluna " + coluna);
				matriz2[linha][coluna] = leitor.nextFloat();
			}
		}
		
		
		System.out.println("\nEscolha uma opção: \n (1) somar as duas matrizes \r\n"
				+ "		(2) subtrair a primeira matriz da segunda \r\n"
				+ "		(3) adicionar uma constante as duas matrizes\r\n"
				+ "		(4) imprimir as matrizes ");
		
			op = leitor.nextInt();
			
			switch(op) {
			
			case 1:
				
				float[][] soma = new float[2][2];
				
				for(linha=0;linha<2;linha++) {
					for(coluna=0;coluna<2;coluna++) {

						soma[linha][coluna] += matriz1[linha][coluna] + matriz2[linha][coluna];
						
						System.out.println("\nSoma das matrizes 1 e 2:"+ "\nLinha: " + linha + " e Coluna: "+coluna+" : " + soma[linha][coluna]);
					}
				}
		
				break;
			case 2:
				float[][] subtracao = new float[2][2];
				
				for(linha=0;linha<2;linha++) {
					for(coluna=0;coluna<2;coluna++) {

						subtracao[linha][coluna] += matriz1[linha][coluna] - matriz2[linha][coluna];
						
						System.out.println("\nSubtração das matrizes 1 e 2:"+ "\nLinha: " + linha + " e Coluna: "+coluna+" : " + subtracao[linha][coluna]);
					}
				}
				
				break;
			case 3:
				System.out.println("\nDigite uma constante para adicionar aos valores das matrizes:");
				
				final float constante1= leitor.nextFloat();
				
				for(linha=0;linha<2;linha++) {
					for(coluna=0;coluna<2;coluna++) {
						matriz1[linha][coluna] += constante1;
						matriz2[linha][coluna] += constante1;
	
					}
						
				}
				for(linha=0;linha<2;linha++) {
					for(coluna=0;coluna<2;coluna++) {
					
						System.out.println("\nMatriz 1:");
						System.out.println("\nLinha " + linha + " e Coluna " + coluna+" : " + matriz1[linha][coluna]);
					}
						
				}
				for(linha=0;linha<2;linha++) {
					for(coluna=0;coluna<2;coluna++) {
	
						System.out.println("\nMatriz 2:");
						System.out.println("\nLinha " + linha + " e Coluna " + coluna+" : " + matriz2[linha][coluna]);
					}
						
				}
				
				break;
			
			case 4:
				for(linha=0;linha<2;linha++) {
					for(coluna=0;coluna<2;coluna++) {
						System.out.println("\nMatriz 1");
						System.out.println("\nLinha " + linha + " e Coluna " + coluna +": " + matriz1[linha][coluna]);
					}
					}
				for(linha=0;linha<2;linha++) {
					for(coluna=0;coluna<2;coluna++) {
						System.out.println("\nMatriz 1");
						System.out.println("\nLinha " + linha + " e Coluna " + coluna +": " + matriz2[linha][coluna]);
					}	
			}
				break;
			default:
				System.out.println("\n Opção inválida");
				break;
	}

}
}
