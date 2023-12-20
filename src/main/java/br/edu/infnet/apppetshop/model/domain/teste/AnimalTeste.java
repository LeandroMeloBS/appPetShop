package br.edu.infnet.apppetshop.model.domain.teste;

import br.edu.infnet.apppetshop.model.domain.Animal;

public class AnimalTeste {

    public static void main(String[] args) {
        Animal animal = new Animal("Bolinha", "Cachorro", "Vira-lata", "Macho", 3, 5.5, true);
                
        System.out.println("Detalhes do Animal:");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Raça: " + animal.getRaca());
        System.out.println("Sexo: " + animal.getSexo());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.println("Peso: " + animal.getPeso() + " kg");
        System.out.println("Vacinado: " + animal.isVacinado());
    }
}

