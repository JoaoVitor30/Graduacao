#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char* argv[])
	
{
	int A[5], B[5], C[10], i, j, compa, compb, compc;
	
	for (i=0; i<5; i++)
		{
			printf("Digite um valor para A: "); //Valores do vetor A
			scanf("%d", &A[i]);
		}
		
		printf("\n\n");
		
	for (i=0; i<5; i++)
		{
			printf("Digite um valor para B: "); //Valores do vetor B
			scanf("%d", &B[i]);
		}
			
	for(i=0; i<5; i++)
		for(j=i; j<5; j++)
		{
			if(A[i] > A[j])      //Ordenacao do vetor A
			{
			compa = A[i];
			A[i] = A[j];
			A[j] = compa;
			}
		}
			
	for(i=0; i<5; i++)
		for(j=i; j<5; j++)
		{
			if(B[i] > B[j])      //Ordenacao do vetor B
			{
			compb = B[i];         
			B[i] = B[j];
			B[j] = compb;
			}
		}
		
	for(i=0; i<5; i++)
		{
			C[i] = A[i];	//Juntando os valores do vetor A no vetor C
		}
	
	for(i=5; i<10; i++)
		{
			C[i] = B[i-5];  //Juntando os valores do vetor B no vetor C
		}
		
	for(i=0; i<10; i++)
		for(j=i; j<10; j++)
		{
			if(C[i] > C[j])  //Ordenacao do vetor C
			{
				compc = C[i];
				C[i] = C[j];
				C[j] = compc;
			}	
		}

	
	for(i=0; i<10; i++)
		{
			printf("Vetor C: %d\n", C[i]);
		}	
		
	for(i=0; i<5; i++)
		{
		printf("\nVetor A: %d Vetor B: %d\n", A[i], B[i]);
		}
		
		
		
		
		system("pause");
		return 0;
}
