package br.com.andrelemos.puc.maratona;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;

public class MaratonaTest {

    @Test
    public void maratonistaGanha() {

        List<PontosDeAgua> pontosDeAguas = getPontosDeAguas(9000, 18000, 28000, 35000);

        Organizador organizador = new Organizador(pontosDeAguas);

        Maratonista maratonista = new Maratonista();
        maratonista.correr(organizador.getPercurso());

        assertThat(maratonista.getResultado(), equalTo(Resultado.TERMINA));
    }

    @Test
    public void maratonistaPerder() {

        List<PontosDeAgua> pontosDeAguas = getPontosDeAguas(2000, 10000, 30000, 40000);

        Organizador organizador = new Organizador(pontosDeAguas);

        Maratonista maratonista = new Maratonista();
        maratonista.correr(organizador.getPercurso());

        assertThat(maratonista.getResultado(), equalTo(Resultado.NAO_TERMINA));
    }

    private List<PontosDeAgua> getPontosDeAguas(int ponto2, int ponto3, int ponto4, int ponto5) {
        Usuario usuario = new Usuario("Andre");
        PontosDeAgua pa2 = usuario.definePostoDeAgua(ponto2);
        PontosDeAgua pa3 = usuario.definePostoDeAgua(ponto3);
        PontosDeAgua pa4 = usuario.definePostoDeAgua(ponto4);
        PontosDeAgua pa5 = usuario.definePostoDeAgua(ponto5);

        return Arrays.asList(pa2, pa3, pa4, pa5);
    }


}
