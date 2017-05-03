package br.com.andrelemos.puc.maratona;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrelemos on 02/05/17.
 */
public class Organizador {


    private List<PontosDeAgua> pontosDeAgua;
    private Percurso percurso;

    public Organizador(){
        this.pontosDeAgua = new ArrayList<>();
        this.percurso = new Percurso();
    }

    public List<PontosDeAgua> getPontosDeAgua() {
        return pontosDeAgua;
    }

    public void construirPostoDeAgua(PontosDeAgua pontosDeAgua) {
        this.pontosDeAgua.add(pontosDeAgua);
    }

    public Percurso getPercurso() {
        return percurso;
    }

    public void definePercurso(Percurso percurso) {
        this.percurso = percurso;
    }
}
