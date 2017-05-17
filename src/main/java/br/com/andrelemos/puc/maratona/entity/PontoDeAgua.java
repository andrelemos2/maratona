package br.com.andrelemos.puc.maratona.entity;

/**
 * Created by andrelemos on 02/05/17.
 */
public class PontoDeAgua {

    private Integer posicao = 0;

    public PontoDeAgua(Integer posicao) {
        this.posicao = posicao;
    }

    public int obterPosicao() {
        return posicao;
    }
}


