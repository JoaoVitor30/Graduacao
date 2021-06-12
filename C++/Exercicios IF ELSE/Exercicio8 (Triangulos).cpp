#include <stdio.h>
#include <stdlib.h>

int main (int argc, char *argv [])

{
	float a, b, c;
	
	printf("Digite o valor de A: ");
	scanf("%f", &a);
	printf("Digite o valor de B: ");
	scanf("%f", &b);
	printf("Digite o valor de C: ");
	scanf("%f", &c);
	
	if (a<b+c && b<a+c && c<a+b)
	 printf("\n\nEstes valores formam um triangulo\n\n");
	
	if (a==b && b==c) 
	 printf ("\n\nTriangulo equilatero\n\n");
	else
	
	if (a==b || b==c || a==c)
	 printf("\n\nTriangulo Isosceles\n\n");
	else
	 printf("\n\nTriangulo Escaleno\n\n");
	
	system("PAUSE");
	return 0;
	
}
