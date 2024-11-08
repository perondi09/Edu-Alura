public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    String genero;
    int duracao;

    void exibeFichatecnic(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Nota de avaliação: "  +  somaDasAvaliacoes);
        System.out.println("Duração do filme: "  +  duracao);
        System.out.println("Filme esta incluido no plano: "  +  incluidoNoPlano);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
