package br.edu.infnet.apppetshop.model.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity

public class Funcionario extends Pessoa {
    private String funcao;
    private String turnoTrabalho;
    private Animal animal;
    
    @ManyToOne
    private AgendamentoServicos agendamentoServicos;
    
    public Funcionario(String nome, String cpf, String funcao, String turnoTrabalho, Animal animal) {
        super(nome, cpf);
        this.funcao = funcao;
        this.turnoTrabalho = turnoTrabalho;
        this.animal = animal;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getTurnoTrabalho() {
        return turnoTrabalho;
    }

    public void setTurnoTrabalho(String turnoTrabalho) {
        this.turnoTrabalho = turnoTrabalho;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    public AgendamentoServicos getAgendamentoServicos() {
        return agendamentoServicos;
    }

    public void setAgendamentoServicos(AgendamentoServicos agendamentoServicos) {
        this.agendamentoServicos = agendamentoServicos;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("; Função: %s; Turno de Trabalho: %s; Animal: %s",
                funcao, turnoTrabalho, animal);
    }

    @Override
    public String toFileString() {
        return super.toFileString() + ";" + funcao + ";" + turnoTrabalho + ";" + animal;
    }
}