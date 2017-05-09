package br.com.andrelemos.puc.maratona;

/**
 * Created by andrelemos on 02/05/17.
 */
public class Maratonista {

    private final int DISTANCIA_MINIMA_PONTO_DE_AGUA = 10000;
    private Resultado resultado;

    public Resultado correr(Percurso percurso) {

        float pos = 0;

        for (PontoDeAgua pontos : percurso.obterPontoDeAgua()) {
            float distancia = pontos.obterPosicao() - pos;

            if (distancia > 0 && distancia > DISTANCIA_MINIMA_PONTO_DE_AGUA) {
                this.resultado = Resultado.NAO_TERMINA;
                return this.resultado;
            }
            pos = pontos.obterPosicao();
        }
        this.resultado = Resultado.TERMINA;
        return this.resultado;
    }


    public Resultado obterResultado() {
        return resultado;
    }
}
