import java.util.Scanner;

public class CalculadorMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.print("Informe a nota1: ");
        nota1 = sc.nextDouble();

        System.out.print("Informe a nota2: ");
        nota2 = sc.nextDouble();

        System.out.print("Informe a nota3: ");
        nota3 = sc.nextDouble();

        System.out.print("Informe a nota4: ");
        nota4 = sc.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média é: " + media);

        if (media >= 7) {
            System.out.println("APROVADO!");
        } else if (media >= 5) {
            System.out.println("EM RECUPERAÇÃO.");
        } else {
            System.out.println("REPROVADO.");
        }
    }
}
