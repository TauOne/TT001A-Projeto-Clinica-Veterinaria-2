package com.mycompany.tt001.a.clinica.veterinaria;

/**
 *
 * @author t247599
 */
public class Tratamento {
    private String dataInicialTratamento;
    private String dataFinalTratamento;

    public Tratamento(String dataInicialTratamento, String dataFinalTratamento) {
        this.dataInicialTratamento = dataInicialTratamento;
        this.dataFinalTratamento = dataFinalTratamento;
    }

    public String getDataInicialTratamento() {
        return dataInicialTratamento;
    }

    public void setDataInicialTratamento(String dataInicialTratamento) {
        this.dataInicialTratamento = dataInicialTratamento;
    }

    public String getDataFinalTratamento() {
        return dataFinalTratamento;
    }

    public void setDataFinalTratamento(String dataFinalTratamento) {
        this.dataFinalTratamento = dataFinalTratamento;
    }
    
     
}
