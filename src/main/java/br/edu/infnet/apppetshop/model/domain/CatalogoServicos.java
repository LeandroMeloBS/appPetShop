package br.edu.infnet.apppetshop.model.domain;

import java.util.ArrayList;
import java.util.List;

public class CatalogoServicos {
    private String nomeServico;
    private double preco;
    private int duracaoMinutos;
    private boolean disponivelParaAgendamento;
    private List<String> servicos;

    public CatalogoServicos(String nomeServico, double preco, int duracaoMinutos, boolean disponivelParaAgendamento, List<String> servicos) {
        this.nomeServico = nomeServico;
        this.preco = preco;
        this.duracaoMinutos = duracaoMinutos;
        this.disponivelParaAgendamento = disponivelParaAgendamento;
        this.servicos = servicos;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public boolean isDisponivelParaAgendamento() {
        return disponivelParaAgendamento;
    }

    public void setDisponivelParaAgendamento(boolean disponivelParaAgendamento) {
        this.disponivelParaAgendamento = disponivelParaAgendamento;
    }

    public List<String> getServicos() {
        return servicos;
    }

    public void adicionarServico(String servico) {
        this.servicos.add(servico);
    }

    @Override
    public String toString() {
        return String.format("[CatalogoServicos] Nome do Serviço: %s; Preço: %.2f; Duração: %d minutos; Disponível para Agendamento: %s; Serviços Adicionais: %s",
                nomeServico, preco, duracaoMinutos, disponivelParaAgendamento ? "Sim" : "Não", String.join(", ", servicos));
    }

    public String toFileString() {
        return String.format("%s;%.2f;%d;%s;%s", nomeServico, preco, duracaoMinutos, disponivelParaAgendamento, String.join(",", servicos));
    }
}

