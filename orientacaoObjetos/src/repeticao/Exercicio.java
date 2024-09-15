package repeticao;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner inputUsuario = new Scanner(System.in);
		
		//Tabuada de um número qualquer, quantas vezes o usuário quiser
		int entradaRespostaInicial = 1;
		int entradaResposta = entradaRespostaInicial;
		
		//entradaResposta vai mudar no final da pergunta se o usuário vai continuar calculando ou não
		while(entradaResposta == 1) {

				System.out.println("Digite um número para ser calculado a tabuada: ");
				int entradaNumero = inputUsuario.nextInt();
				
				for(int i = 0; i <= 10; i++) {
					System.out.println(entradaNumero + " x " + i + " = " + (entradaNumero * i));
				}
				
				System.out.println("Digite '1' para calcular outro número ou digite qualquer outra tecla para"
						+ " sair do programa: ");
				entradaResposta = inputUsuario.nextInt();
				
		}
		
		System.out.println("Você saiu do programa. ₢DanimelEnterprise");
		
	}

}