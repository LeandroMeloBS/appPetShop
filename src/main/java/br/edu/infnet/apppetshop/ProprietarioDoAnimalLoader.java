package br.edu.infnet.apppetshop;

import br.edu.infnet.apppetshop.model.domain.ProprietarioDoAnimal;
import br.edu.infnet.apppetshop.model.service.ProprietarioDoAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(2)
@Component
public class ProprietarioDoAnimalLoader implements ApplicationRunner {

    @Autowired
    private ProprietarioDoAnimalService proprietarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("files/proprietariosdosanimais.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        String[] campos;

        while (linha != null) {
            campos = linha.split(";");
            ProprietarioDoAnimal proprietario = new ProprietarioDoAnimal(campos[0], campos[1], campos[2], campos[3], campos[4]);

            proprietarioService.incluir(proprietario);

            System.out.println("[ProprietarioDoAnimal] Detalhes do Proprietário do Animal:");
            System.out.println("Nome: " + proprietario.getNome());
            System.out.println("CPF: " + proprietario.getCpf());
            System.out.println("Endereço: " + proprietario.getEndereco());
            System.out.println("Telefone: " + proprietario.getTelefone());
            System.out.println("Email: " + proprietario.getEmail() + " - Inclusão realizada com sucesso!");

            linha = leitura.readLine();
        }
        leitura.close();
    }
}
