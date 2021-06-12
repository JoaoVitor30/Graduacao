#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	{
		float base, altura, area;
		
		printf("Digite a base: ");
		scanf("%f", &base);
		printf("\nDigite a altura: ");
		scanf("%f", &altura);
		
		area = (base * altura) / 2;
		
		if (base < 0)
			printf("\n\nA base eh negativa.\n\n");
		else
		
		if	(altura < 0)
			printf("\nA altura eh negativa.\n\n");
			
		else
			printf("\nA area eh: %5.1f\n\n", area);
	
			
		system ("pause");
		return 0;
		
	}
		
	
