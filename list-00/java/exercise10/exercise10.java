/*
Sabendo que str( ) converte valores numéricos para string, calcule quantos dígitos há em 2 elevado 
a um milhão.
String s = Integer.toString(numero);
System.out.println(s.length());
 */

package exercise10;
import java.util.Scanner;


public class exercise10 {
    public static void main(String[] args){
        int num;
        Scanner value = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        num = value.nextInt();
        
        String s = Integer.toString(num);
        System.out.println(s.length());
        
    }
    
}
