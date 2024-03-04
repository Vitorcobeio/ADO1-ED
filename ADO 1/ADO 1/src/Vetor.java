
public class Vetor {

    private Contato[] contatos;
    private int tamanho;

    public Vetor(int capacidade) {
        contatos = new Contato[capacidade];
        tamanho = 0;
    }

    public void adiciona(Contato contato) {
        if (tamanho < contatos.length) {
            contatos[tamanho] = contato;
            tamanho++;
        } else {
            System.out.println("Capacidade máxima atingida");
        }
    }

    public void remover(String nome) {
        int posicao = busca(nome);
        if (posicao != -1) {
            for (int i = posicao; i < tamanho - 1; i++) {
                contatos[i] = contatos[i + 1];
            }
            tamanho--;
            System.out.println("Contato removido com sucesso");
        } else {
            System.out.println("Contato não encontrado");
        }
    }

    private int busca(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void listaContatos() {
        if (tamanho == 0) {
            System.out.println("Nenhum contato encontrado");
        } else {
            System.out.println("Listando contatos:");
            for (int i = 0; i < tamanho; i++) {
                System.out.println(contatos[i]);
            }
        }
    }
}
