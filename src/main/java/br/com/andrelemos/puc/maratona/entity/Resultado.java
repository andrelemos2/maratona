package br.com.andrelemos.puc.maratona.entity;

public enum  Resultado {

    TERMINA("TERMINA"),
    NAO_TERMINA("NAO TERMINA"),
    INVALIDO("INVALIDO");

    private final String nome;

    Resultado(String n) {
        nome = n;
    }
}
