package AULA03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TesteList {
	
	public static void main (String args[])
	{
		Collection <String> nomes = new ArrayList();
		nomes.add("Antônio");
		nomes.add("Maria");
		nomes.add("Danilo");
		nomes.add("Bruno Moura");
		
		for(String name: nomes)
		{
			System.out.println("Lista de Nomes: "+name);
		}
		
		//Collection <String> nomes1 = Arrays.asList("Luis","Monique");
		
		//nomes.addAll(nomes1);
		
		/*System.out.println("Contém o valor Danilo? "+nomes.contains("Danilo"));*/
		
		
		/*if(nomes.isEmpty())
		{
			System.out.println("Lista vazia!!! :( ...");
		} else {
			System.out.println("Lista de nomes: "+nomes);
		}*/
		

	
	/*nomes.remove("Antônio");
	System.out.println("Lista de Nomes: "+nomes);
	
	
	nomes.clear();
	System.out.println("Lista de Nomes pós clear: "+nomes);*/
	
	}

}
