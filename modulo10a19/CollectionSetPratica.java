package java.modulo10a19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSetPratica {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
		System.out.println("Digite 10 números inteiros não repetidos: \n");
		for(int i = 0; i < 10; i++) {
			System.out.println("Número " + (i+1) + ": ");
			int valor = leia.nextInt();
			if(!numeros.contains(valor)) {
				numeros.add(valor); }
			}
		
		System.out.println("\nLista Collection Set: ");
		Iterator<Integer> inumeros = numeros.iterator();
		while(inumeros.hasNext()) {
			System.out.println(inumeros.next());
		}

	}

}
