/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.dao;

import br.com.combat.entity.PessoaFisica;
import javax.persistence.EntityManager;

/**
 *
 * @author vinicius
 */
public class PessoaFisicaDAO extends GenericoDAO<PessoaFisica> {

    public PessoaFisicaDAO(EntityManager em) {
        super(em);
    }
    
}
