package com.mycompany.tt001.a.clinica.veterinaria.View;

import model.Cliente;
import com.mycompany.tt001.a.clinica.veterinaria.Model.ClienteDAO;

/**
 *
 * @author t247599
 */
public class Tt001AClinicaVeterinaria {

    public static void main(String[] args) {
        
        ClienteDAO.getInstance().create("Saadhak", "Los Angeles", "NRG", "saadhak@nrg.com", "shazam");
        
        
        
        for(Cliente clientes : ClienteDAO.getInstance().retrieveAll()){
            System.out.println(clientes);
        }
    }
}