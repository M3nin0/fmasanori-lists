//Faça um programa que peça dois números inteiros e imprima a soma desses dois números

package exercise00;
import java.util.Scanner;

public class exercise00 {
    public static void main(String[] args){
        int num1,num2;
        
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        num1 = numero.nextInt();
        System.out.println("Insira mais um número: ");
        num2 = numero.nextInt();
        
        System.out.println("A soma dos números é: "+(num1 + num2));
        
    }
    
}
