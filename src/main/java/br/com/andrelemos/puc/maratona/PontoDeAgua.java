package br.com.andrelemos.puc.maratona;

/**
 * Created by andrelemos on 02/05/17.
 */
public class PontoDeAgua {

    private int posicao;

    public PontoDeAgua(int posicao) {
        this.posicao = posicao;
    }

    public float obterPosicao() {
        return this.posicao;
    }

    @Override
    public String toString() {
        return "PontoDeAgua{" +
                "posicao=" + posicao +
                '}';
    }
}
