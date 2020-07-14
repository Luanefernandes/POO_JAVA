package produtoEletronico;

public class exeProdutoEletro {
	
	public static void main (String args [])
	{
		
		produtoEletronico tv = new produtoEletronico ("Casas Bahia","Samsung",50,true);
		produtoEletronico tv2 = new produtoEletronico ("Magazine Luiza","LG",62,false);
		
		System.out.println(tv.mostrarDados());
		System.out.println(tv.desligarProduto());
		System.out.println("\n");
		System.out.println(tv2.mostrarDados());
		System.out.println(tv2.ligarProduto());
		
	}

}
