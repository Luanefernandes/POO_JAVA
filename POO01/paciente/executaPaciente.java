package paciente;

public class executaPaciente {
	
	public static void main (String args[]) {
		
		paciente pac1 = new paciente("Joana da Silva","Cirurgia ginecológica",36,"x");
		paciente pac2 = new paciente("Roseclinda Amorencia","Remoção verruga no cotovelo",15,"x");
		
		System.out.println(pac1.mostrarDados());
		System.out.println("\n");
		System.out.println(pac2.mostrarDados());
		
	}

}
