#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int cont;
	
	for (cont=150; cont>=0; cont--)
		{
			if (cont % 5 == 0)
				printf("Cont: %d\n\n", cont);
		}
	system("pause");
	return 0;
}
