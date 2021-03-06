/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.ejb;

import br.com.combat.entity.Produto;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author vinicius
 */
@Remote
public interface ProdutoRemote {
    public Produto salvar(Produto produto) throws Exception;
    public Produto consultarPorId(Long id);
    public void remover(Long id);
    public List<Produto> buscarProduto();
    public List<Produto> buscarPorUltimosProdutosEPorCategoria(String categoria);
    public List<Produto> buscarPorCategoria(String categoria);
}
