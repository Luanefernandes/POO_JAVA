package funcionario;

public class funcionario {

	public String nomeFuncionario;
	public int numeroId;
	public String setor;
	
	public funcionario (String nome, int id, String set)
	{
		nomeFuncionario = nome;
		numeroId = id;
		setor = set;
	}
	
	public String mostrarDados() {
		String infos= "Nome do funcion�rio: "+nomeFuncionario+"\nN�mero de identifica��o: "+numeroId+"\nSetor de atua��o: "+setor;
		return infos;
	}
}
