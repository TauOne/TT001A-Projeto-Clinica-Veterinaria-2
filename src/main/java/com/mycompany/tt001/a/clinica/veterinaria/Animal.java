package com.mycompany.tt001.a.clinica.veterinaria;

/**
 *
 * @author t247599
 */
public class Animal {
    private String nomeAnimal;
    private int idadeAnimal;
    private int sexoAnimal;

    public Animal(String nomeAnimal, int idadeAnimal, int sexoAnimal) {
        this.nomeAnimal = nomeAnimal;
        this.idadeAnimal = idadeAnimal;
        this.sexoAnimal = sexoAnimal;
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
