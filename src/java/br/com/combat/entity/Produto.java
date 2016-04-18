/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.entity;

import java.io.Serializable;
import java.util.List;
import javax.mail.FetchProfile.Item;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author vinicius
 */
@NamedQueries({
    @NamedQuery(name="produto.buscarPorCategoria" , query = "select p from Produto p where p.categoria.nome like :nomeCategoria"),
    @NamedQuery(name="produto.buscarPorUltimosProdutosEPorCategoria" ,query= "select p from Produto p where p.categoria.nome like :nomeCategoria ORDER BY DESC")

})


@Entity
@SequenceGenerator(name = "PES_SEQ" , sequenceName = "PES_SEQ" , allocationSize = 1 ,initialValue=1 )
public class Produto implements Serializable,EntidadeBase {
    private static final long serialVersionUID = 8L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="PES_SEQ")
    private Long id;
    
    @Column(nullable = false)
    private String nome;

    @Column(name = "VALOR_UNI", nullable = false)
    private double valorUni;
    
    @JoinColumn(name = "ID_CATEGORIA", referencedColumnName = "ID")
    @ManyToOne
    private Categoria categoria;
            
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produto")
    private List<Item> itens;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorUni() {
        return valorUni;
    }

    public void setValorUni(double valorUni) {
        this.valorUni = valorUni;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    
    
}