package produtoEletronico;

public class produtoEletronico {
	
	public String lojaTV;
	public String marcaTV;
	public int polegadasTV;
	public boolean statusTV;
	
	public produtoEletronico (String loja, String marca, int polegadas, boolean status)
	{
		lojaTV = loja;
		marcaTV = marca;
		polegadasTV = polegadas;
		statusTV = status;
	}
	
	public String mostrarDados() {
		
		String infos = "Loja TV: "+lojaTV+"\nMarca TV: "+marcaTV+"\nPolegadas: "+polegadasTV+"\nStatus: "+statusTV;
		return infos;
	}
	
	public String ligarProduto() {
		statusTV = true;
		String status = "Ligando....\nA TV foi ligada!!!";
		return status;
	}

	public String desligarProduto() {
		statusTV = false;
		String status = "Desligando....\nA TV foi desligada!!!";
		return status;
	}
	

}