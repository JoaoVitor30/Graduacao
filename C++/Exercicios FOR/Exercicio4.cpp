#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int cont;
	
	for (cont=0; cont<10; cont+=3)
		{
			printf("Cont = %d\n", cont);
		}
		
	system("pause");
	return 0;
}
