import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> nomesM = new ArrayList<String>();
        List<String> nomesF = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        Boolean control = true;

        do {
            System.out.println("Digite o nome:");
            String nome = scanner.next();

            System.out.println("Digite o sexo (M ou F):");
            String sexo = scanner.next();

            if (sexo.equals("M")) {
                nomesM.add(nome);
            } else {
                nomesF.add(nome);
            }

            System.out.println("Se deseja encerrar, digite ENCERRAR. Para continuar pressioner <ENTER>");
            String comando = scanner.nextLine();

            if (comando.isEmpty()) {
                control = true;
            }

            if (scanner.hasNextLine()) {
                comando = scanner.nextLine();
            }

            if (comando.equals("ENCERRAR")) {
                control = false;
            }

        } while (control);

        System.out.println("Nomes masculinos: " + nomesM);
        System.out.println("Nomes femininos: " + nomesF);
    }
}