#include <stdio.h>
#include <stdlib.h>

	int main (int arcg, char* argv[])
	
{
	int vetA[12], vetB[12], i;
	
	for(i=0; i<12; i++)
		{
			printf("Digite um valor para o elemento da posicao %d: ", i);
			scanf("%d", &vetA[i]);
			vetB[i] = vetA[i] * vetA[i];
		}
		
	printf("\nQuadrado dos numeros lidos: \n");
	
	for(i=0; i<12; i++)
		{
			printf("%d\n", vetB[i]);
		}
		
	system("pause");
	return 0;
}
