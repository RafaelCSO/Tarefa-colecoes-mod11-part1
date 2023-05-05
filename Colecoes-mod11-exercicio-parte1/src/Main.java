import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        List<String> pessoas = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o nomes separados por virgula: ");
            String entradaNome = s.nextLine();
            String[] entradaArray = entradaNome.split(",");

            for (String nome : entradaArray) {
                pessoas.add(nome.trim());
            }


            System.out.println("Continuar ? Y/N");
            String novoNome = s.nextLine();
            if (novoNome.equalsIgnoreCase("Y")) {
                continuar = true;
            } else {
                continuar = false;
            }
            Collections.sort(pessoas);
        }

        System.out.println("Nomes ordenados:");
        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    }