package AULA03;

public class TesteAnimal {
	
	public static void main (String args[])
	{
		int n = (int)(Math.random()*3.0);
		System.out.println(n);
		
		switch(n)
		
		{
		case 0: 
					
			Animal dog = new cachorro("Doguíneo ", 8, "au auuuuuu....", "correr");
			dog.emitirSom();
			dog.agir();
			System.out.println("");
			break;
			
		case 1: 
			Animal horse = new cavalo("Pé de pano", 18, "IIIIRIIIN RIN", "correr");
			horse.emitirSom();
			horse.agir();
			System.out.println("");
			break;
			
		case 2: 
			Animal pri = new preguiça("Priscila Preguiçosa ", 12, "A preguiça não fala nada...", "Sobe em árvores");
			pri.emitirSom();
			pri.agir();
			System.out.println("");
			break;
			
		default: System.out.println("Inexistente...");
		
		}
		
		
	}

}
