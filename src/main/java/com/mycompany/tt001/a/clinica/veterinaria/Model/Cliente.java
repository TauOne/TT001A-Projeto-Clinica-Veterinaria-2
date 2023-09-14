package model;

/**
 *
 * @author Plinio Vilela
 */
public class Cliente {
    private int id;
    private String nomeCliente;
    private String enderecoCliente;
    private String cepCliente;
    private String emailCliente;
    private String telefoneCliente;
    
    //private List<Animal> animais;
    
// Bug001: A ordem dos parâmetros no construtor estava trocada, ao carregar os dados novamente do banco os campos ficavam
//   invertidos na JTable

    public Cliente(int id, String nomeCliente, String enderecoCliente, String cepCliente, String emailCliente, String telefoneCliente) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.cepCliente = cepCliente;
        this.emailCliente = emailCliente;
        this.telefoneCliente = telefoneCliente;             
    }
    
    public int getId(){
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }
    
    public void setEmailCliente(String emailCliente){
        if(!emailCliente.equals("")){
            this.emailCliente = emailCliente;
        }
    }

    public void setnomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }
    
    @Override
    public String toString() {        
        String desc = "Cliente{" + "id = " + id + ", nome = " + nomeCliente + ", endereco = " + enderecoCliente + ", cep = " + cepCliente + ", email = " + emailCliente+ ", phone = " + telefoneCliente + '}';
        return desc;
    }    
}
