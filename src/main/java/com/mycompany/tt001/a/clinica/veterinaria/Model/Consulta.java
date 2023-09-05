package com.mycompany.tt001.a.clinica.veterinaria.Model;

import java.util.Date;

/**
 *
 * @author t247599
 */
public class Consulta {
    private int id;
    private Date dataConsulta;
    private String relatoConsulta;
    private String horarioConsulta;
    private int idAnimal;
    private int idVeterinario;
    private int idTratamento;
    private int terminado;

    public Consulta(int id, Date dataConsulta, String relatoConsulta, String horarioConsulta, int idAnimal, int idVeterinario, int idTratamento, int terminado) {
        this.id = id;
        this.dataConsulta = dataConsulta;
        this.relatoConsulta = relatoConsulta;
        this.horarioConsulta = horarioConsulta;
        this.idAnimal = idAnimal;
        this.idVeterinario = idVeterinario;
        this.idTratamento = idTratamento;
        this.terminado = terminado;
    }

    public int getId() {
        return id;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getRelatoConsulta() {
        return relatoConsulta;
    }

    public void setRelatoConsulta(String relatoConsulta) {
        this.relatoConsulta = relatoConsulta;
    }

    public String getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(String horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public int getIdTratamento() {
        return idTratamento;
    }

    public void setIdTratamento(int idTratamento) {
        this.idTratamento = idTratamento;
    }

    public int getTerminado() {
        return terminado;
    }

    public void setTerminado(int terminado) {
        this.terminado = terminado;
    }
    
    
    
    
}
