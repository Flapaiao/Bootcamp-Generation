package java;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		Scanner  leia = new Scanner(System.in);
		final int numero = 3;
		String nome = "Barbara Ribeiro";
		int idade = 34;
		float altura = (float) 1.67;

		System.out.println("\nMeu nome é: "+nome);
		System.out.println("\nEu tenho: "+idade+" anos de vida");
		System.out.println("\nEu tenho: "+altura+" metros de altura");

		System.out.println("\nEntre com seu nome: ");
		nome = leia.nextLine();
		System.out.println("\nEntre com sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nEntre com sua altura: ");
		altura = leia.nextFloat();

		System.out.println("\nMeu nome é: "+nome);
		System.out.println("\nEu tenho: "+idade+" anos de vida");
		System.out.println("\nEu tenho: "+altura+" metros de altura");


	}

}
