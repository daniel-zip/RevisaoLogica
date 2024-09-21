package array;

public class AcidenteDados {
	private int codigo;
	private String nome;
	private int veiculos;
	private int acidentes;

	public AcidenteDados() {
		
	}
	
	public AcidenteDados(int codigo, String nome, int veiculos, int acidentes) {
		this.codigo = codigo;
		this.nome = nome;
		this.veiculos = veiculos;
		this.acidentes = acidentes;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getVeiculos() {
		return veiculos;
	}


	public void setVeiculos(int veiculos) {
		this.veiculos = veiculos;
	}


	public int getAcidentes() {
		return acidentes;
	}


	public void setAcidentes(int acidentes) {
		this.acidentes = acidentes;
	}
	
}
