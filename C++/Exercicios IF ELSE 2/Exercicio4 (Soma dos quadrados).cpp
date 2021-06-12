#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char * argv [])
	
	{
		float num1, num2, num3, resultado;
		
			printf ("Digite o primeiro numero : ");
			scanf ("%f", &num1);
			
			printf ("\nDigite o segundo numero : ");
			scanf ("%f", &num2);
			
			printf ("\nDigite o terceiro numero : ");
			scanf ("%f", &num3);
			
			resultado = ((num1 * num1) + (num2 * num2) + (num3 * num3));
			
			printf ("\nO resultado das somas dos numeros ao quadrado: %5.2f \n\n",resultado );
			
			system ("PAUSE");
			return 0;
	}
	
	
