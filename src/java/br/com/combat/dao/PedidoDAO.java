package br.com.combat.dao;

import br.com.combat.entity.Pedido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/*
 * Classe PedidoDAO
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 14/05/2016 • 14:03:28
 */

public class PedidoDAO extends GenericoDAO<Pedido> {

    private EntityManager etm;
    
    public PedidoDAO(EntityManager em) {
        super(em);
        etm = em;
    }

    public List<Pedido> consultarItensCompradosPorPessoa(Long id)
    {
        Query q = etm.createNamedQuery("pedido.ConsultarItensCompradosPorPessoa");
        q.setParameter("idPessoa", id);
        return q.getResultList();
        
    }
    
    
    
}
