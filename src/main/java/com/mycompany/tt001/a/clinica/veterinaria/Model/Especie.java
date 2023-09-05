package com.mycompany.tt001.a.clinica.veterinaria.Model;

/**
 *
 * @author t247599
 */
public class Especie {
    private int id;
    private String nomeEspecie;

    public Especie(int id, String nomeEspecie) {
        this.id = id;
        this.nomeEspecie = nomeEspecie;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public int getId() {
        return id;
    }
}
