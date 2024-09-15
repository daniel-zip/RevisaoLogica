package repeticao;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		
		Scanner inputUsuario = new Scanner(System.in);
		
		//Tabuada do 1 de exemplo
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		//Tabuada do 4
		for(int i = 0; i <= 10; i++) {
			System.out.println("4 x " + i + " = " + (4 * i));
		}
		
	}

}
