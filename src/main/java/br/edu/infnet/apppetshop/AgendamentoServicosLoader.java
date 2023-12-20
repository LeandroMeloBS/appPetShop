package br.edu.infnet.apppetshop;

import br.edu.infnet.apppetshop.model.domain.AgendamentoServicos;
import br.edu.infnet.apppetshop.model.domain.Funcionario;
import br.edu.infnet.apppetshop.model.domain.ProprietarioDoAnimal;
import br.edu.infnet.apppetshop.model.service.AgendamentoServicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Order(6)
@Component
public class AgendamentoServicosLoader implements ApplicationRunner {

    @Autowired
    private AgendamentoServicosService agendamentoServicosService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Funcionario funcionario = new Funcionario("Lucas", "123456789", "Tosador", "Manhã", null);
        ProprietarioDoAnimal proprietario = new ProprietarioDoAnimal("Carlos", "5555555555", "Rua B", "1122222222", "carlos@email.com");

        AgendamentoServicos agendamento = new AgendamentoServicos(
                LocalDateTime.now(),
                Arrays.asList(funcionario),
                Arrays.asList(proprietario),
                true,
                LocalDateTime.now().plusHours(2)
        );

        agendamentoServicosService.incluir(agendamento);

        System.out.println("[AgendamentoServicos] Detalhes do Agendamento:");
        System.out.println("Data do Agendamento: " + agendamento.getDataAgendamento());
        System.out.println("Funcionários Agendados: " + agendamento.getFuncionariosAgendados());
        System.out.println("Proprietários Agendados: " + agendamento.getProprietariosAgendados());
        System.out.println("Confirmado: " + agendamento.isConfirmado());
        System.out.println("Data de Conclusão: " + agendamento.getDataConclusao() + " - Inclusão realizada com sucesso!");
    }
}
