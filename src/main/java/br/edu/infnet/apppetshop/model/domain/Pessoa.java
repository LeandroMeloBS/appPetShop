package br.edu.infnet.apppetshop.model.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TPessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String nome;
    private String cpf;
    
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public Pessoa() {
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   

	@Override
    public String toString() {
        return String.format("[Pessoa] ID: %d; Nome: %s; CPF: %s", id, nome, cpf);
    }

    public String toFileString() {
        return id + ";" + nome + ";" + cpf;
    }

	
}
