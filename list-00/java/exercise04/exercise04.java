//Solicite  o  preço  de  uma  mercadoria  e  o  percentual  de  desconto.  Exiba  o  valor  do  desconto  e  o preço a pagar.

package exercise04;
import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args){
        float preco,desconto,desc;
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Insira o preço da mercadoria: ");
        preco = valor.nextFloat();
        System.out.println("Insira o desconto recebido: ");
        desconto = valor.nextFloat();
        
        desc = preco * desconto / 100;
        
        System.out.println("O seu desconto será de: "+desc);
        System.out.println("E o produto passa a ter: "+(preco-desc));
    }
    
}
