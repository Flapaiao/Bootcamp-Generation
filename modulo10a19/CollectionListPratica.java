package java.modulo10a19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionListPratica {

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList();
		
		System.out.println("Digite 5 cores: \n");
		for(int i = 0; i < 5; i++) {
			System.out.println("Cor " + (i+1) + ": ");
			String cor = leia.nextLine();
			cores.add(cor); }
		
		System.out.println("\nCores adicionadas: \n");
		for(String cor:cores) {
			System.out.println(cor); }
		
		Collections.sort(cores);
		System.out.println("\nCores em ordem crescente: \n");
		for(String cor:cores) {
			System.out.println(cor); }

	}

}
