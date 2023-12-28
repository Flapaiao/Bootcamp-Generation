package java.modulo10a19;

import java.util.Scanner;

public class DoWhilePratica {

	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
		
			int num, soma = 0;
			
			System.out.println("Soma de números positivos"); 
			System.out.println("\nPara finalizar o programa, basta digitar 0");
			
			do {
				System.out.println("\nDigite um número: ");
				num = leia.nextInt();
				if(num > 0) {
					soma+=num;
				}
			}
			while(num != 0);{
				System.out.println("\nA soma dos números positivos é: " + soma);
			}

	}

}
