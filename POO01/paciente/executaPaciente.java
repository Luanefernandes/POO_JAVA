package paciente;

public class executaPaciente {
	
	public static void main (String args[]) {
		
		paciente pac1 = new paciente("Joana da Silva","Cirurgia ginecol�gica",36,"x");
		paciente pac2 = new paciente("Roseclinda Amorencia","Remo��o verruga no cotovelo",15,"x");
		
		System.out.println(pac1.mostrarDados());
		System.out.println("\n");
		System.out.println(pac2.mostrarDados());
		
	}

}
