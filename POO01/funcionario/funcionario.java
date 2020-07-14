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
		String infos= "Nome do funcionário: "+nomeFuncionario+"\nNúmero de identificação: "+numeroId+"\nSetor de atuação: "+setor;
		return infos;
	}
}
