import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner bob = new Scanner(System.in);

        int num [] = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.printf("Digite o " + (i + 1) + "° Numero ");
            num [i] = bob.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("Numero " + (i + 1) + "°" + " = " + num[i] + "\n" );
        }
    }
}