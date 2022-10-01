package Datos;

import Database.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DashboardDAO {

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public DashboardDAO() {
        CON = Conexion.getInstancia();
    }

    public int TotalDeClientes() {
        int totalRegistros = 0;
        try {
            ps = CON.conectar().prepareStatement("select count(*) from clientes;");
            rs = ps.executeQuery();

            while (rs.next()) {
                totalRegistros = rs.getInt("count(*)");
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return totalRegistros;
    }

    public int TotalDeServicios() {
        int totalRegistros = 0;
        try {
            ps = CON.conectar().prepareStatement("select count(*) from servicios;");
            rs = ps.executeQuery();

            while (rs.next()) {
                totalRegistros = rs.getInt("count(*)");
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return totalRegistros;
    }

    public int TotalDeUsuarios() {
        return 0;
    }

    public int TotalDePedidos() {
        return 0;
    }
}
