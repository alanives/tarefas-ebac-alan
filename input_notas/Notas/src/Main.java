import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Float nota1, nota2, nota3, nota4, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a 1. nota");
        nota1 = scanner.nextFloat();

        System.out.println("Informe a 2. nota");
        nota2 = scanner.nextFloat();

        System.out.println("Informe a 3. nota");
        nota3 = scanner.nextFloat();

        System.out.println("Informe a 4. nota");
        nota4 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média = " + media);

        if (media >= 7.0f) {
            System.out.println("Aprovado");
        } else if (media >= 5.0f) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}