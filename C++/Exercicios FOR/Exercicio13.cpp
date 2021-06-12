#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int cont, soma;
	
	
	for(cont=10, soma=0; cont<=20; cont++)
		{
			if (cont % 2 == 0)
				
				soma = soma + cont;
		}
		
	printf("A somatoria eh: %d\n\n", soma);
	
	system("pause");
	return 0;
}
