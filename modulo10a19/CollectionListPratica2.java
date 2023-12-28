package java.modulo10a19;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionListPratica2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Aqui temos números de 1 a 10 fora de ordem.");
		System.out.println("\nDigite um número que te daremos a posição: ");
		int numero = leia.nextInt();
		
		boolean encontrado = false;
		for(int i = 0; i < numeros.size(); i++) {
			if(numeros.get(i).equals(numero)) {
				System.out.println("\nO número " + numero + " está na posição: " +(i+1));
				encontrado = true; }
		}
		
		if(!encontrado) {
			System.out.println("\nO número " + numero + " não foi encontrado!"); }

	}

}
