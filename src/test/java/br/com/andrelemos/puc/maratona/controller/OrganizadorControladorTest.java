package br.com.andrelemos.puc.maratona.controller;

import br.com.andrelemos.puc.maratona.dao.PercursoDAO;
import br.com.andrelemos.puc.maratona.entity.Maratonista;
import br.com.andrelemos.puc.maratona.entity.Percurso;
import br.com.andrelemos.puc.maratona.entity.PontoDeAgua;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

public class OrganizadorControladorTest {

    @Mock
    private PercursoDAO percursoDAOFalso;
    private Maratonista maratonista;

    @Before
    public void inicio() {
        MockitoAnnotations.initMocks(this);
        maratonista = new Maratonista();
    }

    @Test
    public void verificaSeMaratonistaGanhou() {
        maratonista.setMetragem(6000);

        Percurso percurso = new Percurso();

        PontoDeAgua pa1 = definePontosDeAgua(0);
        PontoDeAgua pa2 = definePontosDeAgua(9000);
        PontoDeAgua pa3 = definePontosDeAgua(18000);
        PontoDeAgua pa4 = definePontosDeAgua(27000);
        PontoDeAgua pa5 = definePontosDeAgua(36000);
        PontoDeAgua pa6 = definePontosDeAgua(42195);

        percurso.adicionaPontoDeAgua(pa1);
        percurso.adicionaPontoDeAgua(pa2);
        percurso.adicionaPontoDeAgua(pa3);
        percurso.adicionaPontoDeAgua(pa4);
        percurso.adicionaPontoDeAgua(pa5);
        percurso.adicionaPontoDeAgua(pa6);

        when(percursoDAOFalso.buscar()).thenReturn(percurso);

        assertThat(maratonista.getResultado(percurso), CoreMatchers.equalTo(Boolean.TRUE));
    }

    private PontoDeAgua definePontosDeAgua(int posicao) {
        return new PontoDeAgua(posicao);
    }
}