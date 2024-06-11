import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)){
            System.out.println("Digite a primeira nota do aluno:");
            double nota01 = leitor.nextDouble();
            System.out.println("Digite a segunda nota:");
            double nota02 = leitor.nextDouble();
            System.out.println("Digite a terceira nota:");
            double nota03 = leitor.nextDouble();
            double media = ((nota01 + nota02 + nota03)/3);

            if(media<5){
                System.out.println("Reprovado");
            } else if (media < 7) {
                System.out.println("Em recuperação");
            }else {
                System.out.println("Aprovado");
            }
        }
    }
}
