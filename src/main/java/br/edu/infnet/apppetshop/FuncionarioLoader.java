package br.edu.infnet.apppetshop;

import br.edu.infnet.apppetshop.model.domain.Animal;
import br.edu.infnet.apppetshop.model.domain.Funcionario;
import br.edu.infnet.apppetshop.model.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(3)
@Component
public class FuncionarioLoader implements ApplicationRunner {

    @Autowired
    private FuncionarioService funcionarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("files/funcionarios.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        String[] campos;

        while (linha != null) {
            campos = linha.split(";");
            if (campos.length >= 4) {
                Funcionario funcionario = new Funcionario(campos[0], campos[1], campos[2], campos[3], null);

                if (campos.length >= 10) {
                    Animal animal = new Animal(campos[4], campos[5], campos[6], campos[7], Integer.parseInt(campos[8]), Double.parseDouble(campos[9]), Boolean.parseBoolean(campos[10]));
                    funcionario.setAnimal(animal);
                }

                funcionarioService.incluir(funcionario);

                System.out.println("[Funcionario] Detalhes do Funcionário:");
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("CPF: " + funcionario.getCpf());
                System.out.println("Função: " + funcionario.getFuncao());
                System.out.println("Turno de Trabalho: " + funcionario.getTurnoTrabalho());
                System.out.println("Animal: " + funcionario.getAnimal() + " - Inclusão realizada com sucesso!");
            } else {
                System.err.println("Erro: A linha não tem a quantidade esperada de campos para criar um Funcionário.");
            }

            linha = leitura.readLine();
        }
        leitura.close();
    }
}
