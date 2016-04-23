/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.ejb;

import br.com.combat.dao.PessoaDAO;
import br.com.combat.entity.Pessoa;
import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
/**
 *
 * @author vinicius
 */
@Stateless
public class AutenticadorBean implements AutenticadorRemote {

    @PersistenceContext(unitName = "CombatAirSoftPU")
    private EntityManager em;
    
    @Override
    public boolean autenticarLogin(String email, String senha) {
        PessoaDAO dao = new PessoaDAO(em);
        Pessoa p = new Pessoa();
        p = dao.buscarPorEmailESenha(email,senha);
        if(p.getPessoaFisica() != null)
        {
            System.out.println("vai que é tua: " + p.getPessoaFisica().getNome() );
        }else if(p.getPessoaJuridica() != null){
            System.out.println("vai que é tua: " + p.getPessoaJuridica().getRazaoSocial());
        }
        
        if(p == null){
            return false;
        }else{
            return senha.equalsIgnoreCase(p.getSenha());
   
        }
    }
}
