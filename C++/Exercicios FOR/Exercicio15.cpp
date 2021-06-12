#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int cont, num, soma;
	float media;
	
	
	for(cont=1, soma=0; cont<=15; cont++)
		{
			printf("Digite um numero: ");
			scanf("%d", &num);
			
			soma = soma + num;
		}
	
	media = soma / 15;
	
	printf("\nA media eh: %5.1f\n\n", media);
	
	system("pause");
	return 0;
}
