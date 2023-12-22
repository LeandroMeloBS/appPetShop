package br.edu.infnet.apppetshop.model.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ProprietarioDoAnimal extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String endereco;
    private String telefone;
    private String email;

    @ManyToMany(mappedBy = "proprietariosAgendados")
    private List<AgendamentoServicos> agendamentos;

    public ProprietarioDoAnimal(String nome, String cpf, String endereco, String telefone, String email) {
        super(nome, cpf);
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<AgendamentoServicos> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<AgendamentoServicos> agendamentos) {
        this.agendamentos = agendamentos;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("; Endereço: %s; Telefone: %s; Email: %s", endereco, telefone, email);
    }

    @Override
    public String toFileString() {
        return super.toFileString() + ";" + endereco + ";" + telefone + ";" + email;
    }
}
