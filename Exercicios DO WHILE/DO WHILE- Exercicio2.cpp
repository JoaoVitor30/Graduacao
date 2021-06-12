#include <stdio.h>
#include <stdlib.h>
#include <string.h>

	int main (int argc, char* argv[])
	
{
	int x, r;
	char resp[3];
	
	do
		{
			printf("Digite um valor para X: ");
			scanf("%d", &x);
			
			r = x * 3;
			
			printf("\n O valor de r eh: %5d\n", r);
			printf("\nDeseja continuar? (sim/nao)");
			scanf("%s", &resp);
		}
		while (strcmp(resp, "sim")==0);
		
		system("pause");
		return 0;
}
