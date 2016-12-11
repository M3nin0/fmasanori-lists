// Faça agora o contrário, de Fahrenheit para Celsius.
// C = (F − 32) ÷ 1, 8

package exercise07;
import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args){
        float f,c;
        Scanner value = new Scanner(System.in);
        
        System.out.println("Insira o valor em Fahrenheit: ");
        f = value.nextFloat();
        
        c = (f - 32) / 1.8f;
        
        System.out.println("O valor em  é Celcius "+c);
        
    }
    
}
