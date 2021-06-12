#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int A [8] [8], i, j;
	
	for(i=0; i<8; i++)
	{
		for(j=0; j<8; j++)
		{
			printf("Digite numeros inteiros: ");
			scanf("%d", &A [i] [j]);
		}
	}
	
	if(A[i][j] == A[j][i])
		printf("\nMatriz simetrica.\n\n");
	
	
	
	
	
	system("pause");
	return 0;
}
