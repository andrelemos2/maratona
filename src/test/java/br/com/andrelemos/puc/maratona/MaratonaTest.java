package br.com.andrelemos.puc.maratona;

import org.junit.Test;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class MaratonaTest {

    @Test
    public void maratonistaGanha() {

        Usuario usuario = new Usuario("Paulo");
        usuario.adicionaPostoDeAgua(new PontoDeAgua(0));
        usuario.adicionaPostoDeAgua(new PontoDeAgua(9000));
        usuario.adicionaPostoDeAgua(new PontoDeAgua(18000));
        usuario.adicionaPostoDeAgua(new PontoDeAgua(28000));
        usuario.adicionaPostoDeAgua(new PontoDeAgua(35000));
        usuario.adicionaPostoDeAgua(new PontoDeAgua(45000));

        Percurso percurso = new Percurso(usuario);
        percurso.obterPontoDeAgua();

        Organizador organizador = new Organizador();
        organizador.definePercurso(percurso);

        Maratonista maratonista = new Maratonista();
        maratonista.correr(organizador.obterPercurso());

        assertThat(maratonista.obterResultado(), equalTo(Resultado.TERMINA));
    }

    @Test
    public void maratonistaPerde() {

        Usuario usuario = new Usuario("Andre");
        usuario.adicionaPostoDeAgua(new PontoDeAgua(0));
        usuario.adicionaPostoDeAgua(new PontoDeAgua(5000));
        usuario.adicionaPostoDeAgua(new PontoDeAgua(10000));
        usuario.adicionaPostoDeAgua(new PontoDeAgua(15000));
        usuario.adicionaPostoDeAgua(new PontoDeAgua(20000));
        usuario.adicionaPostoDeAgua(new PontoDeAgua(45192));

        Percurso percurso = new Percurso(usuario);
        percurso.obterPontoDeAgua();

        Organizador organizador = new Organizador();
        organizador.definePercurso(percurso);

        Maratonista maratonista = new Maratonista();
        maratonista.correr(organizador.obterPercurso());

        assertThat(maratonista.obterResultado(), equalTo(Resultado.NAO_TERMINA));
    }


}
