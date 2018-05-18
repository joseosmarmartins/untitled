package com.jose.model;

import java.util.Date;

public class Dependente {

    //region atributos
    private long serialVersionUID;

    private long id;
    private String nome;
    private Date dataNascimento;
    private String sexo;
    private String cpf;
    //endregion

    //construtor padrao
    public Dependente() {
    }

    //construtor para inicializar um novo objeto dependente
    public Dependente(String nome, Date dataNascimento, String sexo, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    //region metodos encapsulados
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //endregion
}
