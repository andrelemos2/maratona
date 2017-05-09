package br.com.andrelemos.puc.maratona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Override
    public String toString() {
        return "Organizador{" +
                "percurso=" + percurso +
                '}';
    }
}
