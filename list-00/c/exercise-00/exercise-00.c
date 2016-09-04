// Somando dois numero inteiros

#include <stdio.h>

int main(){

	int num1,num2,sum;

	printf("Insira o primeiro valor: ");
	scanf("%i", &num1);
	printf("Insira o segundo valor: ");
	scanf("%i", &num2);
	
	sum = num1 + num2;

	printf("A soma dos dois valores é: %i\n", sum);

	return 0;

}
