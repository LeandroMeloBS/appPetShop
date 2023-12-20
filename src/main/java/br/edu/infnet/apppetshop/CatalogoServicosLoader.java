package br.edu.infnet.apppetshop;

import br.edu.infnet.apppetshop.model.domain.CatalogoServicos;
import br.edu.infnet.apppetshop.model.service.CatalogoServicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Order(5)
@Component
public class CatalogoServicosLoader implements ApplicationRunner {

    @Autowired
    private CatalogoServicosService catalogoServicosService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("files/catalogoservicos.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        String[] campos = null;

        while (linha != null) {

            campos = linha.split(";");
            List<String> servicos = new ArrayList<>();

            if (campos.length > 4) {
                String[] servicosArray = campos[4].split(",");
                for (String servico : servicosArray) {
                    servicos.add(servico);
                }
            }

            CatalogoServicos catalogoServicos = new CatalogoServicos(campos[0], Double.parseDouble(campos[1]), Integer.parseInt(campos[2]), Boolean.parseBoolean(campos[3]), servicos);

            catalogoServicosService.incluir(catalogoServicos);

            System.out.println("[CatalogoServicos] Nome do Serviço: " + catalogoServicos.getNomeServico() + ", Preço: " + catalogoServicos.getPreco() +
                    ", Duração (minutos): " + catalogoServicos.getDuracaoMinutos() + ", Disponível para Agendamento: " + catalogoServicos.isDisponivelParaAgendamento() +
                    ", Serviços Adicionais: " + String.join(", ", catalogoServicos.getServicos()) +
                    " - Inclusão realizada com sucesso!");
            linha = leitura.readLine();
        }

        leitura.close();
    }
}
