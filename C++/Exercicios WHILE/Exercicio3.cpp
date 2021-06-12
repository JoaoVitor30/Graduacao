#include <stdio.h>
#include <Stdlib.h>

	int main (int argc, char* argv[])
	
{
	int conta;
	
	conta = 0;
	
	while (conta < 10)
	{
		printf("Conta: %d\n", conta);
		conta = conta + 3;
	}
	system ("pause");
	return 0;
}
