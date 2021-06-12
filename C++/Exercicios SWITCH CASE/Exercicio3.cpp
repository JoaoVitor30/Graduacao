#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int num;
	
	printf("Digite um numero: ");
	scanf("%d", &num);
	
	switch (num)
	{
		case 0:
			printf("O numero %d eh par e menor que dez\n\n", num);
			break;
		case 1:
			printf("O numero %d eh impar e menor que dez\n\n", num);
			break;
		case 2:
			printf("O numero %d eh par e menor que dez\n\n", num);
			break;
		case 3:
			printf("O numero %d eh impar e menor que dez\n\n", num);
			break;
		case 4:
			printf("O numero %d eh par e menor que dez\n\n", num);
			break;
		case 5:
			printf("O numero %d eh impar e menor que dez\n\n", num);
			break;
		case 6:
			printf("O numero %d eh par e menor que dez\n\n", num);
			break;
		case 7:
			printf("O numero %d eh impar e menor que dez\n\n", num);
			break;
		case 8:
			printf("O numero %d eh par e menor que dez\n\n", num);
			break;
		case 9:
			printf("O numero %d eh impar e menor que dez\n\n", num);
			break;
		default:
			printf("O numero %d esta fora do intervalo");
	}
		system ("pause");
		return 0;
								
		
	}
		
	
	
	

