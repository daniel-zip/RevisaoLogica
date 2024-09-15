package repeticao;

import java.util.Scanner;

public class Pratica1 {

	public static void main(String[] args) {
		Scanner inputUsuario = new Scanner(System.in);
		
		System.out.println("Verifique se você foi aprovado ou reprovado baseado nos critérios de: ");
		System.out.println("Nota mínima: 6");
		System.out.println("Frequência mínima: 80%");
		
		System.out.println();
		
		System.out.println("Digite a sua nota: ");
		double nota = inputUsuario.nextDouble();

		System.out.println("Digite a porcentagem de sua frequência: ");
		double frequencia = inputUsuario.nextDouble();
		
		if(nota < 6 && frequencia < 80) {
			System.out.println("Reprovado por nota e frequência.");
		} else if(nota < 6) {
			System.out.println("Reprovado por nota.");
		} else if(frequencia < 80) {
			System.out.println("Reprovado por frequência.");
		} else {
			System.out.println("Aprovado");
		}
		
	}

}
