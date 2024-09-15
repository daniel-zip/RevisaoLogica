package repeticao;

public class LacoWhile {

	public static void main(String[] args) {
		int numeroTabuado = 1;
		int i = 0;
		
		//Tabuada de todos os números entre 1 e 20
		while(numeroTabuado <= 20) {
			i=0;
			
			while(i <= 10) {
				System.out.println(numeroTabuado + " x " + i + " = " + (numeroTabuado * i));
				i++;
			}
			
			numeroTabuado++;
			
		}

	}

}
