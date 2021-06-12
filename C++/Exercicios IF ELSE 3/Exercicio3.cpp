#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	float a, b;
	char ch;
	
	printf("O que deseja fazer? (Digite a primeira letra):\n");
	printf("\n (A)dicao, (S)ubtracao, (M)ultiplicacao, ou (D)ivisao\n");
	scanf("%s", &ch);
	printf("\nEntre com o primeiro numero: ");
	scanf("%f", &a);
	printf("\nEntre com o segundo numero: ");
	scanf("%f", &b);
	
	switch(ch)
	{
		case 'A':
		case 'a':
			printf("%f\n", a + b);
		break;
		
		case'S':
		case's':
			printf("%f\n", a - b);
		break;
		
		case'M':
		case'm':
			printf("%f\n", a * b);
		break;
		
		case'D':
		case'd':
			if (b != 0)
				printf("%f", a / b);
			else
				printf("Erro de divisao por zero!");
				system ("pause");
				exit(0);
		
		default:
			printf("\nLetra Invalida!\n");
			
	}
	system("pause");
	return 0;
}
