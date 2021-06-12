#include <stdio.h>
#include <stdlib.h>

int main (int argc, char *argv [])

{
	float salario, novosalario;
	
	printf("Digite o seu salario: ");
	scanf("%f", &salario);
	
	if (salario < 500)
		novosalario = salario * 1.15;
	else
	
	if (salario >=1000)
		novosalario = salario *1.05;
	else
	   novosalario = salario *1.10;
	   
	printf("O seu novo salario e: %5.2f\n\n", novosalario);
	system ("PAUSE");
	return 0;
	
}
