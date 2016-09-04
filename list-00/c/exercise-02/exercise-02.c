//Calculando os segundos

#include <stdio.h>

int main(){

	float d,h,m,s,total;

	printf("Insira a quantidade de dias: ");
	scanf("%f", &d);
	printf("Insira a quantidade de horas: ");
	scanf("%f", &h);
	printf("Insira a quantidade de minutos: ");
	scanf("%f", &m);
	printf("Insira a quantidade de segundos: ");
	scanf("%f", &s);

	total = (d * 24 * 60 * 60 )  + (h * 60 * 60 ) + ( m * 60) + s;

	printf("todos estes valores em segundos equivalem a: %.2f segundos\n", total);

	return 0;
}
