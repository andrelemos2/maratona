package br.com.andrelemos.puc.maratona;

/**
 * Created by Andre Lemos on 07/05/2017.
 */
public class Usuario {

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public PontosDeAgua definePostoDeAgua(int posicao){
        return new PontosDeAgua(posicao);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
