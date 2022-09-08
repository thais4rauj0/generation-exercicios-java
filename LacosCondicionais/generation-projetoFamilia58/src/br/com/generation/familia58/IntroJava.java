package br.com.generation.familia58;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IntroJava {

	public static void main(String[] args) {
		
		double n1, n2, n3, n4;
		double soma, media;
		int x;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Hello World!");
		
		System.out.println("Informe 4 números:");
		
		n1 = leitor.nextFloat();
		
		n2 = leitor.nextFloat();
		
		n3 = leitor.nextFloat();
		
		n4 = leitor.nextFloat();
		
		soma = n1 + n2 + n3 + n4;
		
		media = soma/4;
		
		System.out.println("Soma: " + soma);
		
		System.out.printf("Media: %.2f",media);
		
		
		if (media >= 7 && media<=10) {
			System.out.println("Aluna aprovada!");
		} else if(media>=5 && media<7) {
			System.out.println("Aluna de Exame!");
		} else {
			System.out.println("Aluna reprovada!");
		}
		
		System.out.println("Menu de incentivos");
		System.out.println("n1 - Você vai aprender!!!");
		System.out.println("n2 - Já deu certo!!!");
		System.out.println("n3 - Vai dar bom!!!");
		System.out.println("n4 - Com dedicação você vai além");
		System.out.println("Digite a opção:");
		
		x = leitor.nextInt();
		
		switch (x) {
		
		case 1: 
			System.out.println("Você vai aprender!");
			break;
			
		case 2:
			System.out.println("Já deu certo/");
			break;
			
		case 3:
			System.out.println("Vai dar Bom!");
			break;
		case 4:
			System.out.println("Com dedicação você vai além!");
			break;
			
		default: 
			System.out.println("Opção Inválida!");
		}
		
		n1 = Math.sqrt(n2); // raiz quadrada
		n2 = Math.pow(n3, 4); //potenciação
		
	} 

}
