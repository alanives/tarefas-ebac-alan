import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        List<String> nomes = new ArrayList<String>();

        System.out.println("Digite a lista de nomes separados por vírgula (Ex: Nome1,Nome2,Nome3):");
        nomes = Arrays.asList(scanner.next().split(","));

        Collections.sort(nomes);
        System.out.println("Lista de nomes ordenada:");
        System.out.println(nomes);

        List<String> nomesM = new ArrayList<String>();
        List<String> nomesF = new ArrayList<String>();

        System.out.println("Digite a lista de nomes e gêneros no formato `Nome+Gênero` separados por vírgula (Ex: Nome1+F,Nome2+M):");
        String[] lista = scanner.next().split(",");

        for (String item : lista) {
            String[] itemSplit = item.split("\\+");
            if (itemSplit[1].equals("F")) {
                nomesF.add(itemSplit[0]);
            } else {
                nomesM.add(itemSplit[0]);
            }
        }

        Collections.sort(nomesM);
        System.out.println("Nomes masculinos:");
        System.out.println(nomesM);

        Collections.sort(nomesF);
        System.out.println("Nomes femininos:");
        System.out.println(nomesF);
    }
}