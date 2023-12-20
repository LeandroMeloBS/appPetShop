package br.edu.infnet.apppetshop.model.domain;

public class ProprietarioDoAnimal extends Pessoa {
    private String endereco;
    private String telefone;
    private String email;

    public ProprietarioDoAnimal(String nome, String cpf, String endereco, String telefone, String email) {
        super(nome, cpf);
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("; Endereço: %s; Telefone: %s; Email: %s", endereco, telefone, email);
    }

    @Override
    public String toFileString() {
        return super.toFileString() + ";" + endereco + ";" + telefone + ";" + email;
    }
}

