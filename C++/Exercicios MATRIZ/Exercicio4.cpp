#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char * argv [])
{
	float notas [3] [3], menor;
	int pm, i,j;
	for (i=0;i<3;i++)
	{
		for (j=0;j<3;j++)
		{
			printf ("\n Digite a %d nota do aluno %d: ", j+1,i+1);
			scanf ("%f", &notas [i] [j]);
		}
	}
	for (i=0;i<3;i++)
	{
		printf ("\nAluno numero %d : ", i+1);
		menor = notas [i][0];
		pm = 0;
		for (j=0;j<3;j++)
		{
			if (notas [i][j] < menor)
			{
				menor = notas [i][j];
			 	pm = j;	
			}
		}
			printf ("\n Amenor nota do Aluno %d foi na %da. prova.\n\n", i+1,pm+1);
	}	
	system ("pause");
	return 0;
}
