package java.modulo8e9;

import java.util.Scanner;

public class IfElsePratica3 {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador: ");
		nome = ler.nextLine();
		System.out.println("Digite a idade do doador: ");
		idade = ler.nextInt();
		System.out.println("Primeira doação de sangue?(True or False) ");
		primeiraDoacao = ler.nextBoolean();
		
		if((idade >= 18 && idade <= 59) || ((idade >= 60 && idade <= 69) && !primeiraDoacao)) {
			System.out.println(nome + "esta apto para doar sangue!"); }
		else {
			System.out.println(nome + "não esta apto para doar sangue!");
		}

	}

}
