#include <stdio.h>
#include <stdlib.h>

int main (int argc, char *argv [])

{
	float dias, total;
	char selo;
	
	printf("Digite os dias de locacao: ");
	scanf("%f", &dias);
	printf("Digite o selo do DVD (v- verde, a- azul, b- branco, r- rosa): ");
	scanf("%s", &selo);
	
	if (selo == 'v')
	   total = dias * 5.50;
	else
	
	if (selo == 'a')
	   total = dias * 5.70;
	else
	
	if (selo == 'b')
	   total = dias * 4.00;
	else
	
	if (selo == 'r')
	   total = dias * 3.50;
	   
	printf("O valor total foi: %5.2f\n\n", total);
	
	system ("PAUSE");
	return 0;
	
}
