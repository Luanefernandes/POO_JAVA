package AULA02;

public class texteExe12 {
	
	public static void main (String args[]) {
		
		exe_01 Joanete = new exe_01("Joanete","Rua Pedrolina","(11)9856-3214");
		exe_02 Clodoaldo = new exe_02(8563.25, 236.21, "Clodoaldo", "Rua Jamais", "(23)8569-7451");
		exe_01 Clarivalda = new exe_02 (863.25, 36.21, "Clarivalda","Rua Falsiane","(85)2365-7451");
		
		System.out.println("NOME: " + Joanete.getNome());
		System.out.println("ENDEREÇO: " + Joanete.getEndereco());
		System.out.println("TELEFONE: " + Joanete.getTelefone());
		System.out.println("...................................");
		
		System.out.println("\nNOME: " + Clodoaldo.getNome());
		System.out.println("ENDEREÇO: " + Clodoaldo.getEndereco());
		System.out.println("TELEFONE: " + Clodoaldo.getTelefone());
		System.out.println("Seu valor de credito é: " + Clodoaldo.getValorCredito());
		System.out.println("Sua divida é: " + Clodoaldo.getValorDivida());
		System.out.println("Saldo atual:" + Clodoaldo.obterSaldo());
		System.out.println("...................................");
		
		System.out.println("\nNOME: " + Clarivalda.getNome());
		System.out.println("ENDEREÇO: " + Clarivalda.getEndereco());
		System.out.println("TELEFONE: " + Clarivalda.getTelefone());
	
		
		
	}

}
