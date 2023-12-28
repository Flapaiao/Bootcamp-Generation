package java.modulo10a19;

import java.util.Scanner;

public class ForPratica {

	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
		
			int num1, num2;
			
			System.out.println("Para saber números multiplos de 3 e 5 informe dois numeros sendo o menor número primeiro!");
			System.out.println("\nInforme o primeiro número: ");
			num1 = leia.nextInt();
			System.out.println("\nInforme o segundo número: ");
			num2 = leia.nextInt();
			
			if(num1 >= num2) {
				System.out.println("\nIntervalo invalido");
			}
			for (int i = num1; i < num2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println("O número " + i + " é multiplo 3 e 5"); }
			}


	}

}
