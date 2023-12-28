package java.modulo10a19;

import java.util.Scanner;

public class ArrayVetorPratica {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int num, posicao = -1;
		
		System.out.println("Aqui temos números de 1 a 10 fora de ordem.");
		System.out.println("\nDigite um número que te daremos a posição: ");
		num = leia.nextInt();
		
		for(int contador = 0; contador < vetor.length; contador++)	{
			if(vetor[contador] == num) {
				posicao = contador; } 
		}
			
		if (posicao != -1) {
			System.out.println("\nO número " + num + " está na posição: " + posicao);
		}else {
			System.out.println("\nO número " + num + " não foi encontrado!");
		}

	}

}
