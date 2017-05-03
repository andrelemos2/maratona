package br.com.andrelemos.puc.maratona;

/**
 * Created by andrelemos on 02/05/17.
 */
public class Corredor {


    private final float DISTANCIA_MINIMA_POSTO_DE_AGUA = 10000f;

    public void correr(Percurso percurso) {

        float pos = 0;

        for (PontosDeAgua pontosDeAgua : percurso.getPontosDeAgua()) {

            float distancia = pontosDeAgua.getPosicao() - pos;

            if(distancia > 0 && distancia > DISTANCIA_MINIMA_POSTO_DE_AGUA){
                System.out.println("Nao Conseguiu Concluir a prova, distancia percorrida: "+ distancia);
            }


            pos = pontosDeAgua.getPosicao();


        }
    }

}
