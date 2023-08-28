package com.mycompany.tt001.a.clinica.veterinaria;

/**
 *
 * @author t247599
 */
public class Cliente {
    private String nomeCliente;
    private String enderecoCliente;
    private Long cepCliente;
    private String telefoneCliente;
    private String emailCliente;

    public Cliente(String nomeCliente, String enderecoCliente, Long cepCliente, String telefoneCliente, String emailCliente) {
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.cepCliente = cepCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public Long getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(Long cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    
    
}
