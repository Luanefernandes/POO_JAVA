package AULA03;

public class preguiça extends Animal {
	
	public preguiça(String nome, int idade, String emitirSom, String acao)
	{
		super(nome, idade, emitirSom, acao);
	}
	
	public void emitirSom ()
	{
		System.out.println(this.getNome() + " quer dormir.... shhhhhhhhhhh..........");
	}

}
