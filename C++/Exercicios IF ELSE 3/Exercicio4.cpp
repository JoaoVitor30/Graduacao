#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	float x1, x2;
	char op;
	
	printf("Entre com o primeiro valor, a operacao (+ - * / ) e o segundo valor: ");
	scanf("%f%s%f", &x1, &op, &x2);
	
	switch(op)
		{
			case '+':
				printf("\n%5.2f\n\n", x1 + x2);
			break;
			
			case'-':
				printf("\n%5.2f\n\n", x1 - x2);
			break;
			
			case'*':
				printf("\n&5.2f\n\n", x1 * x2);
			break;
			
			case'/':
				if (x2 != 0)
					printf("\n%5.2f\n\n", x1 / x2);
				else
					printf("\n\nErro de divisao por zero!\n\n");
					system("pause");
					exit (0);
			default:
				printf("ERRO");
		}
	system("pause");
	return 0;
}
