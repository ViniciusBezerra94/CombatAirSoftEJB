package br.com.combat.ejb;

import br.com.combat.dao.PedidoDAO;
import br.com.combat.entity.Pedido;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/*
 * Classe PedidoBean
 * Aluno Marcelo dos Santos Silva <mssdesigner@gmail.com> • RA 248716
 * Universidade Metodista • Curso ADS • 4º Semestre 
 * Data 14/05/2016 • 14:07:01
 */
@Stateless
public class PedidoBean implements PedidoRemote{

    @PersistenceContext(unitName = "CombatAirSoftPU")
    private EntityManager em;
    
    
    @Override
    public Pedido salvar(Pedido p) throws Exception {
       PedidoDAO dao = new PedidoDAO(em);
       return dao.salvar(p);
       
    }

    @Override
    public Pedido consultarPorId(Long id) {
        PedidoDAO dao = new PedidoDAO(em);
        return dao.consultarPorId(Pedido.class, id);
    }

    @Override
    public void remover(Long id) {
        PedidoDAO dao = new PedidoDAO(em);
        dao.remover(Pedido.class, id);
    }

    @Override
    public List<Pedido> consultarItensCompradosPorPessoa(Long id) {
        PedidoDAO dao = new PedidoDAO(em);
        return dao.consultarItensCompradosPorPessoa(id);
    }

}
