package br.com.andrelemos.puc.maratona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by andrelemos on 02/05/17.
 */
public class Organizador {

    private Percurso percurso;

    public Organizador(List<PontosDeAgua> pontosDeAguas){
        this.percurso = new Percurso(pontosDeAguas);
    }

    public Percurso getPercurso() {
        return percurso;
    }

    @Override
    public String toString() {
        return "Organizador{" +
                "percurso=" + percurso +
                '}';
    }
}
