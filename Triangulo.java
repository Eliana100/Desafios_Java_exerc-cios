import java.util.Scanner;

class Triangulo {
    public static void main (String[]args){
        try (Scanner leitor = new Scanner(System.in)) {

            System.out.println("Digite o lado do triângulo: ");
            double lado01 = leitor.nextInt();
            System.out.println("Digite o segundo lado do triângulo: ");
            double lado02 = leitor.nextInt();
            System.out.println("Digite o terceiro lado do triângulo: ");
            double lado03 = leitor.nextInt();

            if(lado01 + lado02 > lado03 && lado02 + lado03 > lado01 && lado03 + lado01 > lado02) {
                       System.out.println("O triângulo é válido!");
            } else {
                System.out.println("O triângulo não é válido");
            }
        }
    }
}
