package model;

// DAO Implementation for H2 Database.
/**
 * @author Plinio Vilela
 * @date 16 de Agosto de 2021
 */
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class DAO {
    public static final String DBURL = "jdbc:h2:./teste.db";
    private static Connection con;
    protected static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    // Connect to SQLite
    public static Connection getConnection() {
        if (con == null) {
            try {
                con = DriverManager.getConnection(DBURL);
                if (con != null) {
                    DatabaseMetaData meta = con.getMetaData();
                }
            } catch (SQLException e) {
                System.err.println("Exception: " + e.getMessage());
            }
        }
        return con;
    }

    protected ResultSet getResultSet(String query) {
        Statement s;
        ResultSet rs = null;
        try {
            s = (Statement) con.createStatement();
            rs = s.executeQuery(query);
        } catch (SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return rs;
    }

    protected int executeUpdate(PreparedStatement queryStatement) throws SQLException {
        int update;
        update = queryStatement.executeUpdate();
        return update;
    }

    protected int lastId(String tableName, String primaryKey) {
        Statement s;
        int lastId = -1;
        try {
            s = (Statement) con.createStatement();
            ResultSet rs = s.executeQuery("SELECT MAX(" + primaryKey + ") AS id FROM " + tableName);
            if (rs.next()) {
                lastId = rs.getInt("id");
            }
        } catch (SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return lastId;
    }

    public static void terminar() {
        try {
            (DAO.getConnection()).close();
        } catch (SQLException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    // Create table SQLite
    protected final boolean createTable() {
        try {
            PreparedStatement stmt;
            // Table client:
            stmt = DAO.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS cliente( \n"
                    + "id INTEGER PRIMARY KEY AUTO_INCREMENT, \n"
                    + "nomeCliente VARCHAR, \n"
                    + "enderecoCliente VARCHAR, \n"
                    + "cepCliente VARCHAR, \n"
                    + "emailCliente VARCHAR, \n"
                    + "telefoneCliente VARCHAR); \n");
            executeUpdate(stmt);
            // Table animal:
            stmt = DAO.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS animal( \n"
                    + "id INTEGER PRIMARY KEY AUTO_INCREMENT, \n"
                    + "nomeAnimal VARCHAR, \n"
                    + "idadeAnimal INTEGER, \n"
                    + "sexoAnimal VARCHAR, \n"
                    + "idEspecie INTEGER, \n"
                    + "idCliente INTEGER); \n");
            executeUpdate(stmt);
            // Table species:
            stmt = DAO.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS especie( \n"
                    + "id INTEGER PRIMARY KEY AUTO_INCREMENT, \n"
                    + "nomeEspecie VARCHAR); \n");
            executeUpdate(stmt);
            // Table vet:
            stmt = DAO.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS veterinario( \n"
                    + "id INTEGER PRIMARY KEY AUTO_INCREMENT, \n"
                    + "nomeVeterinario VARCHAR, \n"
                    + "enderecoVeterinario VARCHAR, \n"
                    + "cepVeterinario VARCHAR, \n"
                    + "telefoneVeterinario  VARCHAR, \n"
                    + "emailVeterinario  VARCHAR); \n");
            executeUpdate(stmt);        
            // Table appointment:
            stmt = DAO.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS consulta( \n"
                    + "id INTEGER PRIMARY KEY AUTO_INCREMENT, \n"
                    + "dataConsulta DATE, \n"
                    + "horarioConsulta VARCHAR, \n"
                    + "relatoConsulta VARCHAR, \n"
                    + "idAnimal INTEGER, \n"
                    + "idVeterinario INTEGER, \n"
                    + "idTratamento INTEGER, \n"
                    + "terminado INTEGER); \n");
            executeUpdate(stmt);            
             // Table exam:
            stmt = DAO.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS exame( \n"
                    + "id INTEGER PRIMARY KEY AUTO_INCREMENT, \n"
                    + "descricaoExame VARCHAR, \n"
                    + "idConsulta INTEGER); \n");
            executeUpdate(stmt);      
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
