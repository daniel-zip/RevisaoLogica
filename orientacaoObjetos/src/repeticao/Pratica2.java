package repeticao;

import java.util.Scanner;

public class Pratica2 {

	public static void main(String[] args) {
		Scanner inputUsuario = new Scanner(System.in);
		
		System.out.println("Cálculo para salário com bonificação e auxílio escola.");
		
		System.out.println();
		
		System.out.println("Informe o seu salário bruto: ");
		double salarioInicial = inputUsuario.nextDouble();
		
		//Cálculo para bonificação.
		double salarioBonificado = salarioInicial;
		
		if(salarioInicial <= 500) {
			salarioBonificado = salarioInicial + (salarioBonificado * 0.05);
			System.out.println("Sua bonificação é de: 5%");
		} else if(salarioInicial >= 501 && salarioInicial <= 1200) {
			salarioBonificado = salarioInicial + (salarioBonificado * 0.12);
			System.out.println("Sua bonificação é de: 12%");
		} else {
			System.out.println("Você não tem direito à bonificação");
		}
		
		//Cálculo para auxílio escola.
		double salarioTotal = salarioBonificado;
		
		if(salarioInicial <= 600) {
			salarioTotal = salarioBonificado + 150;
			System.out.println("Seu auxílio escola é de: R$150");
		} else {
			salarioTotal = salarioBonificado + 100;
			System.out.println("Seu auxílio escola é de: R$100");
		}
		
		System.out.println("O seu salário final é de: R$" + salarioTotal);
		
	}

}
