package introducao;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa("Ana Banana", "aninha@email.com", 17);
		
		p1.setNome("Daniel");
		p1.setEmail("danimel@outlook.com");
		p1.setIdade(20);
		
		p2.setNome("Mariah");
		p2.setEmail("mariahcaria@email.com");
		p2.setIdade(32);
		
		System.out.println("Relação de alunos:");
		System.out.println("Nome: " + p1.getNome());
		System.out.println("E-Mail: " + p1.getEmail());
		System.out.println("Idade: " + p1.getIdade());
		
		System.out.println();
		
		System.out.println("Nome: " + p2.getNome());
		System.out.println("E-Mail: " + p2.getEmail());
		System.out.println("Idade: " + p2.getIdade());
		
		System.out.println();
		
		System.out.println("Nome: " + p3.getNome());
		System.out.println("E-Mail: " + p3.getEmail());
		System.out.println("Idade: " + p3.getIdade());
		
		System.out.println();
	}
}
