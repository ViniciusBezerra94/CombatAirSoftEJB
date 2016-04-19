/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.dao;

import br.com.combat.entity.PessoaFisica;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author vinicius
 */
public class PessoaFisicaDAO extends GenericoDAO<PessoaFisica> {

    private EntityManager etm;
    public PessoaFisicaDAO(EntityManager em) {
        super(em);
        etm = em;
    }
    
    public List<PessoaFisica> consultarPorTodasAsPessoas(){
        Query q = etm.createNamedQuery("pessoaFisica.buscarPorTodasAsPessoas");
        return q.getResultList();
    }
    
}
