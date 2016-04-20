/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.ejb;

import javax.ejb.Remote;



/**
 *
 * @author vinicius
 */
@Remote
public interface AutenticadorRemote {
    public void autenticarLogin(String email, String senha);
}
