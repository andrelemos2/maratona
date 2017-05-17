package br.com.andrelemos.puc.maratona.controller;

import br.com.andrelemos.puc.maratona.dao.PercursoDAO;
import br.com.andrelemos.puc.maratona.dao.PontoDeAguaDAO;
import br.com.andrelemos.puc.maratona.entity.Maratonista;
import br.com.andrelemos.puc.maratona.entity.Percurso;
import br.com.andrelemos.puc.maratona.entity.PontoDeAgua;
import br.com.andrelemos.puc.maratona.service.OrganizadorService;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Mockito.*;

public class OrganizadorControladorTest {

    @Mock
    private PontoDeAguaDAO pontoDeAguaDAOFalso;

    @Mock
    private PercursoDAO percursoDAOFalso;
    private Maratonista maratonista;

    @Before
    public void inicio() {
        MockitoAnnotations.initMocks(this);

        maratonista = new Maratonista();

    }

    @Test
    public void verificaListaDePontosDeAgua() throws Exception {

        List<PontoDeAgua> pontosDeAgua = obterPontosDeAgua(0, 9000, 18000, 27000, 36000, 42195);

        when(pontoDeAguaDAOFalso.buscar()).thenReturn(pontosDeAgua);

        pontoDeAguaDAOFalso.buscar();

        Mockito.verify(pontoDeAguaDAOFalso, Mockito.times(1)).buscar();

        assertThat(pontoDeAguaDAOFalso.buscar().size(), CoreMatchers.equalTo(6));
    }

    @Test
    public void verificaBuscaDePercurso() throws Exception {

        List<PontoDeAgua> pontosDeAgua = obterPontosDeAgua(0, 9000, 18000, 27000, 36000, 42195);

        Percurso percurso = new Percurso();
        percurso.setPontosDeAgua(pontosDeAgua);

        when(percursoDAOFalso.buscar()).thenReturn(percurso);

        percursoDAOFalso.buscar();

        verify(percursoDAOFalso, times(1)).buscar();

        assertThat(percurso.getPontosDeAgua().size(), equalTo(6));
    }


    @Test
    public void verificaSePercursoDefinidoIgualObtido() throws Exception{

        List<PontoDeAgua> pontosDeAgua = obterPontosDeAgua(0, 9000, 18000, 27000, 36000, 42195);

        Percurso percurso = new Percurso();
        percurso.setPontosDeAgua(pontosDeAgua);

        OrganizadorService service = mock(OrganizadorService.class);

        when(service.obterPercurso()).thenReturn(percurso);

        OrganizadorControlador controlador = new OrganizadorControlador(service);

        controlador.definePercurso();

        assertThat(controlador.obterPercurso(), equalTo(percurso));
    }

    @Test
    public void verificaSeMaratonistaPerdeu() {
        maratonista.setMetragem(10000);

        List<PontoDeAgua> pontosDeAgua = obterPontosDeAgua(0, 9000, 18000, 27000, 36000, 42195);

        Percurso percurso = new Percurso();
        percurso.setPontosDeAgua(pontosDeAgua);

        when(percursoDAOFalso.buscar()).thenReturn(percurso);

        assertThat(maratonista.getResultado(percurso), CoreMatchers.equalTo(Boolean.FALSE));
    }

    @Test
    public void verificaSeMaratonistaGanhou() {
        maratonista.setMetragem(6000);

        List<PontoDeAgua> pontosDeAgua = obterPontosDeAgua(0, 9000, 18000, 27000, 36000, 42195);

        Percurso percurso = new Percurso();
        percurso.setPontosDeAgua(pontosDeAgua);

        when(percursoDAOFalso.buscar()).thenReturn(percurso);

        assertThat(maratonista.getResultado(percurso), CoreMatchers.equalTo(Boolean.TRUE));
    }

    private List<PontoDeAgua> obterPontosDeAgua(int p1, int p2, int p3, int p4, int p5, int p6) {
        PontoDeAgua pa1 = new PontoDeAgua(p1);

        PontoDeAgua pa2 = new PontoDeAgua(p2);

        PontoDeAgua pa3 = new PontoDeAgua(p3);

        PontoDeAgua pa4 = new PontoDeAgua(p4);

        PontoDeAgua pa5 = new PontoDeAgua(p5);

        PontoDeAgua pa6 = new PontoDeAgua(p6);

        return Arrays.asList(pa1, pa2, pa3, pa4, pa5, pa6);
    }
}