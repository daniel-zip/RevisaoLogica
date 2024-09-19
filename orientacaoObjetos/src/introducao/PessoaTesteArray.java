package introducao;

import java.util.Scanner;

public class PessoaTesteArray {

	public static void main(String[] args) {
		/*
		Pessoa p1 = new Pessoa("Jonata Santista", "jonatinha@outlook.com", 19);
		Pessoa p2 = new Pessoa("Danimelson Silveira", "danimel@outlook.com", 20);
		Pessoa p3 = new Pessoa("Cristiano Betuco", "crisdoti@outlook.com", 50);
		
		Pessoa arrayPessoa[] = {p1, p2, p3};
		 */
		
		int i = 0;
		
		Pessoa arrayPessoas[] = new Pessoa[3];
		Scanner input = new Scanner(System.in);
		
		for(i = 0; i < 3; i++) {
			Pessoa p = new Pessoa();
			
			System.out.println("Informe o nome da pessoa: ");
			p.setNome(input.next());
			
			System.out.println("Informe o email: ");
			p.setEmail(input.next());
			
			System.out.println("Informe a idade: ");
			p.setIdade(input.nextInt());
			
			arrayPessoas[i] = p;
		}
		
		
		// Mostre todas as informações de todas as pessoas
		// que estão no array
		
		for(i = 0; i < 3; i++) {
			System.out.println("Nome: " + arrayPessoas[i].getNome());
			System.out.println("E-mail: " + arrayPessoas[i].getEmail());
			System.out.println("Idade: " + arrayPessoas[i].getIdade());
			System.out.println();
		}
		
	}

}