package condicionais;

public class Exemplo1 {

	public static void main(String[] args) {
		boolean estudante = false;
		
		if(estudante) {
			System.out.println("Meia Entrada");
		}else {
			System.out.println("Entrada inteira");
		}

		/*
		 * NOTAS E CONCEITOS
		 * 8 - 10: A
		 * 6 - 7: B
		 * 4 - 5: C
		 * Menor que 4: D
		 */
		
		int nota = 2;
		
		if(nota >= 8) {
			System.out.println("Sua nota tem conceito A");
		}else if(nota >= 6) {
			System.out.println("Sua nota tem conceito B");
		}else if(nota >= 4) {
			System.out.println("Sua nota tem conceito C");
		}else {
			System.out.println("Sua nota tem conceito D");
		}
		
		/*
		 * Exibir o nome do mês com base no número:
		 * 1 - Janeiro
		 * 2 - Fevereiro
		 * N - etc.
		 */
		
		int mes = 3;
		switch(mes) {
			case 1:
				System.out.println("Janeiro");
				break;
				
			case 2:
				System.out.println("Fevereiro");
				break;
			
			default:
				System.out.println("Número inválido");
				break;
		}
	
	}

}
