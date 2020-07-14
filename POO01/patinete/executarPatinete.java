package patinete;

public class executarPatinete {
	
	public static void main (String args[])
	{
		
		patinete pat1 = new patinete ("Vermelho", "Teletubies", 5, 3, true);
		patinete pat2 = new patinete ("Azul", "Dipsy", 1, 7, false);
		

		System.out.println(pat1.mostrarDados());
		System.out.println("\n");	
		System.out.println(pat2.mostrarDados());
		
	}

}
