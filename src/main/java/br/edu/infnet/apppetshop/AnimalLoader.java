package br.edu.infnet.apppetshop;

import br.edu.infnet.apppetshop.model.domain.Animal;
import br.edu.infnet.apppetshop.model.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(4)
@Component
public class AnimalLoader implements ApplicationRunner {

    @Autowired
    private AnimalService animalService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("files/animais.txt");
        BufferedReader leitura = new BufferedReader(file);
        String linha = leitura.readLine();
        String[] campos = null;

        while (linha != null) {

            campos = linha.split(";");
            Animal animal = new Animal(null, null, null, null, 0, 0.0, false);
            animal.setNome(campos[0]);
            animal.setEspecie(campos[1]);
            animal.setRaca(campos[2]);
            animal.setSexo(campos[3]);
            animal.setIdade(Integer.parseInt(campos[4]));
            animal.setPeso(Double.parseDouble(campos[5]));
            animal.setVacinado(Boolean.parseBoolean(campos[6]));

            animalService.incluir(animal);

            System.out.println("[Animal] Nome: " + animal.getNome() + ", Espécie: " + animal.getEspecie() + " - Inclusão realizada com sucesso!");
            linha = leitura.readLine();
        }

        for (Animal animal : animalService.obterLista()) {
            System.out.println("[Animal] " + animal);
        }

        leitura.close();
    }
}
