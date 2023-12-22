package br.edu.infnet.apppetshop.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Animal {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  private String nome;
  private String especie;
  private String raca;
  private String sexo;
  private int idade;
  private double peso;
  private boolean vacinado;
  
  @ManyToMany(mappedBy = "animaisAgendados")
  private List<AgendamentoServicos> agendamentos;
  
  public Animal() {
  }

  public Animal(String nome, String especie, String raca, String sexo, int idade, double peso, boolean vacinado) {
      this.nome = nome;
      this.especie = especie;
      this.raca = raca;
      this.sexo = sexo;
      this.idade = idade;
      this.peso = peso;
      this.vacinado = vacinado;
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }
    
    public List<AgendamentoServicos> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<AgendamentoServicos> agendamentos) {
        this.agendamentos = agendamentos;
    }

    @Override
    public String toString() {
        return String.format("[Animal] ID: %d; Nome: %s; Espécie: %s; Raça: %s; Sexo: %s; Idade: %d; Peso: %.2f; Vacinado: %s",
                id, nome, especie, raca, sexo, idade, peso, vacinado ? "Sim" : "Não");
    }

    public String toFileString() {
        return String.format("%d;%s;%s;%s;%s;%d;%.2f;%s", id, nome, especie, raca, sexo, idade, peso, vacinado);
    }
}