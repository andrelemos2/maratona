package br.com.andrelemos.puc.maratona.entity;

/**
 * Created by andrelemos on 02/05/17.
 */
public class Organizador {

    private Percurso percurso;

    public void definePercurso(Percurso percurso) {
        this.percurso = percurso;
    }

    public Percurso obterPercurso() {
        return percurso;
    }


}
