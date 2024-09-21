package array;

import java.util.Scanner;

public class Exercicio3Output {

	public static void main(String[] args) {
		int i = 0;
		
		AcidenteDados arrayAcidentes[] = new AcidenteDados[5];
		Scanner input = new Scanner(System.in);

		for(i = 0; i < arrayAcidentes.length; i++) {
			AcidenteDados acidente = new AcidenteDados();
			
			System.out.println("Insira o código da cidade: ");
			acidente.setCodigo(input.nextInt());
			
			System.out.println("Insira o nome da cidade: ");
			acidente.setNome(input.next());
			
			System.out.println("Insira o número de veículos de passeio: ");
			acidente.setVeiculos(input.nextInt());
			
			System.out.println("Insira o número de acidentes de trânsito com vítimas: ");
			acidente.setAcidentes(input.nextInt());
			
			arrayAcidentes[i] = acidente;
			
		}
		
		int valorAtual = 0;
		AcidenteDados valorMinimo = arrayAcidentes[0];
		
		for(i = 0; i < arrayAcidentes.length; i++) {
			if(valorMinimo.getAcidentes() < valorAtual) {
				valorAtual = valorMinimo.getAcidentes();
			}
			System.out.println("Valor atual:" + valorAtual);
		}
		
	}

}
