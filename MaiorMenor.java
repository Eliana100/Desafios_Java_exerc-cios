import java.util.Scanner;

public class MaiorMenor {
    public static void main (String [] args){

        try (Scanner leitor = new Scanner(System.in)){

            System.out.println("Digite um número inteiro: ");
            int numero01 = leitor.nextInt();
            System.out.println("Digite outro número inteiro: ");
            int numero02 = leitor.nextInt();

            if (numero01 > numero02) {
                System.out.println("O primeiro numero é maior");
            } else {
                System.out.println("o Segundo numero é maior");
            }
        }
    }
}
