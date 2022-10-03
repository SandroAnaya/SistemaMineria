package Datos;

import Database.Conexion;
import interfaces.CrudSimpleInterface;
import Entidades.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO implements CrudSimpleInterface<Cliente> {

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public ClienteDAO() {
        CON = Conexion.getInstancia();
    }

    @Override
    public List<Cliente> listar(String texto) {
        List<Cliente> registros = new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("SELECT ID_CLIENTE,nombre,apellido,direccion,dni,celular "
                    + "FROM sistemamineria.clientes WHERE nombre LIKE ? ORDER BY ID_CLIENTE ASC ");
            ps.setString(1, "%" + texto + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
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
    public boolean insertar(Cliente obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO `sistemamineria`.`clientes`(`NOMBRE`,`APELLIDO`,`DNI`,`DIRECCION`,`CELULAR`) VALUES(?,?,?,?,?);");
            ps.setString(1, obj.getNombres());
            ps.setString(2, obj.getApellidos());
            ps.setString(3, obj.getDireccion());
            ps.setString(4, obj.getDni());
            ps.setString(5, obj.getCelular());
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
    public boolean actualizar(Cliente obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE `sistemamineria`.`clientes` SET `NOMBRE` = ?,`APELLIDO` = ?, `DNI` =?, `DIRECCION` = ?, `CELULAR` = ? WHERE `ID_CLIENTE` = ?;");
            ps.setString(1, obj.getNombres());
            ps.setString(2, obj.getApellidos());
            ps.setString(3, obj.getDni());
            ps.setString(4, obj.getDireccion());
            ps.setString(5, obj.getCelular());
            ps.setInt(6, obj.getId());
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
            ps = CON.conectar().prepareStatement("DELETE FROM  sistemamineria.clientes WHERE ID_CLIENTE=?");
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
