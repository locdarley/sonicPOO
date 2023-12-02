// Classe Anel
public class Anel {
    private int posicaoX;
    private int posicaoY;
    private int valor;
    private boolean brilhante;

    public Anel(int posicaoX, int posicaoY, int valor, boolean brilhante) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.valor = valor;
        this.brilhante = brilhante;
    }

    public void coletar() {
        // Implementação do método coletar()
    }

    public void exibirBrilho() {
        // Implementação do método exibirBrilho()
    }

    public void atualizarValor(int novoValor) {
        this.valor = novoValor;
    }
}
