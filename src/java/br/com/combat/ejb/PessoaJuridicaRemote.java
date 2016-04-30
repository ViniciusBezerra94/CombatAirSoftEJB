/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.ejb;

import br.com.combat.entity.PessoaJuridica;
import javax.ejb.Remote;

/*
 * @author vinicius
 */
@Remote
public interface PessoaJuridicaRemote {
    public PessoaJuridica salvar(PessoaJuridica pj) throws Exception;
    public PessoaJuridica consultarPorId(Long id);
    public void remover(Long id);
    public PessoaJuridica pesquisarPorIdPessoa(Long id);
}
