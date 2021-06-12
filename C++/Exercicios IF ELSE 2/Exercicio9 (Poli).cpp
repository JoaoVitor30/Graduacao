#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	float a, b, c, poli;
	
	printf("Digite um valor para A: ");
	scanf("%f", &a);
	printf("\nDigite um valor para B: ");
	scanf("%f", &b);
	
	if ((a > 0) && (b > 0))
	{
		c = 30;
		poli = ((a*a) + (2*a*b) + (b*b) + (c*a*c));
		printf("\nO valor do polinomio eh: %5.1f\n\n", poli);
    }
    else
    
    if ((a > 0) && (b < 0))
    {
    	c = 0;
    	poli = ((a*a) + (2*a*b) + (b*b) + (c*a*c));
		printf("\nO valor do polinomio eh: %5.1f\n\n", poli);
	}
	else
	
	if ((a < 0) && (b > 0))
	{
		c = -1;
		poli = ((a*a) + (2*a*b) + (b*b) + (c*a*c));
		printf("\nO valor do polinomio eh: %5.1f\n\n", poli);
	}
	else
	
	if ((a < 0) && (b < 0))
	{
		c = ((a)*(b)*(1));
		poli = ((a*a) + (2*a*b) + (b*b) + (c*a*c));
		printf("\nO valor do polinomio eh: %5.1f\n\n", poli);
		
	}
	
	system ("pause");
	return 0;
}
