#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	float peso, pesoex, multa;
	
	printf("Informe o quilo do peixe: ");
	scanf("%f", &peso);
	
	if (peso > 50)
	{
		pesoex = peso - 50;
		printf("\nO peso em excesso foi de: %5.2f\n",pesoex );
		multa = pesoex * 4.00;
		printf("A multa eh de: %5.2f\n\n", multa);
	}
	else
		printf("Peso normal\n\n");
	
	
	system("pause");
	return 0;
	
	
	
}
