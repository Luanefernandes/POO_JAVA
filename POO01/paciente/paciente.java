package paciente;

public class paciente {
	
	public String nomePaciente;
	public String procedimento;
	public int idade;
	public String classificacao;
	
	public paciente(String nome, String proced, int anos, String classi)
	{
		nomePaciente = nome;
		procedimento = proced;
		idade = anos;
		classificacao = classi;
	}
	
	public String mostrarDados() {
		if (idade>18) {
			classificacao = "adulto";
			
		} else {
			classificacao = "infantil";
		}
		String infos = "Paciente: "+nomePaciente+"\nProcedimento: "+procedimento+"\nIdade: "+idade+"\nClassificação: "+classificacao;
		return infos;
	}
	
	

}
