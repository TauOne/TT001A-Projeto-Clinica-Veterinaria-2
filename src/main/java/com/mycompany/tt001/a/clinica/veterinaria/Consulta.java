package com.mycompany.tt001.a.clinica.veterinaria;

import java.util.Date;

/**
 *
 * @author t247599
 */
public class Consulta {
    private Date dataConsulta;
    private String relatoConsulta;

    public Consulta(Date dataConsulta, String relatoConsulta) {
        this.dataConsulta = dataConsulta;
        this.relatoConsulta = relatoConsulta;
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
    
    
}
