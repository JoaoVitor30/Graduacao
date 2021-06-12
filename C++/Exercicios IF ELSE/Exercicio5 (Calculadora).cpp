#include <stdio.h>
#include <stdlib.h>

int main (int argc, char *argv [])

{
	double num1, num2, resultado;
	char operacao;
	printf("Digite o primeiro numero: ");
	scanf("%f", &num1);
	printf("Digite o segundo numero: ");
	scanf("%f", &num2);
	printf("Digite a operacao (+, -, *, /): ");
	scanf("%s", &operacao);
	
	
	if (operacao == '+')
		{
			resultado = num1 + num2;
			printf ("\n\nO resultado da operacao e: %6.2lf\n\n", resultado);
		}
	else
	
	if (operacao == '-')
		{
			resultado = num1 - num2;
			printf ("\n\nO resultado da operacao e: %6.2lf\n\n", resultado);
		}
	else
	
	if (operacao == '*')
		{
			resultado = num1 * num2;
			printf ("\n\nO resultado da operacao e: %6.2lf\n\n", resultado);
		}
	else
	
	if (operacao == '/')
		if (num2 != 0.00)
		{
			resultado = num1 / num2;
			printf ("\n\nO resultado da operacao e: %6.2lf\n\n", resultado);
		}
		else
		printf("\n\nErro de divisao por zero!!!\n\n");
else
	printf("\n\nNao foi digitada uma operacao valida!\n\n");
	
system("PAUSE");
return 0;

}
	
	
	
	
	
	
	
