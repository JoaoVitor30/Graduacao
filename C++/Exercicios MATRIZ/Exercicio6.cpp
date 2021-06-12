#include <stdio.h>
#include <Stdlib.h>

	int main (int argc, char* argv[])
	
{
	float A[4][7];
	int i, j, contl, contc, menor, maior;
	
	
	
	for(i=0; i<4; i++)
	{
		for(j=0; j<7; j++)
		{
			printf("Digite numeros reais: ");
			scanf("%f", &A[i][j]);
		}
	}


	menor = A[1][1];
	maior = A[2][2];
	
	for(i=0; i<4; i++)
	{
		for(j=0; j<7; j++)
		{
			if (A[i][j] < menor)
				menor = A[i][j];
			else
			
			if	(A[i][j] > maior)
				maior = A[i][j];
		}
	}
	
	for(i=0; i<4; i++)
	{
		for(j=0; j<7; j++)
		{
			if (A[i][j] == menor)
				printf("\n\nPosicao: %d,%d o menor valor: %5.1f\n\n", i, j, A[i][j]);
			if (A[i][j] == maior)
				printf("\n\nPosicao: %d,%d o maior valor: %5.1f\n\n", i, j, A[i][j]);
		}
	}
	
	system("pause");
	return 0;
	
}
	
	

