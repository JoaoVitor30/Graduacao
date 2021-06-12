#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int cont, num, result;
	
	cont = 0;
	
	printf("Digite um numero: ");
	scanf("%d", &num);
	
	do
		{
			result = num * cont;
			
			printf("A tabuada do %d eh: %d X %d = %d\n\n", num,num,cont,result);
			
			cont= cont + 1;
		}
	while (cont<=10);
	
	system("pause");
	return 0;
}
