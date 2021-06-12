#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int cont, num, result;
	
	printf("Digite um numero: ");
	scanf("%d", &num);
	
	for (cont=0; cont<=10; cont++)
		{
			result = num * cont;
			printf("A tabuada do %d eh: %d x %d: %d\n\n", num, num, cont, result);
			
		}
		
	system("pause");
	return 0;
}
