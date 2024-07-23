import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Informe o número: ");

        int numero;
        numero = Integer.parseInt(System.console().readLine());

        Integer numeroWrapper = numero;
        System.out.println("Valor: " + numeroWrapper);
    }
}