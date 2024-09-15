package condicionais;

import java.util.Scanner;

public class Pratica3 {

	public static void main(String[] args) {
		Scanner inputUsuario = new Scanner(System.in);
		
		int inputContinuar = 1;
		
		System.out.println("Digite o salário bruto: ");
		double salarioBruto = inputUsuario.nextDouble();
		double imposto = salarioBruto;
		double salarioReajustado = salarioBruto;
		
		do {
			System.out.println("Menu de opções:");
			System.out.println("1 - Imposto");
			System.out.println("2 - Novo salário");
			System.out.println("3 - Classificação");
			
			int input = inputUsuario.nextInt();
			switch (input) {
				case 1:
					if(salarioReajustado < 500) {
						imposto = (salarioReajustado * 0.05);
						System.out.println("O imposto sobre o salário de R$" + salarioReajustado + " é de 5%, com o valor de: R$" + imposto);
					} else if(salarioReajustado >= 500 && salarioReajustado <= 850) {
						imposto = (salarioReajustado * 0.1);
						System.out.println("O imposto sobre o salário de R$" + salarioReajustado + " é de 10%, com o valor de: R$" + imposto);
					} else if(salarioReajustado > 850) {
						imposto = (salarioReajustado * 0.15);
						System.out.println("O imposto sobre o salário de R$" + salarioReajustado + " é de 15%, com o valor de: R$" + imposto);
					}
					System.out.println();
					break;
					
				case 2:
					System.out.println("Digite o novo salário do funcionário: ");
					salarioReajustado = inputUsuario.nextDouble();
					if(salarioReajustado < 450) {
						salarioReajustado = (salarioReajustado + 100);
						System.out.println("Foi acrescido R&100,00 e o novo valor do salário do funcionário é de: R$" + salarioReajustado);
					} else if(salarioReajustado >= 450 && salarioReajustado < 750) {
						salarioReajustado = (salarioReajustado + 75);
						System.out.println("Foi acrescido R$75,00 e o novo valor do salário do funcionário é de: R$" + salarioReajustado);
					} else if(salarioReajustado >= 750 && salarioReajustado <= 1500) {
						salarioReajustado = (salarioReajustado + 50);
						System.out.println("Foi acrescido R$50,00 e o novo valor do salário do funcionário é de: R$" + salarioReajustado);
					} else if(salarioReajustado > 1500) {
						salarioReajustado = (salarioReajustado + 25);
						System.out.println("Foi acrescido R$25,00 e o novo valor do salário do funcionário é de: R$" + salarioReajustado);
					}
					break;
					
				case 3:
					if(salarioReajustado <= 700) {
						System.out.println("Funcionário tem o salário de R$" + salarioReajustado + " e é classificado como MAL REMUNERADO.");
					} else {
						System.out.println("Funcionário tem o salário de R$" + salarioReajustado + " e é classificado como BEM REMUNERADO.");
					}
					break;
					
				default:
					System.out.println("Opção inválida.");
					break;
			}
			System.out.println("Para continuar no programa digite 1 ou pressione qualquer outra tecla para sair.");
			inputContinuar = inputUsuario.nextInt();
			
		} while(inputContinuar == 1);
		
		System.out.println("Você saiu do programa");
		
	}
	
}
