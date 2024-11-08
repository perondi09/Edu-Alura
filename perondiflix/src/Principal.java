public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "la la land";
        meuFilme.somaDasAvaliacoes = 10;
        meuFilme.duracao = 120;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichatecnic();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(1);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

    }


}
