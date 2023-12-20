package br.edu.infnet.apppetshop.model.domain.teste;

import br.edu.infnet.apppetshop.model.domain.ProprietarioDoAnimal;

public class ProprietarioDoAnimalTeste {

    public static void main(String[] args) {
        ProprietarioDoAnimal proprietario = new ProprietarioDoAnimal("Maria", "987654321", "Rua A", "123456789", "maria@email.com");

        System.out.println("Detalhes do Proprietário:");
        System.out.println("Nome: " + proprietario.getNome());
        System.out.println("CPF: " + proprietario.getCpf());
        System.out.println("Endereço: " + proprietario.getEndereco());
        System.out.println("Telefone: " + proprietario.getTelefone());
        System.out.println("E-mail: " + proprietario.getEmail());
    }
}
