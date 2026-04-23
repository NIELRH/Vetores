import java.util.Scanner;

public class Exer2 {
    public static void main (String[] args){

        Scanner bob = new Scanner(System.in);
        System.out.println("Digite 10 numeros ");

        int num [] = new int[10];
        int qtdPares = 0;
        int qtdImpares = 0;

        int pares [] = new int[10];
        int impares [] = new int[10];

        for (int i = 0; i < 10; i++) {

            num[i] = bob.nextInt();

            if(num[i] % 2 == 0){
                System.out.println("Numero " + num[i] + " é Par");
                pares[qtdPares] = num[i];
                qtdPares++;
            }
            else{
                System.out.println("Numero " + num[i] + " é Impar");
                impares[qtdImpares] = num[i];
                qtdImpares++;
            }
        }
        System.out.println();
        System.out.println("\nNumeros totais de Pares: " + qtdPares);
        System.out.print("Numeros Pares: ");
        for (int j = 0; j < qtdPares; j++) {
            System.out.print(pares[j] + " ");
        }
        System.out.println();
        System.out.println("\nNumeros totais de Impares: " + qtdImpares);
        System.out.print("Numeros Impares: ");
        for (int j = 0; j < qtdImpares; j++) {
            System.out.print(impares[j] + " ");
        }
    }
}