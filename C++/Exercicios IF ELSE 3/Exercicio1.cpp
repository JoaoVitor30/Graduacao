#include <stdio.h>
#include <stdlib.h>
#include <string.h>

	int main (int argc, char* argv[])
	
{
	char palavra1 [20];
	char palavra2 [20];
	
	printf("\n Primeira palavra: ");
	scanf("%s", &palavra1);
	printf("\n Segunda palavra: ");
	scanf("%s", &palavra2);
	
	if (strcmp (palavra1, palavra2) ==0)
		printf("\nAs palavras sao identicas.\n");
	else
		printf("\nAs palavras sao diferentes.\n\n");
	
	system("pause");
	return 0;
	
	
}
