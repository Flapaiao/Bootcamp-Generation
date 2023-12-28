package java.modulo10a19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaPratica {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> agenda = new LinkedList<String>();
		
		int op;
		
		do {
			System.out.println("\n------------------------------");
			System.out.println("\n\t\tMenu de Agendamento");
			System.out.println("\n1 - Adicionar Cliente");
			System.out.println("\n2 - Listar de Agendamento");
			System.out.println("\n3 - Chamar próximo cliente");
			System.out.println("\n0 - Sair");
			System.out.println("\n------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do cliente: ");
				agenda.add(leia.nextLine());
				System.out.println("\nCliente adicionado!");
				break;
			case 2:
				System.out.println("\nLista de agendamento: \n" + agenda);
				break;
			case 3:
				if(agenda.isEmpty()) {
					System.out.println("\nA fila está vazia!"); }
				else {
				leia.nextLine();
				System.out.println("\nNome: " + agenda.remove() + ", atendimento concluído!"); }
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				break; }
		}
		while(op != 0);

	}

}
