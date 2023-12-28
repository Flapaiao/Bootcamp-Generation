package java.modulo8e9;

import java.util.Scanner;

public class SwitchCasePratica {

	public static void main(String[] args) {
		int codigoProduto, quantidade, valorTotal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n\tCardápio: ");
		System.out.println("\n1 - Cachorro quente - R$10.00");
		System.out.println("\n2 - X-Salada - R$15.00");
		System.out.println("\n3 - X-Bacon - R$18.00");
		System.out.println("\n4 - Bauru - R$ 12.00");
		System.out.println("\n5 - Refrigerante - R$8.00");
		System.out.println("\n6 - Suco de Laranja - R$13.00");
		System.out.println("\nDigite o código do produto: ");
		codigoProduto = ler.nextInt();
		System.out.println("\nDigite a quantidade: ");
		quantidade = ler.nextInt();
		
		
		switch(codigoProduto) {
		case 1:
			System.out.println("Produto: Cachorro Quente \nValor total: R$ " + (10.00 * quantidade));
            break;
		case 2:
			System.out.println("Produto: X-Salada \nValor total: R$ " + (15.00 * quantidade));
            break;
		case 3:
			System.out.println("Produto: X-Bacon \nValor total: R$ " + (18.00 * quantidade));
            break;
		case 4:
			System.out.println("Produto: Bauru \nValor total: R$ " + (12.00 * quantidade));
            break;
		case 5:
			System.out.println("Produto: Refrigerante \nValor total: R$ " + (8.00 * quantidade));
            break;
		case 6:
			System.out.println("Produto: Suco de Laranja \nValor total: R$ " + (13.00 * quantidade));
            break;
        default:
        	System.out.println("Código Inválido");
		}

	}

}
