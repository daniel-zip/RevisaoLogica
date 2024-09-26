package array;

public class AvaliacaoN1 {

	public static void main(String[] args) {
		double numeros[] = {7, 6.2, 0, 7.4, 8, 10, 8.2, 9.2, 5};
		double somaNumeros = 0;
		double mediaNumeros;
		int i;
		
		
		// a) Exiba todos os números do vetor
		System.out.println("1) Elementos do array: ");
		for(i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "|");
		}
		
		System.out.println("");
		System.out.println("");
		
		// b) Calcule a soma de todos os elementos do vetor
		for(i = 0; i < numeros.length; i++) {
			somaNumeros += numeros[i];
		}
		System.out.println("2) Soma dos números do vetor: " + somaNumeros);
		
		System.out.println("");
		
		// c) Calcule a média de todos os elementos do vetor
		mediaNumeros = (somaNumeros / numeros.length);
		System.out.println("3) Média dos números do vetorr: " + mediaNumeros);
		
		System.out.println("");
		
		// d) Exiba na tela a dobro de cada nota do vetor.
		System.out.println("4) Dobro de cada valor do vetor: ");
		for(i = 0; i < numeros.length; i++) {
			System.out.print((numeros[i] * 2) + "|");
		}
		
		System.out.println("");
		System.out.println("");
		
		// e) Mostre o índice e o valor do maior elemento do vetor
		double valorMaximo = numeros[0];
		
		for(i = 0; i < numeros.length; i++) {
			if(numeros[i] > valorMaximo) {
				valorMaximo = numeros[i];
			}
			
		}
		
		for(i = 0; i < numeros.length; i++) {
			if(valorMaximo == numeros[i]) {
				System.out.println("5) Maior valor do vetor: " + valorMaximo);
				System.out.println("Localizado no índice: " + i);
			}
		
		}
		
	}

}