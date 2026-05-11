import java.util.Scanner;
import java.util.Arrays;

public class Exer4 {
    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);
        String[] nomes = new String[5];

        System.out.println("Digite 5 nomes : ");
        
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = bob.next();
        }

        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Os Nomes são : " + nomes[i]);
        }    
        
            System.out.println();
            System.out.println("O primeiro Nome é " + nomes[0]);
            System.out.println();
            System.out.println("O Ultimo nome é " + nomes[nomes.length-1] );
        
    }
}
