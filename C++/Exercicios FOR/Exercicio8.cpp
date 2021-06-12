#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int cont;
	
	for (cont=999; cont<=1500; cont++)
		{
			if(cont % 2 == 1)
				printf("Cont: %d\n\n", cont);
		}
	system("pause");
	return 0;
}
