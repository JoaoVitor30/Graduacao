#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char * argv [])
{
	int mat [2] [3], i, j;
	
	for(i=0; i<2; i++)
	{
		for(j=0; j<3; j++)
		{
			printf("Digite um valor para o %do. elemento da linha %d, coluna %d: ", j+1, i+1, j+1);
			scanf("%d", &mat [i] [j]);
		}
	}
	
	printf("\n Os valores lidos sao: \n");
	
	for(i=0; i<2; i++)
	{
		for(j=0; j<3; j++)
		{
			printf("%d  \n", mat[i] [j]);
		}
	}
	
	system("pause");
	return 0;
}
