#include <stdio.h>
#include <stdlib.h>

int main (int argc, char *argv [])

{
	float num1, num2, mult;
	printf("Digite o primeiro numero: ");
	scanf("%f", &num1);
	printf("Digite o segundo numero: ");
	scanf("%f", &num2);
	
	mult = num1 * num2;
	

	
	if ((mult > 50) && (mult < 100))	
		printf("%5.2lf\n\n", mult);
	
	
	system ("PAUSE");
	return 0;
	
}
