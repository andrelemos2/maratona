package br.com.andrelemos.puc.maratona.entity;


import java.util.List;

public class Percurso {

    private List<PontoDeAgua> pontosDeAgua;


    public void setPontosDeAgua(List<PontoDeAgua> pontosDeAgua) {
        this.pontosDeAgua = pontosDeAgua;
    }

    public List<PontoDeAgua> getPontosDeAgua() {
        return pontosDeAgua;
    }

}
