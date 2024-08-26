package view;

import br.edu.fateczl.calc.merse.operations;

public class MainMerse 
{
	public static void main(String[] args) 
	{
		operations c = new operations();
		
		int[] vet = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
		
		int inicio = 0;
		int fim = (vet.length - 1);
		
		vet = c.MergeSort(vet, inicio, fim);
		
		int cont = 1;
		
		for (int i:vet)
		{
			if (cont == (vet.length))
			{
				System.out.print(i);
			}
			else
			{
				System.out.print(i + ", ");
				cont++;
			}
		}	
	}
}
