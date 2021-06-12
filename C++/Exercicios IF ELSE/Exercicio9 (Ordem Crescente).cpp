#include <stdio.h>
#include <stdlib.h>

int main (int argc, char *argv [])

{
	float a, b, c;
	printf("\nDigite o valor de A: ");
	scanf("%f", &a);
	printf("\nDigite o valor de B: ");
	scanf("%f", &b);
	printf("\nDigite o valor de C: ");
	scanf("%f", &c);
	
	if (a < b && b < c)
    printf("\n\n%5.1f | %5.1f | %5.1f\n\n", a, b, c);
   else 
   
   if (a < c && c < b)
    printf("\n\n%5.1f | %5.1f | %5.1f\n\n", a, c, b);
   else 
   
   if (b < a && a < c)
    printf("\n\n%5.1f | %5.1f | %5.1f\n\n", b, a, c);
   else 
   
   if (b < c && c < a)
    printf("\n\n%5.1f | %5.1f | %5.1f\n\n", b, c, a);
   else 
   
   if (c < a && a < b)
    printf("\n\n%5.1f | %5.1f | %5.1f\n\n", c, a, b);
   else
    printf("\n\n%5.1f | %5.1f | %5.1f\n\n", c, b, a);

	
	system ("PAUSE");
	return 0;
	
}
