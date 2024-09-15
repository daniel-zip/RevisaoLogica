package introducao;

public class Pessoa {
	private String nome;
	private String email;
	private int idade;
	
	public Pessoa( ) {
		nome = "";
		email = "";
		idade = -1;
	}
	
	public Pessoa(String nome, String email, int idade) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void saudacao(String nome) {
		System.out.println("Bom dia " + nome);
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
