package aviao;

public class executarAviao {

	public static void main(String[] args) {

		aviao aviao1 = new aviao("LATAM",9,true);
		aviao aviao2 = new aviao("AZUL",99,false);
		
		System.out.println(aviao1.mostrarDados());
		System.out.println(aviao1.verificarStatus());
		
		System.out.println(aviao2.verificarStatus());
		System.out.println(aviao2.mostrarDados());
		
		
		

	}

}