/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vinicius
 */
/*@NamedQueries({
    @NamedQuery(name="pedido.ConsultarItensCompradosPorData", 
            query = "select p.pessoa from Pedido p inner join p.itens i where p.dataHora = :data")
})*/

@Entity

@SequenceGenerator(name = "PED_SEQ", sequenceName="PED_SEQ", allocationSize = 1, initialValue = 1)

public class Pedido implements Serializable,EntidadeBase {
    private static final long serialVersionUID = 4L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PED_SEQ")
    private Long id;  
    
    @Column(name = "DATA_HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;
    
    @Column(name = "QTD_ITENS")
    private int qtdItens;


    @Column(name = "VALOR")
    private double valor;
    
    private String nf;
    
    @ManyToOne
    private Pessoa pessoa;
    
    @OneToMany(mappedBy = "pedido")
    private List<Item> itens;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNf() {
        return nf;
    }

    public void setNf(String nf) {
        this.nf = nf;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    
    
}
