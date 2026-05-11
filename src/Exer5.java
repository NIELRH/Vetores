import java.util.Scanner;

public class Exer5 {
    public static void main (String[] args){

        Scanner bob = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorB.length];


        System.out.println("Digite os valores do vetor A : ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = bob.nextInt();
        }

        System.out.println("Digite os valores do vetor B : ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = bob.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {

            vetorC[i] = vetorA[i] - vetorB[i];
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Os valores do vetor A são : " + vetorA[i]);

        }
        System.out.println();

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Os valores do vetor B são : " + vetorB[i]);

        }
        System.out.println();

        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("Os valores do vetor C são : " + vetorC[i]);

        }

    }
}
