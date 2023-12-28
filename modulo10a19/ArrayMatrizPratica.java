package java.modulo10a19;

public class ArrayMatrizPratica {

	public static void main(String[] args) {
		int numMatriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		System.out.println("Elementos da Diagonal Principal: ");
		for(int i = 0; i < 3; i++) {
			System.out.print(numMatriz[i][i] + " "); }
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		for(int i = 0; i < 3; i++) {
			System.out.print(numMatriz[i][2 - i] + " "); }
		
		int somaDiagPrincipal = 0;
		for(int i = 0; i < 3; i++) {
			somaDiagPrincipal += numMatriz[i][i]; }
		
		System.out.println("\nSoma dos elementos da diagonal principal: " + somaDiagPrincipal);
		
		int somaDiagSecundaria = 0;
		for(int i = 0; i < 3; i++) {
			somaDiagSecundaria += numMatriz[i][2 - i]; }
		
		System.out.println("\nSoma dos elementos da diagonal secundria: " + somaDiagPrincipal);
		

	}

}
