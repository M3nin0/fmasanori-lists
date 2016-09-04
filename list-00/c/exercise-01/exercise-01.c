// Metros para milimetros

#include <stdio.h>

int main(){

	int m,c;

	printf("Insira a distancia em metros: ");
	scanf("%i", &m);

	c = m * 1000;

	printf("A distancia em mm: %i\n", c);

	return 0;
} 
