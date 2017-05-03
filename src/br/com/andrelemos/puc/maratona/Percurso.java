package br.com.andrelemos.puc.maratona;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrelemos on 02/05/17.
 */
public class Percurso {

    private List<PontosDeAgua> pontosDeAgua;

    public Percurso(){
        this.pontosDeAgua = new ArrayList<>();
    }

    public void setPontosDeAgua(List<PontosDeAgua> pontosDeAguas) {
        this.pontosDeAgua = pontosDeAguas;
    }


    public List<PontosDeAgua> getPontosDeAgua(){
        return this.pontosDeAgua;
    }
}
