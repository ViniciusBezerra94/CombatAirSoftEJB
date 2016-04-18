/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.ejb;

import br.com.combat.dao.PessoaDAO;
import br.com.combat.entity.Pessoa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vinicius
 */
@Stateless
public class PessoaBean implements PessoaRemote {

    @PersistenceContext(unitName = "CombatAirSoftPU")
    private EntityManager em;
    
    
    @Override
    public Pessoa salvar(Pessoa p) throws Exception {
        PessoaDAO dao = new PessoaDAO(em);
        return dao.salvar(p);
    }

    @Override
    public Pessoa consultarPorId(Long id) {
        PessoaDAO dao = new PessoaDAO(em);
        return dao.consultarPorId(Pessoa.class, id);
    }

    @Override
    public void remover(Long id) {
        PessoaDAO dao = new PessoaDAO(em);
        dao.remover(Pessoa.class, id);
    }
    
}
