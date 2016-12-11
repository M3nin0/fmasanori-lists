// Faça  um  programa  que  calcule  o  aumento  de  um  salário.  Ele  deve  solicitar  o  valor  do  salário  e  a 
// porcentagem do aumento. Exiba o valor do aumento e do novo salário.

package exercise03;
import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args){
        double aumento, salario, NovoSalario;
        
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Insira o valor de seu salário atualmente: ");
        salario = valor.nextDouble();
        System.out.println("Agora insira quantos porcento será seu aumento: ");
        aumento = valor.nextDouble();
        
        NovoSalario = salario + (salario * aumento / 100);
        
        System.out.println("Seu novo salario passa a ser: "+ NovoSalario);
        
    }
    
}
