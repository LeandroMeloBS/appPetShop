package br.edu.infnet.apppetshop.model.domain.teste;

import br.edu.infnet.apppetshop.model.domain.CatalogoServicos;

import java.util.List;

public class CatalogoServicosTeste {

    public static void main(String[] args) {
        CatalogoServicos catalogo1 = new CatalogoServicos("Banho e Tosa", 50.0, 60, true, List.of("Banho", "Tosa higiênica", "Hidratação"));
        CatalogoServicos catalogo2 = new CatalogoServicos("Consulta Veterinária", 80.0, 30, true, List.of("Exame físico", "Prescrição de medicamentos"));
        CatalogoServicos catalogo3 = new CatalogoServicos("Vacinação", 40.0, 15, true, List.of("V8", "Antirrábica"));

        System.out.println("[CatalogoServicos] Detalhes do Serviço 1:");
        System.out.println("Nome do Serviço: " + catalogo1.getNomeServico());
        System.out.println("Preço: " + catalogo1.getPreco());
        System.out.println("Duração (minutos): " + catalogo1.getDuracaoMinutos());
        System.out.println("Disponível para Agendamento: " + catalogo1.isDisponivelParaAgendamento());
        System.out.println("Serviços Adicionais: " + String.join(", ", catalogo1.getServicos()));
        System.out.println(" - Inclusão realizada com sucesso!");

        System.out.println("\n[CatalogoServicos] Detalhes do Serviço 2:");
        System.out.println("Nome do Serviço: " + catalogo2.getNomeServico());
        System.out.println("Preço: " + catalogo2.getPreco());
        System.out.println("Duração (minutos): " + catalogo2.getDuracaoMinutos());
        System.out.println("Disponível para Agendamento: " + catalogo2.isDisponivelParaAgendamento());
        System.out.println("Serviços Adicionais: " + String.join(", ", catalogo2.getServicos()));
        System.out.println(" - Inclusão realizada com sucesso!");

        System.out.println("\n[CatalogoServicos] Detalhes do Serviço 3:");
        System.out.println("Nome do Serviço: " + catalogo3.getNomeServico());
        System.out.println("Preço: " + catalogo3.getPreco());
        System.out.println("Duração (minutos): " + catalogo3.getDuracaoMinutos());
        System.out.println("Disponível para Agendamento: " + catalogo3.isDisponivelParaAgendamento());
        System.out.println("Serviços Adicionais: " + String.join(", ", catalogo3.getServicos()));
        System.out.println(" - Inclusão realizada com sucesso!");
    }
}

