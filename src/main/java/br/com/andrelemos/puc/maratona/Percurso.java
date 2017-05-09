package br.com.andrelemos.puc.maratona;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrelemos on 02/05/17.
 */
public class Percurso {


    private Usuario usuario;

    public Percurso(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<PontoDeAgua> obterPontoDeAgua() {
        return usuario.obterPontoDeAguas();
    }
}
