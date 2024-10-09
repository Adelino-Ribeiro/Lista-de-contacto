
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner console = new Scanner(System.in);

        // definimos a lista fora do ciclo while
        List<Pessoa> pessoas = new ArrayList<>();

        boolean sair = false;

        while (!sair) {
            mostrarMenu();
            try {
                sair = executarOperacao(console, pessoas);
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
            System.out.println();
        }

    }

    public static boolean executarOperacao(Scanner console, List<Pessoa> pessoas) {

        int opcao = Integer.parseInt(console.nextLine());

        boolean sair = false;

        //
        switch (opcao) {
            case 1 -> { // add contacto
                System.out.println("Insira o nome: ");
                String name = console.nextLine();
                System.out.println("Insira o telefone: ");
                String telefone = console.nextLine();
                System.out.println("Insira o email: ");
                String email = console.nextLine();

                // criar o objecto Pessoa
                Pessoa pessoa = new Pessoa(name, telefone, email);

                // add
                pessoas.add(pessoa);
                System.out.println("A lista tem: " + pessoas.size() + " elementos.");

            }
            case 2 -> {// Listar
                System.out.println("Lista de Contacto");

                // pessoas.forEach((pessoa) -> System.out.println(pessoa)); // lambda e
                pessoas.forEach(System.out::println);                       // metod de referencias
            }
            case 3 -> {
                System.out.println("Saindo...");
                sair = true;
            }
            default -> System.out.println("Opcao errada. ");
        }

        return sair;
    }

    public static void mostrarMenu() {

        System.out.print("""
                **** Lista de Contacto ****
                1. Adicionar
                2. Listar
                3. Sair
                """);
        System.out.print("Escolha uma opção: ");
    }
}
