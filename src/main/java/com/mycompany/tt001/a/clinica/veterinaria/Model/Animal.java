package com.mycompany.tt001.a.clinica.veterinaria.Model;

/**
 *
 * @author t247599
 */
public class Animal {
    private int id;
    private int idCliente;
    private int idEspecie;
    private String nomeAnimal;
    private int idadeAnimal;
    private int sexoAnimal;

    public Animal(int id, int idCliente, int idEspecie, String nomeAnimal, int idadeAnimal, int sexoAnimal) {
        this.id = id;
        this.idCliente = idCliente;
        this.idEspecie = idEspecie;
        this.nomeAnimal = nomeAnimal;
        this.idadeAnimal = idadeAnimal;
        this.sexoAnimal = sexoAnimal;
    }

    public int getId() {
        return id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }

    public int getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(int sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    
    
    
}
