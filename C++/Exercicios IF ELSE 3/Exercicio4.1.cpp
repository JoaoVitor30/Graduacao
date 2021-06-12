#include <stdio.h>
#include <Stdlib.h>

	int main (int argc, char* argv[])
	
{
	int n1, n2, n3, n4, soma;
	
	printf("Digite um numero: ");
	scanf("%d", &n1);
	printf("Digite um numero: ");
	scanf("%d", &n2);
	printf("Digite um numero: ");
	scanf("%d", &n3);
	printf("Digite um numero: ");
	scanf("%d", &n4);
	
	soma = 0;
	
	if (n1 % 2 == 0)
		soma = soma + n1;
	
	
	if (n2 % 2 == 0)
		soma = soma + n2;
	
	
	if (n3 % 2 == 0) 
		soma = soma + n3;
	
	
	if (n4 % 2 == 0) 
		soma = soma + n4;
		
	printf("A soma eh: %d\n\n", soma);
	
	
	
		
	system("pause");
	return 0;
}
