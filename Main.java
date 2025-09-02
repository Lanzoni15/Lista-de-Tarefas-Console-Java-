import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> lista = new ArrayList<>();
        int opcao;


        do {

            System.out.println("\nMENU:");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Marcar tarefa como concluída");
            System.out.println("4 - Remover tarefa");
            System.out.println("5 - Sair");
            opcao = scanner.nextInt();

            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricaoTarefa = scanner.nextLine();
                    Tarefa novaTarefa = new Tarefa(descricaoTarefa);
                    lista.add(novaTarefa);
                    break;
                case 2:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println((i + 1) + " - " + lista.get(i));
                    }
                    break;
                case 3:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println((i + 1) + " - " + lista.get(i));
                    }

                    System.out.print("Digite o número da tarefa a ser concluída: ");
                    int indice = scanner.nextInt() - 1;

                    if (indice >= 0 && indice < lista.size()) {
                        lista.get(indice).marcarComoConcluida();
                        System.out.println("Tarefa marcada como concluída!");
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;
                case 4:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println((i + 1) + " - " + lista.get(i));

                        System.out.print("Digite o número da tarefa a ser removida: ");
                        int tarefaRemovida = scanner.nextInt() - 1;

                        if (tarefaRemovida >= 0 && tarefaRemovida < lista.size()) {
                            lista.remove(tarefaRemovida);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saindo da lista..");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 5);
    }
}
