package AULA03;

public class cavalo extends Animal {
	
	public cavalo(String nome, int idade, String emitirSom, String acao)
	{
		super(nome, idade, emitirSom, acao);
	}
	
	public void emitirSom ()
	{
		System.out.println(this.getNome() + " não para de relinchar.... IIIIRIIIIN RIN");
	}

}
