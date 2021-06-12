#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	float num, cont;
	
	printf("Digite um numero: ");
	scanf("%f", &num);
	
	while (num != 0)
	{
		if (num >= 100 && num <=200)
			cont = cont + 1;
		else
			cont = cont + 0;
			
		printf("\nDigite um numero: ");
		scanf("%f", &num);

	}
	printf("Foram digitados: %5.0f\n\n", cont);
	system ("pause");
	return 0;
}
