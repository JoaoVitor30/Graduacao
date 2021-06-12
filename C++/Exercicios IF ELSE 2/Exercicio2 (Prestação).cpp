#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
	{
		float valor, prestacao, taxa, tempo;
		
		printf ("Digite o valor da prestacao: ");
		scanf ("%f", &valor);
		
		printf ("\nDigite o tempo de atraso: ");
		scanf ("%f", &tempo);
		
		printf ("\nDigite a taxa de atraso: ");
		scanf ("%f", &taxa);
		
		prestacao = valor + (valor * (taxa/100) * tempo);
		
		printf ("\nO valor total da prestacao a pagar eh de: %5.2f\n\n", prestacao);
		
		system("PAUSE");
		return 0; 	
	}
