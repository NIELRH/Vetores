import java.util.Scanner;

public class Exer6 {
    public static void main (String[] args) {

        Scanner bob = new Scanner(System.in);
        int[] vetorA = new int[2];
        int[] vetorB = new int[3];
        int[] vetorC = new int[]{vetorA.length + vetorB.length };


        System.out.println("Digite os valores do vetor A :");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = bob.nextInt();
        }

        System.out.println("Digite os valores do vetor B : ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = bob.nextInt();
        }

        
        for  (int i = 0; i < vetorB.length + vetorA.length; i++) {
            System.out.println("O vetor C são : " + vetorC);
        }


    }
}
