package br.com.andrelemos.puc.maratona;

/**
 * Created by andrelemos on 02/05/17.
 */
public class PontosDeAgua {

    private int posicao;

    public PontosDeAgua(int posicao) {
        this.posicao = posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }


    public float getPosicao() {
        return this.posicao;
    }

    @Override
    public String toString() {
        return "PontosDeAgua{" +
                "posicao=" + posicao +
                '}';
    }
}
