#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	float velomot, velomax, total;
	
	
	printf("Informe a velocidade do motorista: ");
	scanf("%f", &velomot);
	printf("Informe a velocidade maxima da avenida: ");
	scanf("%f", &velomax);
	
	total = velomot - velomax;
	
	if (total > 0 && total <=10)
		printf("Multa de 50 reais\n\n");
	else
	
	if (total > 10 && total <=30)
		printf("Multa de 100 reais\n\n");
	else
	
	if (total > 30)
		printf("Multa de 200 reais\n\n");
	else
		printf("Velocidade normal\n\n");
		
	
	system("pause");
	return 0;
	
}	
