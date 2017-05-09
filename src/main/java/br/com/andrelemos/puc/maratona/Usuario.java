package br.com.andrelemos.puc.maratona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Andre Lemos on 07/05/2017.
 */
public class Usuario {

    private String nome;
    private List<PontoDeAgua> pontosDeAgua = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaPostoDeAgua(PontoDeAgua pontoDeAgua){
        pontosDeAgua.add(pontoDeAgua);
    }

    public List<PontoDeAgua> obterPontoDeAguas() {
        return Collections.unmodifiableList(pontosDeAgua);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
