#include <stdio.h>
#include <stdlib.h>
	
	int main (int argc , char * argv[])
	
	{
		int vetA[10], vetB[10], i ,calculo;
		
		for (i=0; i<10; i++)
		{
			printf ("Digite um valor para o elemento da posicao %d : ", i);
			scanf ("%d", &vetA[i]);
		} 
		
		for (i=0; i<10; i++)
		{
			calculo = i%2;
			if (calculo==0)
				vetB[i] = vetA[i] * 5;
			else
				vetB[i] = vetA[i] + 5;	
		}
			printf ("\nResultado: \n");
			printf ("\nvetA vetB \n");
			
			for (i=0; i<10; i++)
			{
				printf ("%3d %5d\n", vetA[i], vetB[i]);
			}
			
		system ("pause");
		return 0;	
	}
