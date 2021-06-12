#include <stdio.h>
#include <stdlib.h>

 int main (int argc, char* argv[])
 
 {
 	float media, nota1, nota2;
 	
 	printf("Digite a primeira nota: ");
 	scanf("%f", &nota1);
 	printf("\nDigite a segunda nota: ");
 	scanf("%f", &nota2);
 	
 	media = nota1 + nota2 / 2;
 	
 	if (media >= 7)
 		printf("\nO aluno esta aprovado!! Com media : %5.2f\n\n", media);
 	else
 	
 	if (media >=5 && media <7)
 		printf("\nO aluno esta de exame!! Com media : %5.2f\n\n", media);
 	else
 		printf("\nO aluno esta reprovado!! Com media : %5.2f\n\n", media);
 	
 	system ("PAUSE"); 
 	return 0;
 }
