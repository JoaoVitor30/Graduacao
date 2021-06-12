#include <stdio.h>
#include <Stdlib.h>

	int main (int argc, char* argv[])
	
{
	float num,fatorial;
	
	printf("Digite um numero: ");
	scanf("%f", &num);
	
	fatorial = 1;
	
	while (num != 0)
	{
		fatorial = fatorial * num;
		num = num - 1;	
		
		printf("\nO fatorial eh: %5.0f\n", fatorial);
		
		printf("\nDigite um numero: \n");
		scanf("%f", &num);
	
		
	}

	system("pause");
	return 0;
}
