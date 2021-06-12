#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int cont, num, soma;
	
	printf("Digite um numero: ");
	scanf("%d", &num);
	
	for(cont=0, soma=0; cont<num; cont++)
		{ 
			soma = cont + num;	
		}
		
	printf("\nA soma eh: %d\n\n", soma);
		
	system("pause");
	return 0;
}
