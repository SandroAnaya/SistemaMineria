package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    String bd = "sistemamineria";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "blesshome";
    String driver = "com.mysql.cj.jdbc.Driver";

    public Connection cadena;
    public static Conexion instacia;

    private Conexion() {
        this.cadena = null;
    }

    public Connection conectar() {
        try {

            Class.forName(driver);
            cadena = DriverManager.getConnection(url + bd, user, password);
            System.out.println("Conectado");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
        return cadena;
    }

    public void desconectar() {
        try {
            this.cadena.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public synchronized static Conexion getInstancia(){
        if (instacia == null) {
            instacia=new Conexion();
        }
        return instacia;
    }
    
    
    public static void main(String[] args) {
        Conexion cn = Conexion.getInstancia();
        cn.conectar();
    }
}
