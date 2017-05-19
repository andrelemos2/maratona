package br.com.andrelemos.puc.maratona.entity;

public class Organizador {

    private Percurso percurso;

    public void definePercurso(Percurso percurso) {
        this.percurso = percurso;
    }

    public Percurso obterPercurso() {
        return percurso;
    }


}
