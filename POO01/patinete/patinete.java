package patinete;

public class patinete {
	
	public String corPat;
	public String marcaPat;
	public int velocidPat;
	public int incremVelocid;
	public boolean status1;
	
	public patinete(String cor, String marca, int velocidade, int incremento, boolean status)
	{
		corPat = cor;
		marcaPat = marca;
		velocidPat = velocidade;
		incremVelocid = incremento;
		status1 = status;
	}
	
	public String mostrarDados() {
		
		String statusPatinete;
		if (status1 == false) {
			statusPatinete = "Este patinete está indisponível no momento.";
			
		} else {
			statusPatinete = "Este patinete está disponível para compra.";
		}
		
		velocidPat = velocidPat + incremVelocid;
		
		String informacao = "Cor: " + corPat + "\nMarca: " + marcaPat + "\nStatus: " + statusPatinete + "\nVelocidade Atual: "
				+ velocidPat + " KM/h" + "\nIncremento Velocidade: " + incremVelocid + " KM/h";
		
		return informacao;
	}
	


	}
	
	

