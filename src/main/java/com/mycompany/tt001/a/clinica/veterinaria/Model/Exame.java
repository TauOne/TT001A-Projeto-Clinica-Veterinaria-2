package com.mycompany.tt001.a.clinica.veterinaria.Model;

/**
 *
 * @author t247599
 */
public class Exame {
    private int id;
    private String descricaoExame;
    private int idConsulta;

    public Exame(int id, String descricaoExame,int idConsulta) {
        this.id = id;
        this.descricaoExame = descricaoExame;
        this.idConsulta = idConsulta;
    }

    public String getDescricaoExame() {
        return descricaoExame;
    }

    public void setDescricaoExame(String descricaoExame) {
        this.descricaoExame = descricaoExame;
    }

    public int getId() {
        return id;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }
    
    
}
