#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, char* argv[])

{

    int a, b, c;
    float bask1, bask2, delta;
    
	printf("ax2 + bx + c = 0\n");
    printf("\nDigite o valor de A: ");
    scanf("%d", &a);
    printf("Digite o valor de B: ");
    scanf("%d", &b);
    printf("Digite o valor de C: ");
    scanf("%d", &c);

    delta = b*b - 4*a*c;

    if(sqrt(delta) >= 0)
    	{
        bask1 = (-b + sqrt(delta) /2);
        bask2 = (-b - sqrt(delta) /2);
        printf("\nRaizes: %.f e %.f\n\n", bask1, bask2);
        }
	 else
        printf("\nSem raiz, valor de delta: %.f\n\n", delta);
    

system ("PAUSE");
return 0;

}

