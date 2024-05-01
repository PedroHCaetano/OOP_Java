public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacao;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }
}
