package array;

public class Exemplo1 {

	public static void main(String[] args) {
		/*
		 * int []idades = new int[10;
		 * int idades[];
		 * idades = new int[10];
		 */
		int numeros[] = {6, 7, 20, 39, 28, 56, 24, 28, 15, 96, 4, 70};
		
		//Exiba na tela todos os elementos do array numeros
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		int idades[] = new int[10];
		
		idades[3] = 32;
		idades[2] = 20;
		
		System.out.println(idades[3]);
		System.out.println(idades[2]);
		System.out.println(idades[1]);

	}

}
