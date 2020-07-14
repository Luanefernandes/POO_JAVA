package contaBancaria;

public class executarContaBancaria {
	
	public static void main (String args[])
	{
		contaBancaria conta1 = new contaBancaria ("Luane",356952,569,285.256,1,0);
		
		System.out.println(conta1.mostrarDados());
		System.out.println(conta1.sacarDinheiro());
		System.out.println(conta1.depositarDinheiro());
		
	}

}
