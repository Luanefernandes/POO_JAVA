package AULA03;

public class Animal {
	
	public String nome;
	public int idade;
	public String emitirSom;
	public String acao;
	
	public Animal (String nome, int idade, String emitirSom, String acao )
	{
		this.nome = nome;
		this.idade = idade;
		this.emitirSom = emitirSom;
		this.acao = acao;
	}
	
	public Animal ()
	{	
	}
	
	public void emitirSom() {
		System.out.println("Fazendo barulho de " + this.getNome() + "!");
	}
	
	public void agir() {
		System.out.println(this.getNome() + "....Ele vai correrrr!!!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	

	
	

}
