package com.jose.model;

public class Contato {

    //region atributos
    private long serialVersionUID;

    private long id;
    private String endereco;
    private String telefone;
    private String telefoneContato;
    //endregion

    //construtor padrao
    public Contato() {
    }

    //construtor para inicializar um novo objeto contato
    public Contato(String endereco, String telefone, String telefoneContato) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.telefoneContato = telefoneContato;
    }

    //region metodos encapsulados
    public long getId() {
        return id;
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

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
    //endregion

    //implementa toString para printar na tela
    @Override
    public String toString() {
        return "Contato{" +
                "endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}
