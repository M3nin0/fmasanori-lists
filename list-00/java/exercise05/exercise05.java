// Calcule  o  tempo  de  uma  viagem  de  carro.  Pergunte  a  distância  a  percorrer  e  a  velocidade  média esperada para a viagem. 

package exercise05;
import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args){
        int dist,vel,velmedia;
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Insira a distancia a ser perseguida: ");
        dist = valor.nextInt();
        System.out.println("Insira a velocidade: ");
        vel = valor.nextInt();
        
        velmedia = dist/vel;
        
        System.out.println("A viagem irá levar: "+velmedia);
        
    }
    
}
