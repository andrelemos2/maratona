package br.com.andrelemos.puc.maratona;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrelemos on 02/05/17.
 */
public class Percurso {

    private List<PontosDeAgua> listaFinal = new ArrayList<>();

    public Percurso(List<PontosDeAgua> pontosDeAguas) {
        listaFinal.add(new PontosDeAgua(0));

        pontosDeAguas.stream()
                .forEach(pontosDeAgua -> listaFinal.add(pontosDeAgua));

        listaFinal.add(new PontosDeAgua(42195));
    }

    public List<PontosDeAgua> getListaFinal() {
        return listaFinal;
    }
}
