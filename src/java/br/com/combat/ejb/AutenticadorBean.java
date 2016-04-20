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
    public void autenticarLogin(String email, String senha) {
        PessoaDAO dao = new PessoaDAO(em);
        Pessoa p = new Pessoa();
        p = dao.buscarPorEmail(email);
        if(p == null){
            System.out.println("Email não encontrado");
        }else{
            if(!senha.equalsIgnoreCase(p.getSenha()))
            {
                System.out.println("Senha ou Email Incorretos");
            }else
            {
                System.out.println("Login Realizado com Sucesso");                
            }
            
        }
    }
}
