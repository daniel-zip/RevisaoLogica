package repeticao;

public class LacoDoWhile {

	public static void main(String[] args) {
		int controle = 0;
		
		do {
			controle++;
			if(controle == 5) continue;
			System.out.println(controle);
			
		
		}while(controle <= 10);
		
		System.out.println("---------------");
		
		int controle2 = 0;
		while(controle2 <= 10) {
			if(controle2 == 5) break;
			System.out.println(controle2);
			controle2++;
		}

	}

}
