package AULA02;

public class exe_01 {
	
	public String nome;
	public String endereco;
	public String telefone;
	
	public exe_01 (String nome, String endereco, String telefone) {
	
	this.nome = nome;
	this.endereco = endereco;
	this.telefone = telefone;
	
	}
	
	public exe_01 (String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}

