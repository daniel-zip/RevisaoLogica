package array;

public class Pratica1 {

	public static void main(String[] args) {
		int i;
		int somaImpares = 0;
		int somaPares = 0;
		
		int numeros[] = {9, 8, 1, 45, 89, 43, 55, 10, 12, 44, 68, 
				66, 70, 71, 73, 88, 90, 33, 76, 77, 98, 101, 123, 143, 155, 167, 190};
		
		// 1) Exibe na tela o tamanho do array
		System.out.println("1) Array de tamanho: " + numeros.length);
		
		System.out.println("");
		
		// 2) Exibe na tela todos os elementos do array numeros em ordem inversa
		System.out.println("2) Elementos do array em ordem inversa: ");
		for(i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i] + "|");
		}
		
		System.out.println("");
		System.out.println("");
		
		// 3) Exibe na tela somente os números pares
		System.out.println("3) Elementos do array que são números pares: ");
		for(i = 0; i < numeros.length; i++) {
			if((numeros[i] % 2) == 0) {
				System.out.print(numeros[i] + "|");
			}
		}
		
		System.out.println("");
		System.out.println("");
		
		// 4) Exibe na tela somente os números ímpares
		System.out.println("4) Elementos do array que são números ímpares: ");
		for(i = 0; i < numeros.length; i++) {
			if((numeros[i] % 2) != 0) {
				System.out.print(numeros[i] + "|");
			}
		}
		
		System.out.println("");
		System.out.println("");
		
		// 5) Exibe a subtração da soma dos elementos pares e ímpares
		// 5.1) Exibe a soma dos impares
		System.out.println("5) Soma de todos os números ímpares: ");
		for(i = 0; i < numeros.length; i++) {
			if((numeros[i] % 2) != 0) {
				somaImpares += numeros[i];
			}
		}
		System.out.println(somaImpares);

		System.out.println("");
		
		// 5.2) Exibe a soma dos pares
		System.out.println("6) Soma de todos os números pares: ");
		for(i = 0; i < numeros.length; i++) {
			if((numeros[i] % 2) == 0) {
				somaPares += numeros[i];
			}
		}
		System.out.println(somaPares);
		
		System.out.println("");
		
		// 5.3) Exibe a subtração da soma dos elementos pares e ímpares
		int subtracao = somaPares - somaImpares;
		System.out.println("7) Subtração da soma dos números pares - soma dos números ímpares: " + subtracao);
	}

}
