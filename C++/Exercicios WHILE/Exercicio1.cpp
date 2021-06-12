#include <stdio.h>
#include <stdlib.h>

int main (int argc, char* argv[])

{
	int x, r, cont;
	cont=0;
	while (cont<5)
	{
		printf("\nDigite um valor para X: ");
		scanf("%d", &x);
		r = x * 3;
		printf("\n O valor de r eh: %d\n", r);
		cont++;
	}
	system("pause");
	return 0;
}
