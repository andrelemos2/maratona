package br.com.andrelemos.puc.maratona.dao;


import br.com.andrelemos.puc.maratona.entity.Percurso;

public class PercursoDAO {

    private Percurso percurso;

    public void adiciona(Percurso percurso){
        this.percurso = percurso;
    }

    public Percurso buscar(){
        return this.percurso;
    }

}
