/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combat.entity;

import java.io.Serializable;
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

/**
 *
 * @author vinicius
 */
@NamedQueries({
    @NamedQuery(name="pessoaJuridica.buscarPorCNPJ", query = "select pj from PessoaJuridica pj where pj.cnpj like :numCNPJ")

})
@Entity
@Table(name = "PESSOA_JURIDICA")
@SequenceGenerator(name = "PJ_SEQ", sequenceName = "PJ_SEQ", allocationSize=1 , initialValue = 1)
public class PessoaJuridica implements Serializable,EntidadeBase {
    private static final long serialVersionUID = 56456L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PJ_SEQ")
    private Long id;
    
    @Column(name = "razao_social", nullable = false)
    private String razaoSocial;
    private String cnpj;
    @OneToOne(cascade = CascadeType.ALL)
    private Pessoa pessoa;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
}
