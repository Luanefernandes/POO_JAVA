package AULA03;

public class cachorro extends Animal {
	
		
	public cachorro(String nome, int idade, String emitirSom, String acao)
	{
		super(nome, idade, emitirSom, acao);
	}
	
	public void emitirSom ()
	{
		System.out.println(this.getNome() + "não para de latir.... AU AU AU");
	}

}
