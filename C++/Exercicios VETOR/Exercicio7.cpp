#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int A[5], op, i;
	
	for(i=0; i<5; i++)
		{
			printf("Digite valores para A:");
			scanf("%d", &A[i]);
		}
	
	printf("\nDigite a opcao desejada:");
	printf("\n[0] <-- Finalizar o programa.");
	printf("\n[1] <-- Ordem direta.");
	printf("\n[2] <-- Ordem indireta.");
	printf("\n ");
	scanf("%d", &op);
	
	if(op == 0)
		{
			printf("\nPrograma finalizado\n\n");
		}
	else
	
	if(op == 1)
		{
			for(i=0; i<5; i++)
				{
				printf("\n%d\n", A[i]);
				}
		}
	else
	
	if (op == 2)
		{
			for(i=4; i>=0; i--)
				{
					printf("\n%d\n", A[i]);
				}
		}
	else
		printf("\nOpcao invalida!!\n\n");
	
	
	
	
	
	
	
	system("pause");
	return 0;
}
