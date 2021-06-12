#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	float n1, n2, n3, s1, s2, s3;
	
	printf("Informe um numero: ");
	scanf("%f", &n1);
	printf("Informe um numero: ");
	scanf("%f", &n2);
	printf("Informe um numero: ");
	scanf("%f", &n3);
	
	s1 = 5;
	s2 = 9;
	s3 = 6;
	
	if ((n1 == 5 || n1 == 9 || n1 == 6) && (n2 == 5 || n2 == 9 || n2 == 6) && (n3 == 5 || n3 == 9 || n3 == 6))
		printf("Voce acertou todos os numeros\n\n!!");
	else
	
	if ((n1 == 5 || n1 == 9 || n1 == 6) && (n2 == 5 || n2 == 9 || n2 == 6) || (n3 == 5 || n3 == 9 || n3 == 6))
		printf("Voce acertou dois numeros\n\n!!");
	else
	
	if ((n1 == 5 || n1 == 9 || n1 == 6) || (n2 == 5 || n2 == 9 || n2 == 6) && (n3 == 5 || n3 == 9 || n3 == 6))
		printf("Voce acertou dois numeros\n\n!!");
	else
	
	if ((n1 == 5 || n1 == 9 || n1 == 6) && (n3 == 5 || n3 == 9 || n3 == 6) || (n2 == 5 || n2 == 9 || n2 == 6))
		printf("Voce acertou dois numeros\n\n!!");
	else
		
	if ((n1 == 5 || n1 == 9 || n1 == 6) || (n2 == 5 || n2 == 9 || n2 == 6) || (n3 == 5 || n3 == 9 || n3 == 6))
		printf("Voce acertou um numero\n\n!!");
	else
		printf("Voce errou todos os numeros!!\n\n");
	
		
	
	system("pause");
	return 0;
	
	
}
