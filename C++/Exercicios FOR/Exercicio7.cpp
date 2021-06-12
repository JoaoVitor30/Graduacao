#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int cont, fatorial;
	
	
	for (cont=1, fatorial=1; cont<=6; cont++)
		{
			fatorial = fatorial * cont;		
			
		}
		printf("Fatorial de 6 eh: %d\n\n", fatorial);
		
	system("pause");
	return 0;
}
