package exercicios.lacoRepeticao;

import java.util.Scanner;

public class ExercicioWhile4 {

	public static void main(String[] args) {

		/*
		 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
		 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as
		 * opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa
		 * era agressiva). Pede-se para elaborar um sistema que permita ler os dados de
		 * 150 pessoas, calcule e mostre: (WHILE)  o número de pessoas calmas;v  o
		 * número de mulheres nervosas v;  o número de homens agressivos v;  o número
		 * de outros calmosv;  o número de pessoas nervosas com mais de 40 anosv;  o
		 * número de pessoas calmas com menos de 18 anos.v
		 */

		int idade, sexo, op, cont = 0, pC = 0, mN = 0, hA = 0, oC = 0, pN40 = 0, pC18 = 0;

		Scanner leitor = new Scanner(System.in);

		while (cont < 2) {

			System.out.println("Informe sua idade:");
			idade = leitor.nextInt();

			System.out.println("informe seu sexo: \n 1 - feminino \n 2- Masculino \n 3 - Outros");

			sexo = leitor.nextInt();

			System.out.println(
					"Informe a opção com a qual você se identifica: \n 1- Calma \n 2- Nervosa \n 3- Agressiva");

			op = leitor.nextInt();

			if (op == 1) {

				pC++;
			}

			if (op == 1 && idade <= 18) {
				pC18++;
			}

			if (sexo == 1 && op == 2) {
				mN++;
			} else if (sexo == 2 && op == 3) {
				hA++;
			} else if (sexo == 3 && op == 1) {

				oC++;
			}

			if (idade >= 40 && op == 2) {
				pN40++;
			}

			cont++;
		}

		System.out.println("O numero de pessoas calmas: " + pC);

		System.out.println("O número de mulheres nervosas: " + mN);

		System.out.println("O número de homens Agressivos: " + hA);

		System.out.println("O número de Outros Calmos: " + oC);

		System.out.println("O número de pessoas nervosas com mais de 40 anos: " + pN40);

		System.out.println("O número de pessoas calmas com menos de 18 anos: " + pC18);
	}

}
