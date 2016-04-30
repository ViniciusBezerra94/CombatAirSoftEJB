/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.ejb;

import br.com.combat.entity.PessoaFisica;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author vinicius
 */
@Remote
public interface PessoaFisicaRemote {
    public PessoaFisica salvar(PessoaFisica pf) throws Exception;
    public PessoaFisica consultarPorId(Long id);
    public void remover(Long id);
    
    public List<PessoaFisica> consultarTodasAsPessoas();
    public PessoaFisica pesquisarPorIdPessoa(Long id);
}
