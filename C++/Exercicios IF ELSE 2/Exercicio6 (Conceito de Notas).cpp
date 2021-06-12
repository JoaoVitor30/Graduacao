#include <stdio.h>
#include <stdlib.h>

	int main (int argc , char* argv[])
	
	{
		float nota1, nota2, nota3, media ;
		
		printf("Digite a nota 1 : ");
		scanf ("%f", &nota1);
		
		printf ("Digite a nota 2 : ");
		scanf ("%f", &nota2);
		
		printf ("Digite a nota 3 : ");
		scanf ("%f",  &nota3);
		
			media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) /10;
			
		if (media >=8 && media == 10)
			printf("A media do aluno foi: %5.2f, que se enquadra no conceito A\n\n", media);
		
		else
		
		if (media >=7 && media < 8)
			printf("A media do aluno foi: %5.2f, que se enquadra no conceito B\n\n", media);
		
		else
		
		if (media >= 6 && media <7)
			printf("A media do aluno foi: %5.2f, que se enquadra no conceito C\n\n", media);
		
		else
		
		if (media >=5 && media < 6)
			printf("A media do aluno foi: %5.2f, que se enquadra no conceito D\n\n", media);
	
	    else 
			printf("A media do aluno foi: %5.2f, que se enquadra no conceito E\n\n", media);
		
		
		system ("PAUSE");
		return 0;				
	}
