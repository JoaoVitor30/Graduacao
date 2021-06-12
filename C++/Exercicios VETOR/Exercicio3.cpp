#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char * argv[])
	
{
	int vetA[5],i,soma=0,resto=0;
	
		for (i=0; i<5; i++)
		{
			printf ("Digite um valor para o elemento da posicao %d : ", i);
			scanf ("%d", &vetA[i]);
			
		}
	
		for(i=0; i<5; i++)
		{
			resto = vetA[i] % 2;
			if (resto != 0)
				soma = soma + vetA[i];
		}
		
		printf ("\nSoma dos elemtos impares: %d\n\n", soma);
		
		system ("pause");
		return 0;
		
}
