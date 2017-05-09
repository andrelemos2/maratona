package br.com.andrelemos.puc.maratona;

/**
 * Created by Andre Lemos on 07/05/2017.
 */
public enum  Resultado {

    TERMINA("TERMINA"),
    NAO_TERMINA("NAO TERMINA"),
    INVALIDO("INVALIDO");

    private final String nome;

    Resultado(String n) {
        nome = n;
    }
}
