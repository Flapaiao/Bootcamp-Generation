package java.modulo8e9;

import java.util.Scanner;

public class OperadoresPratica2 {

	public static void main(String[] args) {
    Scanner  leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("\nInforme a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nInforme a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nInforme a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("\nInforme a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("\nA media é: \n" + media);

	}

}
