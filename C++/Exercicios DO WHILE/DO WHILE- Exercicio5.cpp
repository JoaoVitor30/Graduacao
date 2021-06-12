#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int cont, fatorial;
	
	fatorial = 1;
	cont = 1;
	
	do
		{
			fatorial = fatorial * cont;
			cont = cont + 1;
		}
	while (cont<=6);
	
	printf("O fatorial de 6 eh: %d\n\n", fatorial);
	
	system("pause");
	return 0;
}
