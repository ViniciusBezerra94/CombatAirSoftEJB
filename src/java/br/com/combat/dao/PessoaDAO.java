/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.dao;

import br.com.combat.entity.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author vinicius
 */
public class PessoaDAO extends GenericoDAO<Pessoa> {

    private EntityManager etm;
    public PessoaDAO(EntityManager em) {
        super(em);
        etm = em;
    }
    
    public Pessoa buscarPorEmail(String email)
    {
        Pessoa p = new Pessoa();
        try{
        Query q = etm.createNamedQuery("pessoa.buscarPorEmail");
        q.setParameter("email", email);
        p = (Pessoa) q.getSingleResult();
        }catch(Exception e)
        {
           
        }
        return p;
    }
    
}
