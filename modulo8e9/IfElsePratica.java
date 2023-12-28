package java.modulo8e9;

import java.util.Scanner;

public class IfElsePratica {

	public static void main(String[] args) {
    int nA, nB, nC;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite o numero A: ");
		nA = ler.nextInt();
		System.out.println("\nDigite o numero B: ");
		nB = ler.nextInt();
		System.out.println("\nDigite o numero C: ");
		nC = ler.nextInt();
		
		if(nA + nB == nC) {
			System.out.println("\nA soma de A + B é igual a C"); }
		
		else if(nA + nB > nC) {
			System.out.println("\nA soma de A + B é maior do que C"); }
		else {
			System.out.println("\nA soma de A + B é menor do que C");
		}
		

	}

}
