/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author vinicius
 */
@Entity
@SequenceGenerator(name = "CAT_SEQ", sequenceName="CAT_SEQ", allocationSize = 1, initialValue = 1)
public class Categoria implements Serializable,EntidadeBase {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CAT_SEQ")
    private Long id;
 
    
    @Column(nullable=false)
    private String nome;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    private List<Produto> produtos;

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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
