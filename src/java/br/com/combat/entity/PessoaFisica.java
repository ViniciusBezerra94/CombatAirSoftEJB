/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vinicius
 */

@NamedQueries({
    @NamedQuery(name= "pessoaFisica.buscarPorCPF" ,query="select pf from PessoaFisica pf where pf.cpf like :numCPF")
})
@SequenceGenerator(name = "PF_SEQ", sequenceName="PF_SEQ", allocationSize = 1, initialValue = 1)
@Entity
@Table(name = "PESSOA_FISICA")

public class PessoaFisica implements Serializable,EntidadeBase {
    private static final long serialVersionUID = 12231L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator="PF_SEQ")
    private Long id;
    
    @Column(name = "DATA_NASC", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date dataNasc;
    private String cpf;
    private String nome;
    private char sexo;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Pessoa pessoa;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

  

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

  
    
}
