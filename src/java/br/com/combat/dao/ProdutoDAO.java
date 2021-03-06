/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.dao;

import br.com.combat.entity.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author vinicius
 */
public class ProdutoDAO extends GenericoDAO<Produto> {
    private EntityManager etm;
    public ProdutoDAO(EntityManager em) {
        super(em);
        etm = em;
    }
    
    public List<Produto> buscarProduto()
    {
        Query q = etm.createNamedQuery("produto.buscarProduto");
        
        return q.getResultList();
    }
    
    public List<Produto> buscarPorUltimosProdutosEPorCategoria(String categoria){
        Query q = etm.createNamedQuery("produto.buscarPorUltimosProdutosEPorCategoria");
        q.setParameter("nomeCategoria", categoria);
        q.setMaxResults(4);
        return q.getResultList();
    }
    
    public List<Produto> buscarPorCategoria(String categoria)
    {
        Query q = etm.createNamedQuery("produto.buscarPorCategoria");
        q.setParameter("nomeCategoria", categoria);
        return q.getResultList();
    }
}
