package exercicios.lacoRepeticao;

public class ExercicioFor1 {
	public static void main (String []args) {
		
		/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/
		
			int x=0;
			
			for (x=1000;x<=1999;x++) {
				
				if (x % 11 == 5) {
					
					System.out.println("\n" + x);
				}
				
			}
	}
}
