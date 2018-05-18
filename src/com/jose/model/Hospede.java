package com.jose.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hospede {

    //region atributos
    private long serialVersionUID;

    private long id;
    private String nome;
    private String cpf;
    private String email;
    private Date dataNascimento;

    //(relaçao das tabelas baseadas do nome no diagrama - singular ou plural)
    //hospede possui um contato
    private Contato contato;

    //hospede possui um quarto
    private Quarto quarto;

    //hospede possui uma lista de dependentes
    //inicializa lista com um array vazio para evitar NullPointerException ao adicionar item a uma lista nula
    private List<Dependente> dependentes = new ArrayList<Dependente>();
    //endregion

    //construtor padrao
    public Hospede() {
    }

    //construtor para inicializar um novo objeto hospede
    public Hospede(String nome, String cpf, String email, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    //region encapsulamento dos atributos
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    //endregion

    //region encapsulamento dos relacionametos da classe Hospede
    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }
    //endregion

    //implementa toString para printar hospede na tela
    @Override
    public String toString() {
        return "Hospede{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + new SimpleDateFormat("dd/MM/yyyy").format(dataNascimento) +
                ", contato=" + contato.toString() +
                ", quarto=" + quarto.toString() +
                ", dependentes=" + dependentes.size() +
                '}';
    }
}
