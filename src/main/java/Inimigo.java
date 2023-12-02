// Classe Inimigo
public class Inimigo {
    private String nome;
    private int posicaoX;
    private int posicaoY;
    private int velocidade;
    private int vida;
    private String tipo;
    private boolean agressivo;

    public Inimigo(String nome, int posicaoX, int posicaoY, int velocidade, int vida, String tipo, boolean agressivo) {
        this.nome = nome;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.velocidade = velocidade;
        this.vida = vida;
        this.tipo = tipo;
        this.agressivo = agressivo;
    }

    public void mover() {
        // Implementação do método mover()
    }

    public void atacar() {
        // Implementação do método atacar()
    }

    public void levarDano() {
        // Implementação do método levarDano()
    }

    public void morrer() {
        // Implementação do método morrer()
    }

    public void receberDano(int dano) {
        this.vida -= dano;
    }

    public void mudarComportamento() {
        this.agressivo = !this.agressivo;
    }
}