/*
Escreva  um  programa  para 
calcular  a  redução  do  tempo  de  vida  de  um  fumante.  Pergunte  a 
quantidade  de  cigarros  fumados  por  dia  e  quantos  anos  ele  já  fumou.  Considere  que  um  fumante 
perde 10 minutos de vida a cada cigarro, 
calcule quantos dias de vida um fumante perderá. Exiba o 
total de dias.
*/

package exercise09;
import java.util.Scanner;


public class exercise09 {
    public static void main(String[] args){
        int dias,anos,vidaPerdida;
        Scanner value = new Scanner(System.in);
        
        System.out.println("Insira quantos cigarros você fuma por dia: ");
        dias = value.nextInt();
        System.out.println("Insira a quantos anos você fuma: ");
        anos = value.nextInt();
        
        vidaPerdida = ((anos * 365) * dias);
        
        System.out.println("Você já perdeu "+vidaPerdida+" minutos de vida");
    }
    
}
