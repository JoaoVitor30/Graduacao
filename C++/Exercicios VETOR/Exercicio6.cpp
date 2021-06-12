#include <stdio.h>
#include <stdlib.h>
	
	int main (int argc , char * argv[])
	
{
	int vet[10];
	int i;
	
	for(i=0; i<10; i++)
	{
		printf("Digite o numero da posicao %d : ", i);
		scanf("%d", &vet[i]);
	}
	
	for(i=0; i<10; i++)
		{
			if(vet[i] > 50)
				printf("\nNumero da posicao %d maior que 50\n\n", i);
			else
				printf("\nNumero da posicao %d nao atende as condicoes\n\n", i);
		}
		
	system("pause");
	return 0;
}
