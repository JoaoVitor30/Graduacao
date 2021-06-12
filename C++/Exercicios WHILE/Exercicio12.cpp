#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	float num, cont;
	
	printf("Digite um numero: ");
	scanf("%f", &num);
	
	cont = 0;
	
	while (num != 0)
	{
		cont = cont + num;
		
		printf("Digite um numero: ");
		scanf("%f", &num);
	}
	printf("O resultado eh: %5.0f\n\n", cont);
	
	system("pause");
	return 0;
}
