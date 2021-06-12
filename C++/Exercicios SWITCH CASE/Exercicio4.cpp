#include <stdio.h>
#include <stdlib.h>

	int main (int argc, char * argv[])
		
	{ 
		float salario , aumento ;
		char categoria, nomefunc[80];
		
			printf ("\nDigite o nome do funcionario: ");
			scanf ("%s", &nomefunc);
		
			printf ("\nDigite seu salario: ");
			scanf ("%f", &salario);
			
			printf ("\nDigite a LETRA da sua Categoria: ");
			scanf ("%s", &categoria);
			
			switch (categoria)		
			
				{
					case 'a': 
						aumento = salario * 1.10;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;	
					
					case 'c': 
						aumento = salario * 1.10;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'f': 
						aumento = salario * 1.10;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'h': 
						aumento = salario * 1.10;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'b': 
						aumento = salario * 1.15;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'd': 
						aumento = salario * 1.15;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'e': 
						aumento = salario * 1.15;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'i': 
						aumento = salario * 1.15;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'j': 
						aumento = salario * 1.15;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 't': 
						aumento = salario * 1.15;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'k': 
						aumento = salario * 1.25;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'r': 
						aumento = salario * 1.25;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'l': 
						aumento = salario * 1.35;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'm': 
						aumento = salario * 1.35;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'n': 
						aumento = salario * 1.35;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'o': 
						aumento = salario * 1.35;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'p': 
						aumento = salario * 1.35;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'q': 
						aumento = salario * 1.35;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 's': 
						aumento = salario * 1.35;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'u': 
						aumento = salario * 1.50;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'v': 
						aumento = salario * 1.50;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'x': 
						aumento = salario * 1.50;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'y': 
						aumento = salario * 1.50;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'w': 
						aumento = salario * 1.50;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					case 'z': 
						aumento = salario * 1.50;
						printf ("O novo salario do funcionario %s eh de: %5.2f\n\n", nomefunc, aumento);
					break;
					
					default:
						printf ("Digite LETRA invalida!!!\n\n");
												
				}
				
		system ("pause");
		return 0;		
	}	
