package br.com.andrelemos.puc.maratona.dao;

import br.com.andrelemos.puc.maratona.entity.PontoDeAgua;

import java.util.ArrayList;
import java.util.List;

public class PontoDeAguaDAO {

    List<PontoDeAgua> pontosDeAgua;

    public PontoDeAguaDAO() {
        this.pontosDeAgua = new ArrayList<>();
    }

    public void adiciona(PontoDeAgua pontoDeAgua){
        pontosDeAgua.add(pontoDeAgua);
    }

    public List<PontoDeAgua> buscar() {
        return pontosDeAgua;
    }
}
