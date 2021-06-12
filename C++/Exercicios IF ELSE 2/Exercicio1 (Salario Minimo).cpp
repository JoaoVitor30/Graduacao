#include <stdio.h>
#include <stdlib.h>

int main (int argc, char* argv[])

{
	float salariomin, salariofunc, novosalario;
	char nomefunc [20];
	
	printf("Digite o nome do funcionario: ");
	scanf("%s", &nomefunc);
	
	printf("\nDigite o salario minimo atual: ");
	scanf("%f", &salariomin);
	
	printf("\nDigite o seu salario: ");
	scanf("%f", &salariofunc);
	
	
	novosalario = salariofunc / salariomin;
	
	if (salariofunc > salariomin)
	
	printf("\nO funcionario %s ganha %5.2f salarios minimos\n\n", nomefunc, novosalario);
	
	else 
		printf ("\nVoce ganha menos de um salario minimo!!\n\n"); 
	
	system ("PAUSE");
	return 0;
	
}
