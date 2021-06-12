#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])

{
	char letra;
	
	letra = 'a';
	
	do
		{
			printf("O valor ASCII de %c: %d, e seu hexadecimal: %x\n", letra,letra,letra);
			letra++;
		}
		while (letra <='z');
		
	system("pause");
	return 0;
}
