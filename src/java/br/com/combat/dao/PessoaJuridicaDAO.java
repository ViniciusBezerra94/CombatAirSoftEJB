/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.dao;

import br.com.combat.entity.PessoaJuridica;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author vinicius
 */
public class PessoaJuridicaDAO extends GenericoDAO<PessoaJuridica> {
    
    private final EntityManager etm;

    public PessoaJuridicaDAO(EntityManager em) {
        super(em);
        etm = em;
    }
    
         public PessoaJuridica pesquisarPorIdPessoa(Long id) {
        PessoaJuridica pessoaFisica = null;
        try {
            if (id != null) {
                String sql = "SELECT p FROM PessoaJuridica p INNER JOIN p.pessoa pj where pj.id =:IDPESSOA ";
                TypedQuery<PessoaJuridica> query = etm.createQuery(sql, PessoaJuridica.class).setParameter("IDPESSOA", id);
                pessoaFisica = query.getSingleResult();
            }
        } catch(NoResultException e) {
            System.out.println("Sem resultado");
        } catch(Exception e) {
            System.out.println("Sem resultado");
        } 
        return pessoaFisica;
    }
    
}
