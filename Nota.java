import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua nota:");
        double nota = leitor.nextDouble();

        if(nota < 3){
            System.out.println("Nota F");
        } else if (nota < 5){
            System.out.println("Nota D");
        } else if (nota < 7) {
            System.out.println("Nota C");
        } else if (nota < 9){
            System.out.println("Nota B");
        } else {
            System.out.println("Nota A");
        }
        leitor.close();
    }
}
