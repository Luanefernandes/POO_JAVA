package AULA03;

public class pregui�a extends Animal {
	
	public pregui�a(String nome, int idade, String emitirSom, String acao)
	{
		super(nome, idade, emitirSom, acao);
	}
	
	public void emitirSom ()
	{
		System.out.println(this.getNome() + " quer dormir.... shhhhhhhhhhh..........");
	}

}
