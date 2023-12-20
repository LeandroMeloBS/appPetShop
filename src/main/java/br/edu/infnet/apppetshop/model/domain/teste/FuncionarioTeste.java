package br.edu.infnet.apppetshop.model.domain.teste;

import br.edu.infnet.apppetshop.model.domain.Animal;
import br.edu.infnet.apppetshop.model.domain.Funcionario;

public class FuncionarioTeste {

    public static void main(String[] args) {
        Animal animal = new Animal("Bolinha", "Cachorro", "Vira-lata", "Macho", 3, 5.5, true);
        Funcionario funcionario = new Funcionario("Lucas", "123456789", "Tosador", "Manhã", animal);

        System.out.println("Detalhes do Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Função: " + funcionario.getFuncao());
        System.out.println("Turno de Trabalho: " + funcionario.getTurnoTrabalho());
    }
}

