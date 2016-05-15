package br.com.combat.dao;

import br.com.combat.entity.Pedido;
import javax.persistence.EntityManager;

/*
 * Classe PedidoDAO
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 14/05/2016 • 14:03:28
 */

public class PedidoDAO extends GenericoDAO<Pedido> {

    public PedidoDAO(EntityManager em) {
        super(em);
    }

    
    
    
}
