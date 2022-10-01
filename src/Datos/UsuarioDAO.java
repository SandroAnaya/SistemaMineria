package Datos;

import Database.Conexion;
import Entidades.Usuario;
import interfaces.CrudSimpleInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO implements CrudSimpleInterface<Usuario> {

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    boolean resp;
    public UsuarioDAO() {
        CON = Conexion.getInstancia();
    }

    public Usuario login(String usuario, String clave) {
        Usuario usu = null;
        try {
            ps = CON.conectar().prepareStatement("select ID_USUARIO,nombre,apellido,dni,direccion,celular,usuario,clave,CODIGOVERIFICACION,rol from usuarios where usuario=? and clave=? ");
            ps.setString(1, usuario);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            rs.next();
            usu = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10));

            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return usu;
    }

    public boolean ChangePassoword(String user, String clave, String codigoverificacion) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("update usuarios set clave=? where usuario=? and CODIGOVERIFICACION=? ");
            ps.setString(1,clave);
            ps.setString(2,user);
            ps.setString(3,codigoverificacion);
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
    public List<Usuario> listar(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insertar(Usuario obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Usuario obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
