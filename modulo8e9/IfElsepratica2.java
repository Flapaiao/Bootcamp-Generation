package java.modulo8e9;

import java.util.Scanner;

public class IfElsepratica2 {

	public static void main(String[] args) {
		int num;
		String resultado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		num = ler.nextInt();
		
		if(num % 2 == 0) {
		resultado = ("\nO número " +num+ " é par"); }
		else {
			resultado = ("\nO número " +num+ " é impar"); }
		
		if(num > 0) {
			resultado += (" e positivo"); }
		else {
			resultado += (" e negativo"); }
		
		System.out.println(resultado);

	}

}
