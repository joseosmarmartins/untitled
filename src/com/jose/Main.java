package com.jose;

import com.jose.model.Contato;
import com.jose.model.Dependente;
import com.jose.model.Hospede;
import com.jose.model.Quarto;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        System.out.println(novoHospede().toString());
    }

    private static Hospede novoHospede() {
        //cria novo objeto hospede inicializando com atributos necessarios
        Hospede hospede = new Hospede("Marcos Mario das Dores", "556.398.339-04", "marcos_92570@mail.com", new GregorianCalendar(1996, 1, 06).getTime());
        //seta contato no hospede
        hospede.setContato(novoContato());
        //seta quarto no hospede
        hospede.setQuarto(novoQuarto());
        //adiciona um dependente a lista de dependentes
        hospede.getDependentes().add(novoDependente());

        return hospede;
    }

    private static Contato novoContato() {
        //cria novo objeto contato inicializando com atributos necessarios
        Contato contato = new Contato("Rua dos bobos, numero zero", "64 9 9934-5671", "64 9 9934-5672");

        return contato;
    }

    private static Quarto novoQuarto() {
        //define as datas de hospedagem, chegada e saida do hospede
        Date dataInicial = new GregorianCalendar(2018, 4, 25).getTime();
        Date dataFinal = new GregorianCalendar(2018, 4, 27).getTime();
        Date dataHoraChegada = new GregorianCalendar(2018, 4, 25, 13, 0).getTime();
        Date dataHoraSaida = new GregorianCalendar(2018, 4, 27, 11, 0).getTime();

        //cria novo objeto quarto inicializando com atributos necessarios
        Quarto quarto = new Quarto(101, dataInicial, dataFinal, dataHoraChegada, dataHoraSaida);

        return quarto;
    }

    private static Dependente novoDependente() {
        //cria novo objeto dependente inicializando com atributos necessarios
        Dependente dependente = new Dependente("Maria das Gracias", new GregorianCalendar(1997, 3, 2).getTime(), "feminino", "015.745.527-08");

        return dependente;
    }
}
