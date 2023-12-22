package br.edu.infnet.apppetshop.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity

public class AgendamentoServicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime dataAgendamento;

    @ManyToMany
    private List<Funcionario> funcionariosAgendados;

    @ManyToMany
    private List<ProprietarioDoAnimal> proprietariosAgendados;
    
    @ManyToMany
    @JoinTable(
        name = "agendamento_animal",
        joinColumns = @JoinColumn(name = "agendamento_id"),
        inverseJoinColumns = @JoinColumn(name = "animal_id")
    )
    private List<Animal> animaisAgendados;


    private boolean confirmado;
    private LocalDateTime dataConclusao;

    public AgendamentoServicos() {
        
    }

    public AgendamentoServicos(LocalDateTime dataAgendamento, List<Funcionario> funcionariosAgendados,
                               List<ProprietarioDoAnimal> proprietariosAgendados, boolean confirmado,
                               LocalDateTime dataConclusao) {
        this.dataAgendamento = dataAgendamento;
        this.funcionariosAgendados = funcionariosAgendados;
        this.proprietariosAgendados = proprietariosAgendados;
        this.confirmado = confirmado;
        this.dataConclusao = dataConclusao;
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDateTime dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public List<Funcionario> getFuncionariosAgendados() {
        return funcionariosAgendados;
    }

    public void setFuncionariosAgendados(List<Funcionario> funcionariosAgendados) {
        this.funcionariosAgendados = funcionariosAgendados;
    }

    public List<ProprietarioDoAnimal> getProprietariosAgendados() {
        return proprietariosAgendados;
    }

    public void setProprietariosAgendados(List<ProprietarioDoAnimal> proprietariosAgendados) {
        this.proprietariosAgendados = proprietariosAgendados;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDateTime dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public void agendadoPara(Funcionario funcionario) {
        this.funcionariosAgendados.add(funcionario);
    }

    public void agendadoPor(ProprietarioDoAnimal proprietario) {
        this.proprietariosAgendados.add(proprietario);
    }

    @Override
    public String toString() {
        return String.format("[AgendamentoServicos] ID: %d; Data de Agendamento: %s; Confirmado: %s; Data de Conclusão: %s",
                id, dataAgendamento, confirmado ? "Sim" : "Não", dataConclusao);
    }

    public String toFileString() {
        StringBuilder funcionarios = new StringBuilder();
        for (Funcionario func : funcionariosAgendados) {
            funcionarios.append(func.getNome()).append(";").append(func.getCpf()).append(";");
        }

        StringBuilder proprietarios = new StringBuilder();
        for (ProprietarioDoAnimal prop : proprietariosAgendados) {
            proprietarios.append(prop.getNome()).append(";").append(prop.getCpf()).append(";");
        }

        return String.format("%s;%s;%s;%s;%s;%s", dataAgendamento, funcionarios.toString(),
                proprietarios.toString(), confirmado, dataConclusao);
    }
}
