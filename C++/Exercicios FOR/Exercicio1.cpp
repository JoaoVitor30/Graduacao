#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int x, r, cont;
	
	printf("\n*** Multiplicacao de um numero X por 3 ***\n\n");
	
	for (cont=0; cont<5; cont++)
		{
			printf("\nDigite um valor para X: ");
			scanf("%d", &x);
			
			r = x * 3;
			
			printf("O valor de r eh: %d\n", r);
		}
	
	system("pause");
	return 0;
}
