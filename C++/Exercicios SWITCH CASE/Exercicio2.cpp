#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	char ch ;
	
	printf("Digite uma letra: ");
	scanf("%s", &ch);
	
	switch (ch){
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			printf("\nE uma vogal\n\n");
			break;
		default:
			printf("\nE uma consoante\n\n");
					
	}
	
	system ("pause");
	return 0;
	
}
