/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.ejb;

import br.com.combat.entity.Pedido;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Marcelo dos Santos Silva <mssdesigner@gmail.com>
 */
@Remote
public interface PedidoRemote {
    public Pedido salvar(Pedido p) throws Exception;
    public Pedido consultarPorId(Long id);
    public void remover(Long id);
    public List<Pedido> consultarItensCompradosPorPessoa(Long id);
}
