package AULA03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class loja {
	
	public static void main (String args[])
	
	{	
		Scanner leia = new Scanner(System.in);
		Collection<String> produtos = new ArrayList<String>();
		produtos.add("Ma�a");
		produtos.add("Pera");
		produtos.add("Vassoura");
		produtos.add("Sab�o");
		produtos.add("Roupa");
		
		
		int op;
		String novo;
		
		System.out.println("**************MENU***************");		
		System.out.println("[1] Armazenar dados");		
		System.out.println("[2] Remover dados");		
		System.out.println("[3] Atualizar dados");		
		System.out.println("[4] Apresentar dados");	
		System.out.println("[5] Encerrar");
		
		op = leia.nextInt();
		
		switch (op)
		
		{
		
		case 1:
			
			System.out.println("Seus produtos s�o: "+ produtos);
			System.out.println("Informe o que deseja armazenar: ");
			novo = leia.next();
			produtos.add(novo);			
			System.out.println("Seus produtos s�o: "+ produtos);
			
			break;
			
		case 2:
			
			System.out.println("Seus produtos s�o: "+ produtos);
			System.out.println("Informe o que deseja remover: ");
			novo = leia.next();
			produtos.remove(novo);
			System.out.println("Seus produtos s�o: "+ produtos);
			break;
		
		case 3:
			
			System.out.println("Seus produtos s�o: "+ produtos);
			System.out.println("Informe o que deseja atualizar: ");
			novo = leia.next();
			produtos.remove(novo);
			System.out.println("Forne�a nova informa��o: ");
			novo = leia.next();
			produtos.add(novo);
			System.out.println("Seus produtos s�o: "+ produtos);
			break;
			
		case 4:
			
			for (String p: produtos) 
			{
				System.out.println(p);
			}
			break;
			
		case 5:
			
			System.out.println("Fim!");
			
		}
		
				
	}

}
