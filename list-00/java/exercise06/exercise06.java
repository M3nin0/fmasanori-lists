// Converta uma temperatura digitada em Celsius para Fahrenheit. F = 9*C/5 + 32

package exercise06;
import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args){
        float c,f;
        Scanner value = new Scanner(System.in);
        
        System.out.println("Insira o valor em Celcius: ");
        c = value.nextFloat();
        
        f = 9*c/5 + 32;
        
        System.out.println("O valor convertido em Fahrenheit é "+f);
    }
    
}
