package br.edu.infnet.apppetshop;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Pessoa;
import br.edu.infnet.apppetshop.model.service.PessoaService;
@Order(1)
@Component
public class PessoaLoader implements ApplicationRunner {
	
	
	@Autowired
	private PessoaService pessoaService;
	
    @Override
    public void run(ApplicationArguments args) throws Exception {
        
    	FileReader file = new FileReader("files/pessoas.txt");
    	BufferedReader leitura = new BufferedReader(file);
    	String linha = leitura.readLine();
    	String[] campos = null;
    	
    	while(linha !=null) {
    		
    		campos = linha.split(";");
    		Pessoa pessoa = new Pessoa(null, null);
            pessoa.setNome(campos[0]);
            pessoa.setCpf(campos[1]);
            
         
            
            
            pessoaService.incluir(pessoa);
            
            linha = leitura.readLine();
    	}   
            
    	    	
    	for(Pessoa pessoa : pessoaService.obterLista()) {
            	
            	System.out.println("[Pessoa]" + pessoa); 	
            }
            

     	
    	leitura.close();
  }
}
