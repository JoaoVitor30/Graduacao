#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int mes;
	
	printf("Digite o mes: ");
	scanf("%d", &mes);
	
	switch (mes)
	
	{
		case 1:
			printf("\nJaneiro\n\n");
			break;
		case 2:
			printf("\nFevereiro\n\n");
			break;
		case 3:
			printf("\nMarco\n\n");
			break;
		case 4:
			printf("\nAbril\n\n");
			break;
		case 5:
			printf("\nMaio\n\n");
			break;
		case 6:
			printf("\nJunho\n\n");
			break;
		case 7:
			printf("\nJulho\n\n");
			break;
		case 8:
			printf("\nAgosto\n\n");
			break;
		case 9:
			printf("\nSetembro\n\n");
			break; 
		case 10:
			printf("\nOutubro\n\n");
			break;
		case 11:
			printf("\nNovembro\n\n");
			break;
		case 12:
			printf("\nDezembro\n\n");
			break;
		default:
			printf("\nMes invalido!\n\n");
		
}
	system("pause");
	return 0;
}
