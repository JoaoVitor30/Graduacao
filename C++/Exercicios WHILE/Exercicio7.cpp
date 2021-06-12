#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])

{
	float num, cont;
	
	printf("Digite um numero: ");
	scanf("%f", &num);
	cont = 1;
	
	while (num > 0)
	{
		cont = cont + 1;
		printf("\nDigite um numero: ");
		scanf("%f", &num);
	}
	printf("Foram digitados: %5.0f\n\n", cont);
	system ("pause");
	return 0;
}
