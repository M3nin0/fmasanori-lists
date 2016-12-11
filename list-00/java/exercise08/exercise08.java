/*
Escreva  um  programa  que  pergunte  a  quantidade  de  km  percorridos  por  um  carro  alugado  pelo 
usuário, assim como a quantidade de dias pelos quais o carro foi alugado. Calcule o preço a pagar,
sabendo que o carro custa R$ 60,00 por dia e R$ 0,15 por km rodado.
 */

package exercise08;
import java.util.Scanner;


public class exercise08 {
    public static void main(String[] args){
        float dist, dias,total;
        Scanner value = new Scanner(System.in);
        
        System.out.println("Insira a distancia percorrida pelo carro: ");
        dist = value.nextFloat();
        System.out.println("Quantos dias você utilizou o carro: ");
        dias = value.nextFloat();
        
        total = (dist * 0.15f) + (dias * 60);
        
        System.out.println("Este carro irá custar: "+total);
    }
    
}
