import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {

        Scanner bob = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        System.out.println("Digite os 5 valores do vator A :");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = bob.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = (vetorA[i]) * 3;
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Os elementos do vetor B são : " + vetorA[i] + " x  3  = " + vetorB[i] );
        }

    }
}
