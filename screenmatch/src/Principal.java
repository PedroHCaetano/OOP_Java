public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "The Batman";
        meuFilme.anoDeLancamento = 2022;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
    }
}