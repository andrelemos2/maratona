package br.com.andrelemos.puc.maratona.service;

import br.com.andrelemos.puc.maratona.dao.PercursoDAO;
import br.com.andrelemos.puc.maratona.entity.Percurso;

public class OrganizadorServiceImpl
		implements OrganizadorService {

    private PercursoDAO percursoDAO;

    public OrganizadorServiceImpl(PercursoDAO percursoDAO) {
	this.percursoDAO = percursoDAO;
    }

    @Override public void definePercurso() {
	Percurso percurso = new Percurso();
	percursoDAO.adiciona(percurso);
    }

    @Override public Percurso obterPercurso() {
	return percursoDAO.buscar();
    }
}
