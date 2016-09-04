//Aumento salarial

#include <stdio.h>

int main(){

	float salario,percent,aumento;

	printf("Qual o seu salario: ");
	scanf("%f", &salario);
	printf("insira a porcentagem do aumento: ");
	scanf("%f", &percent);

	aumento = salario + (salario * (percent / 100));

	printf("Com este aumento você passa a receber %.3f\n" , aumento);

	return 0;
} 
