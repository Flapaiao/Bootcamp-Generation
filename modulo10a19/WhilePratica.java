package java.modulo10a19;

import java.util.Scanner;

public class WhilePratica {

	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
		
			int idade, menor21 = 0, maior50 = 0;
			
			System.out.println("Programa para determinar menores que 21 anos e maiores que 50 anos");
			System.out.println("\nPara finalizar o programa basta colocar uma idade negativa!");
			System.out.println("\nDigite a idade: ");
			idade = leia.nextInt();
			
			while(idade >= 0) {
				System.out.println("\nDigite a idade: ");
				idade = leia.nextInt();
				if(idade <= 21) {
					menor21++; }
				else if(idade >= 50) {
					maior50++; }
			}
			
			System.out.println("Total de pessoas menores de 21 anos: " + menor21);
			System.out.println("Total de pessoas maiores de 21 anos: " + maior50);

	}

}
