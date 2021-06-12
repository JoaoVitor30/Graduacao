#include <stdio.h>
#include <stdlib.h>	

	int main (int argc , char * argv[])
	
	{
		int numero;
		
			printf("Digite o numero : ");
			scanf ("%d", &numero);
			
			if (numero >= 0 && numero <100)
				printf ("O numero esta entre 0 e 100\n\n");
		
		else	
			if	(numero >= 100 && numero < 1000)
				printf("O numero esta entre 100 e 1000\n\n");
		
		else			
			if (numero >= 1000)
				printf ("O numero e maior ou igual a 1000\n\n");
				
		else		
			 printf ("O numero eh menor que 0\n\n");
			 
		system ("pause");
		return 0;	 
	}
