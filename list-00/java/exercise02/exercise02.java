// Escreva um programa que leia a quantidade de dias, horas, minutos e segundos do usuário. Calcule o total em segundos.

package exercise02;
import java.util.Scanner;


public class exercise02 {
    public static void main(String[] args){
        int dias,horas,minutos,segundos;
        Scanner valores = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de dias: ");
        dias = valores.nextInt();
        System.out.println("Insira a quantidade de horas: ");
        horas = valores.nextInt();
        System.out.println("Insira a quantidade de minutos: ");
        minutos = valores.nextInt();
        System.out.println("Insira a quantidade em segundos: ");
        segundos = valores.nextInt();
        
        System.out.println("A quantidade total em segundos é: "+(dias * 24 * 60 * 60) + (horas * 60 * 60) + (minutos * 60) + segundos);
        
    }
    
}
