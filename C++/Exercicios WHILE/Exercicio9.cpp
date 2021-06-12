#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	float contm, contf;
	char sexo, nome;
	
	
	printf("Informe o seu nome: ");
	scanf("%s", &nome);
	
	contf = 0;
	contm = 0;
	
	while (nome != 'FIM')
	{
		printf("\nInforme o seu sexo: ");
	    scanf("%s", &sexo);
		if (sexo = 'M')
			contm = contm + 1;
		else
			contf = contf + 1;
		
		
			
	printf("\nInforme o seu nome: ");
	scanf("%s", &nome);
		
	}
	
	printf("\nPessoas de sexo feminino: %5.0f\n\n", contf);
	printf("\nPessoas de sexo masculino: %5.0f\n\n", contm);
	system("pause");
	return 0;
}
