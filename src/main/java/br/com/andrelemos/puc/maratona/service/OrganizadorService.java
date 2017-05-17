package br.com.andrelemos.puc.maratona.service;

import br.com.andrelemos.puc.maratona.entity.Percurso;

public interface OrganizadorService {
    void definePercurso();
    Percurso obterPercurso();
}
