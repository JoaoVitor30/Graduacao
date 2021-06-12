#include <stdio.h>
#include <stdlib.h>

int main (int argc, char *argv [])

{
	float nota1, nota2, media;
	
	printf("Digite a primeira nota: ");
	scanf("%f", &nota1);
	printf("Digite a segunda nota: ");
	scanf("%f", &nota2);
	
	media = (nota1 + nota2) / 2;
	
	printf("\n\nA media do aluno eh: %5.2f", media);
	
	 if (media < 7)
		printf("\n\nAluno reprovado!");
	else
		printf("\n\nAluno aprovado!\n");
	getch ();
	return 0;
	
	
	
}
