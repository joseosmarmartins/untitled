package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quarto {

    //region atributos
    private long serialVersionUID;

    private long id;
    private long numApto;
    private Date dataInicial;
    private Date dataFinal;
    private Date horarioChegada;
    private Date horarioSaida;
    //endregion

    //construtor padrao
    public Quarto() {
    }

    //construtor para inicializar um novo objeto quarto
    public Quarto(long numApto, Date dataInicial, Date dataFinal, Date horarioChegada, Date horarioSaida) {
        this.numApto = numApto;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.horarioChegada = horarioChegada;
        this.horarioSaida = horarioSaida;
    }

    //region metodos encapsulados
    public long getId() {
        return id;
    }

    public long getNumApto() {
        return numApto;
    }

    public void setNumApto(long numApto) {
        this.numApto = numApto;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Date getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(Date horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public Date getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(Date horarioSaida) {
        this.horarioSaida = horarioSaida;
    }
    //endregion

    //implementa toString para printar na tela
    @Override
    public String toString() {
        return "Quarto{" +
                "numApto=" + numApto +
                ", dataInicial=" + new SimpleDateFormat("dd/MM/yyyy").format(dataInicial) +
                ", dataFinal=" + new SimpleDateFormat("dd/MM/yyyy").format(dataFinal) +
                ", horarioChegada=" + new SimpleDateFormat("HH:mm").format(horarioChegada) +
                ", horarioSaida=" + new SimpleDateFormat("HH:mm").format(horarioSaida) +
                '}';
    }
}
