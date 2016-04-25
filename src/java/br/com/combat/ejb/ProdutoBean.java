/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.ejb;

import br.com.combat.dao.ProdutoDAO;
import br.com.combat.entity.Produto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vinicius
 */
@Stateless
public class ProdutoBean implements ProdutoRemote {
    
    @PersistenceContext(unitName = "CombatAirSoftPU")
    private EntityManager em;
    
    @Override
    public Produto salvar(Produto produto) throws Exception {
        ProdutoDAO dao = new ProdutoDAO(em);
        return dao.salvar(produto);
    }

    @Override
    public Produto consultarPorId(Long id) {
        ProdutoDAO dao = new ProdutoDAO(em);
        return dao.consultarPorId(Produto.class, id);
    }

    @Override
    public void remover(Long id) {
        ProdutoDAO dao = new ProdutoDAO(em);
        dao.remover(Produto.class, id);
    }
    

    @Override
    public List<Produto> buscarProduto() {
        ProdutoDAO dao = new ProdutoDAO(em);
        return dao.buscarProduto();
    }
    
}
