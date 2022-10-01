package Datos;

import Database.Conexion;
import Entidades.Cliente;
import Entidades.Servicio;
import interfaces.CrudSimpleInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ServicioDAO implements CrudSimpleInterface<Servicio> {

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public ServicioDAO() {
        this.CON = Conexion.getInstancia();
    }

    @Override
    public List<Servicio> listar(String texto) {
        List<Servicio> registros = new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("select id_Servicio,nombre,caracterisiticas from servicios where nombre LIKE ?; ");
            ps.setString(1, "%" + texto + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new Servicio(rs.getInt(1), rs.getString(2), rs.getString(3)));
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
        return registros;
    }

    @Override
    public boolean insertar(Servicio obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO `sistemamineria`.`servicios`(`NOMBRE`,`CARACTERISITICAS`) VALUES(?,?);");
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getCaracteristicas());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public boolean actualizar(Servicio obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("update servicios set nombre = ?, CARACTERISITICAS=? where ID_SERVICIO=?");
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getCaracteristicas());
            ps.setInt(3, obj.getIdServicio());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public boolean desactivar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean activar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existe(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean anular(int id) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("delete from servicios where ID_SERVICIO=?;");
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;
    }

}
