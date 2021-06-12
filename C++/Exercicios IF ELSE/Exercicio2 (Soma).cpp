#include <stdio.h>
#include <stdlib.h>

int main (int argc, char* argv[])

{
	float num1, num2, soma;
	printf("Digite o primeiro numero: ");
	scanf("%f", &num1);
	printf("Digite o segundo numero: ");
	scanf("%f", &num2);
	
	soma = num1 + num2;
	
	if (soma > 15)
		printf("\n\n%5.2",soma);
	getch (soma);
	return 0;
	
}
