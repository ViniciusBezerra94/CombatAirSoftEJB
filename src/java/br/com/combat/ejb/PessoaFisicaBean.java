/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.ejb;

import br.com.combat.dao.PessoaFisicaDAO;
import br.com.combat.entity.PessoaFisica;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author vinicius
 */
@Stateless
public class PessoaFisicaBean implements PessoaFisicaRemote {

    @PersistenceContext(unitName = "CombatAirSoftPU")
    private EntityManager em;
    
    @Override
    public PessoaFisica salvar(PessoaFisica pf) throws Exception {
         PessoaFisicaDAO dao = new PessoaFisicaDAO(em);
         return dao.salvar(pf);
    }

    @Override
    public PessoaFisica consultarPorId(Long id) {
        PessoaFisicaDAO dao = new PessoaFisicaDAO(em);
        return dao.consultarPorId(PessoaFisica.class, id);
    }

    @Override
    public void remover(Long id) {
        PessoaFisicaDAO dao = new PessoaFisicaDAO(em);
        dao.remover(PessoaFisica.class, id);
    }

    @Override
    public List<PessoaFisica> consultarTodasAsPessoas() {
        PessoaFisicaDAO dao = new PessoaFisicaDAO(em);
        return dao.consultarPorTodasAsPessoas();
    
    }
    
    
}
