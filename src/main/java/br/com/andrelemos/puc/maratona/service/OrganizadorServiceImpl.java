package br.com.andrelemos.puc.maratona.service;

import br.com.andrelemos.puc.maratona.dao.PercursoDAO;
import br.com.andrelemos.puc.maratona.dao.PontoDeAguaDAO;
import br.com.andrelemos.puc.maratona.entity.Percurso;
import br.com.andrelemos.puc.maratona.entity.PontoDeAgua;

import java.util.List;

public class OrganizadorServiceImpl implements OrganizadorService {

    private PontoDeAguaDAO paDAO;
    private PercursoDAO percursoDAO;

    public OrganizadorServiceImpl(PontoDeAguaDAO paDAO, PercursoDAO percursoDAO) {
        this.paDAO = paDAO;
        this.percursoDAO = percursoDAO;
    }

    @Override
    public void definePercurso(){
        List<PontoDeAgua> pontosDeAgua = paDAO.buscar();
        Percurso percurso = new Percurso();
        percurso.setPontosDeAgua(pontosDeAgua);
        percursoDAO.adiciona(percurso);
    }

    @Override
    public Percurso obterPercurso(){
        return percursoDAO.buscar();
    }
}
