import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner bob = new Scanner(System.in);
        int[] vetorA = new int[2];
        int[] vetorB = new int[3];

        System.out.println("Digite os valores do vetor A :");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = bob.nextInt();
        }
        System.out.println();
        System.out.println("Digite os valores do vetor B : ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = bob.nextInt();
        }

        int[] vetorC = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
            System.out.printf("Os valores do vetor A são : " + vetorA[i] + "\n");
        }

        System.out.println();

        for (int i = 0; i < vetorB.length; i++) {
            vetorC[vetorA.length + i] = vetorB[i];
            System.out.print("Os valores do vetor B são : " + vetorB[i] + "\n");
        }


        System.out.println("");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("Os valores do vetor C são : " + vetorC[i] + "\n");
        }


    }
}
