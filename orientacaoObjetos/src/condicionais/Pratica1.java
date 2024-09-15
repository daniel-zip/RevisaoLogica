package condicionais;

import java.util.Scanner;

public class Pratica1 {

	public static void main(String[] args) {
		Scanner inputUsuario = new Scanner(System.in);
		
		double notaMinima = 6;
		double frequenciaMinima = 80;
		
		System.out.println("Verifique se você foi aprovado ou reprovado baseado nos critérios de: ");
		System.out.println("Nota mínima: " + notaMinima);
		System.out.println("Frequência mínima: " + frequenciaMinima + "%");
		
		System.out.println();
		
		System.out.println("Digite a sua nota: ");
		double nota = inputUsuario.nextDouble();

		System.out.println("Digite a porcentagem de sua frequência: ");
		double frequencia = inputUsuario.nextDouble();
		
		if(nota < notaMinima && frequencia < frequenciaMinima) {
			System.out.println("Reprovado por nota e frequência.");
		} else if(nota < notaMinima) {
			System.out.println("Reprovado por nota.");
		} else if(frequencia < frequenciaMinima) {
			System.out.println("Reprovado por frequência.");
		} else {
			System.out.println("Aprovado");
		}
		
	}

}