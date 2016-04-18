/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.ejb;

import br.com.combat.entity.Pessoa;
import javax.ejb.Remote;

/**
 *
 * @author vinicius
 */
@Remote
interface PessoaRemote {
    public Pessoa salvar(Pessoa p) throws Exception;
    public Pessoa consultarPorId(Long id);
    public void remover(Long id);
}
