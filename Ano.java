import java.util.Scanner;

public class Ano {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o ano:");
        int ano = leitor.nextInt();

        if((ano % 4 == 0 && ano % 100 !=0) || (ano % 400 == 0)){
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }

        leitor.close();
    }
}
