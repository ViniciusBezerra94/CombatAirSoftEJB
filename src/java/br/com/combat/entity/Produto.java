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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author vinicius
 */
@NamedQueries({
    @NamedQuery(name="produto.buscarPorCategoria" , query = "select p from Produto p where p.categoria.nome like :nomeCategoria"),
    @NamedQuery(name="produto.buscarPorUltimosProdutosEPorCategoria" ,query= "select p from Produto p where p.categoria.nome like :nomeCategoria ORDER BY p.id DESC")

})


@Entity
@SequenceGenerator(name = "PROD_SEQ" , sequenceName = "PROD_SEQ" , allocationSize = 1 ,initialValue=1 )
public class Produto implements Serializable,EntidadeBase {
    private static final long serialVersionUID = 8L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="PES_SEQ")
    private Long id;
    
    private String nome;
    @Column(name = "VALOR_UNI")
    private double valorUni;
    private String descricao;
    private int quantidade;
    
    @ManyToOne
    private Categoria categoria;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}
