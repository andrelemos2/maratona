package br.com.andrelemos.puc.maratona.controller;


import br.com.andrelemos.puc.maratona.entity.Percurso;
import br.com.andrelemos.puc.maratona.service.OrganizadorService;

public class OrganizadorControlador {

    private OrganizadorService service;

    public OrganizadorControlador(OrganizadorService service) {
        this.service = service;
    }

    public void definePercurso() {
        service.definePercurso();
    }

    public Percurso obterPercurso() {
        return service.obterPercurso();
    }
}
