package br.com.andrelemos.puc.maratona.entity;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Percurso {

    private List<PontoDeAgua> pontosDeAgua = new ArrayList<>();

    public void adicionaPontoDeAgua(PontoDeAgua pa) {
        this.pontosDeAgua.add(pa);
    }

    public Collection<PontoDeAgua> obterPontosDeAgua() {
        return Collections.unmodifiableCollection(pontosDeAgua);
    }

}
