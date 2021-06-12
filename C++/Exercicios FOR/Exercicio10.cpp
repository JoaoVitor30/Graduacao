#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int cont, fat, num;
	
	printf("Digite um numero: ");
	scanf("%d", &num);
	
	
	for (cont=1, fat=1; cont=num; cont++)
		{
			fat = fat * num;
			num--;

		}
		
		printf("Numero fatorado eh: %d\n\n", fat);
	system("pause");
	return 0;
}
