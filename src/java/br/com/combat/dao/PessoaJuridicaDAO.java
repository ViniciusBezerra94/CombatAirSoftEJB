/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.dao;

import br.com.combat.entity.PessoaJuridica;
import javax.persistence.EntityManager;

/**
 *
 * @author vinicius
 */
public class PessoaJuridicaDAO extends GenericoDAO<PessoaJuridica> {

    public PessoaJuridicaDAO(EntityManager em) {
        super(em);
    }
    
}
