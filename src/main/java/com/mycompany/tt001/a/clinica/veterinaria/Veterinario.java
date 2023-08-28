package com.mycompany.tt001.a.clinica.veterinaria;

/**
 *
 * @author t247599
 */
public class Veterinario {
    private String nomeVeterinario;
    private String enderecoVeterinario;
    private String cepVeterinario;
    private String telefoneVeterinario;
    private String emailVeterinario;

    public Veterinario(String nomeVeterinario, String enderecoVeterinario, String cepVeterinario, String telefoneVeterinario, String emailVeterinario) {
        this.nomeVeterinario = nomeVeterinario;
        this.enderecoVeterinario = enderecoVeterinario;
        this.cepVeterinario = cepVeterinario;
        this.telefoneVeterinario = telefoneVeterinario;
        this.emailVeterinario = emailVeterinario;
    }

    public String getNomeVeterinario() {
        return nomeVeterinario;
    }

    public void setNomeVeterinario(String nomeVeterinario) {
        this.nomeVeterinario = nomeVeterinario;
    }

    public String getEnderecoVeterinario() {
        return enderecoVeterinario;
    }

    public void setEnderecoVeterinario(String enderecoVeterinario) {
        this.enderecoVeterinario = enderecoVeterinario;
    }

    public String getCepVeterinario() {
        return cepVeterinario;
    }

    public void setCepVeterinario(String cepVeterinario) {
        this.cepVeterinario = cepVeterinario;
    }

    public String getTelefoneVeterinario() {
        return telefoneVeterinario;
    }

    public void setTelefoneVeterinario(String telefoneVeterinario) {
        this.telefoneVeterinario = telefoneVeterinario;
    }

    public String getEmailVeterinario() {
        return emailVeterinario;
    }

    public void setEmailVeterinario(String emailVeterinario) {
        this.emailVeterinario = emailVeterinario;
    }

    
}
