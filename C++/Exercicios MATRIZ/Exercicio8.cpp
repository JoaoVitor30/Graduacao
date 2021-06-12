#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	float A[3][8][4], media, mediageral;
	int i, j, k, somatotal, cont, cont1;
	
	
	for(i=0; i<3; i++)
	{
		for(j=0; j<8; j++)
		{
			for(k=0; k<4; k++)
			{
				printf("Digite as notas dos alunos: ");
				scanf("%f", &A[i][j][k]);
			}
		}
	}
	
	cont = 0;
	cont1 = 1;
	
	for(i=0; i<3; i++)
	{
		mediageral = somatotal / 8;
		printf("\n\nA media da turma %d eh: %5.1f\n", cont1, mediageral);
		cont1 ++;
		mediageral = 0;
		somatotal = 0;
		
		
		for(j=0; j<8; j++)
		{
			printf("\nA Media do aluno %d eh: %5.1f\n", cont, media);
			media = 0;
			cont ++;
			
			for(k=0; k<4; k++)
			{
				media = media + A[i][j][k];
				media = media / 4;
				somatotal = somatotal + A[i][j][k];
			}
		}
	}
	
	system("pause");
	return 0;

}
	

