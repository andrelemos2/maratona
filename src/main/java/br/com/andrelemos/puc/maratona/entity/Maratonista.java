package br.com.andrelemos.puc.maratona.entity;

public class Maratonista {

    private int metragem;

    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }

    public boolean getResultado(Percurso percurso) {
        int ultimaPosicao = 0;
        for (PontoDeAgua pa : percurso.obterPontosDeAgua()) {

            int i = pa.obterPosicao() - ultimaPosicao;

            if (this.metragem > 0 && this.metragem <= i) {
                return true;
            }

            ultimaPosicao = pa.obterPosicao();
        }

        return false;
    }
}
