#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int cont, fatorial;
	
	cont = 1;
	fatorial = 1;
	
	while (cont <= 5)
	{
		fatorial = fatorial * cont;
		cont = cont + 1;
		
	}
	
	printf("O fatorial de 5 eh: %d\n\n", fatorial);
	system("pause");
	return 0;
	
}	
