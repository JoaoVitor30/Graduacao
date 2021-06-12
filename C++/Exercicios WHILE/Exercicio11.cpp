#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	float soma, impar, cont;
	int num;
	
	cont = 0;
	impar = 1;
	
	while (cont <= 20)
	{
		printf("Digite um numero: ");
		scanf("%d", &num);
		
		if (num % 2 == 0)
			soma = soma + num;
		else
			impar = impar * num;
			
		cont = cont + 1;
		
	}
	printf("\nSoma dos pares: %5.0f\n\n", soma);
	printf("\nProduto dos impares: %5.0f\n\n", impar);
	
	system ("pause");
	return 0;
}
