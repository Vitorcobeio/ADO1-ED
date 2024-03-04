import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vetor vetor = new Vetor(5);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Listar contatos");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = scanner.nextLine();
                    Contato contato = new Contato(nome, telefone);
                    vetor.adiciona(contato);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser removido: ");
                    nome = scanner.nextLine();
                    vetor.remover(nome);
                    break;
                case 3:
                    vetor.listaContatos();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
