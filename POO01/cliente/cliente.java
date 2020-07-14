package cliente;

public class cliente {
	
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	public cliente (String primeiro, String meio, String ultimo)
	{
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	
	public String getnomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}

}
