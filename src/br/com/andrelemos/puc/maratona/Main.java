package br.com.andrelemos.puc.maratona;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Organizador organizador = new Organizador();

        organizador.construirPostoDeAgua(new PontosDeAgua(0f));
        organizador.construirPostoDeAgua(new PontosDeAgua(10000f));
        organizador.construirPostoDeAgua(new PontosDeAgua(22000f));
        organizador.construirPostoDeAgua(new PontosDeAgua(30000f));
        organizador.construirPostoDeAgua(new PontosDeAgua(40000f));
        organizador.construirPostoDeAgua(new PontosDeAgua(42195f));

        List<PontosDeAgua> pontosDeAgua = organizador.getPontosDeAgua();

        Percurso percurso = new Percurso();
        percurso.setPontosDeAgua(pontosDeAgua);

        organizador.definePercurso(percurso);

        Corredor corredor = new Corredor();
        corredor.correr(organizador.getPercurso());


    }
}
