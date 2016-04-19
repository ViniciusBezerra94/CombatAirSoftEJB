/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.ejb;

import br.com.combat.dao.PessoaJuridicaDAO;
import br.com.combat.entity.PessoaJuridica;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vinicius
 */

@Stateless
public class PessoaJuridicaBean implements PessoaJuridicaRemote {

    @PersistenceContext(unitName = "CombatAirSoftPU")
    private EntityManager em;
    
    @Override
    public PessoaJuridica salvar(PessoaJuridica pj) throws Exception {
        PessoaJuridicaDAO dao = new PessoaJuridicaDAO(em);
        return dao.salvar(pj);
    }

    @Override
    public PessoaJuridica consultarPorId(Long id) {
        PessoaJuridicaDAO dao = new PessoaJuridicaDAO(em);
        return dao.consultarPorId(PessoaJuridica.class, id);
    }

    @Override
    public void remover(Long id) {
        PessoaJuridicaDAO dao = new PessoaJuridicaDAO(em);
        dao.remover(PessoaJuridica.class, id);
    }
    
}
