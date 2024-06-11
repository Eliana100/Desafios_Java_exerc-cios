import java.util.Scanner;
public class Alimento {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String mensagem;
        mensagem =
                   "1 a 10: Alimento não-perecível\n" +
                   "11 a 20: Alimento perecível\n" +
                   "21 a 30: Vestuário\n" +
                   "31 a 40: Eletrônicos\n";


System.out.println("Digite o código do produto de acordo com a tabela abaixo:\n");
        System.out.println(mensagem);


        leitor.close();
    }
}
