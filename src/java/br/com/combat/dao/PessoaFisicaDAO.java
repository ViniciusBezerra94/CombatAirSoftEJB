/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.dao;

import br.com.combat.entity.PessoaFisica;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
    
        public PessoaFisica pesquisarPorIdPessoa(Long id) {
        PessoaFisica pessoaFisica = null;
        try {
            if (id != null) {
                String sql = "SELECT p FROM PessoaFisica p INNER JOIN p.pessoa pes WHERE pes.id =:IDPESSOA ";
                TypedQuery<PessoaFisica> query = etm.createQuery(sql, PessoaFisica.class).setParameter("IDPESSOA", id);
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
