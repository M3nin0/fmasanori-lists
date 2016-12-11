// Escreva um programa que leia um valor em metros e o exiba convertido em milímetros

package exercise01;
import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args){
        int metros;
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Insira o valor em metros a ser convertido para milimetros: ");
        metros = valor.nextInt();
        
        System.out.println("O valor em milimetros é igual a: "+(metros * 1000));
    }
    
}
