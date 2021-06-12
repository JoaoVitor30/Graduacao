#include <stdio.h>
#include <stdlib.h>
#include <string.h>

	int main (int argc, char* argv[])
	
{
	char senha[80];
	
	printf("Digite a senha: ");
	scanf("%s", &senha);
	
	if (strcmp (senha, "lap") == 0)
		printf("\nSenha OK!\n\n");
	else
		printf("\nSenha Invalida\n\n");
		
	system ("pause");
	return 0;
	
}
