import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)){ //não precisa do try pois não a exceções aqui, coloquei apenas por costume

            System.out.println("Digite sua idade: ");
            int idade = leitor.nextInt();

            if (idade <= 12) {
                System.out.println("Você é uma criança");
            } else if (idade <= 18) {
                System.out.println("Você é adolescente");
            } else if (idade >= 60) {
                System.out.println("Você é idoso");
            } else {
                System.out.println("Você é adulto");
            }
        }
    }
}
