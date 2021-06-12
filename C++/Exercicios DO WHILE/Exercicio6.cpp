#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int cont;
	
	cont = 100;
	
	do
		{
			cont = cont + 1;
			if (cont % 2 == 0)
			printf("Cont = %d\n\n", cont);	
		}
	while (cont<=200);
	
	system("pause");
	return 0;
}
