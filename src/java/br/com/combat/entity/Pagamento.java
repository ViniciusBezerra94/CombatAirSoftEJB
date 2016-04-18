/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author vinicius
 */
@Entity

@SequenceGenerator(name = "PAG_SEQ",sequenceName = "PAG_SEQ", initialValue = 1,allocationSize = 1)
public class Pagamento implements Serializable,EntidadeBase {
    private static final long serialVersionUID = 3L;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "PAG_SEQ")
    private Long id;  
    
    private String status;
    @Column(name = "FORMA_PAGAMENTO")
    private String formaDePagamento;
    
    @ManyToOne
    private Pedido pedido;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
}
