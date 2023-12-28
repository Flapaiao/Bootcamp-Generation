package java.modulo10a19;

import java.util.Scanner;
import java.util.Stack;

public class PilhaPratica {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		int op;
		
		do {
			System.out.println("\n------------------------------");
			System.out.println("\n\t\tLista de livros");
			System.out.println("\n1 - Adicionar livro a lista");
			System.out.println("\n2 - Listar livros");
			System.out.println("\n3 - Retirar livro da lista");
			System.out.println("\n0 - Sair");
			System.out.println("\n------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do livro: ");
				livros.push(leia.nextLine());
				System.out.println("\nLivro adicionado!");
				break;
			case 2:
				System.out.println("\nLista de livros: \n" + livros);
				break;
			case 3:
				if(livros.isEmpty()) {
					System.out.println("\nLista de livros vazia!"); }
				else {
				leia.nextLine();
				System.out.println("\nLivro " + livros.pop() + " retirado"); }
			case 0: 
				System.out.println("\nPrograma Finalizado");
				break;
			default:
				break;
			}
		}
		while(op != 0);

	}

}
