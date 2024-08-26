package view;

import br.edu.fateczl.calc.bubble.operations;

public class MainBubble 
{
	
	public static void main(String[] args) 
	{
		operations c = new operations();
		
		int[] vet = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
		
		vet = c.bublesort(vet);
		
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
