package Negocio;

import Datos.UsuarioDAO;
import Datos.VariablesGlobales;
import Entidades.Usuario;
import javax.swing.JOptionPane;

public class UsuarioControl {

    private final UsuarioDAO DATOS;

    public UsuarioControl() {
        this.DATOS = new UsuarioDAO();
    }

    public String LoginControl(String usuario, String clave) {
        String resp;
        Usuario usu = this.DATOS.login(usuario, clave);
        if (usu != null) {
            resp = "Ok";
            VariablesGlobales.nombre = usu.getNombre();
            VariablesGlobales.apellidos = usu.getApellido();
            VariablesGlobales.usuario = usu.getUsuario();
        } else {
            resp = "Error";
            JOptionPane.showConfirmDialog(null, "error");
        }
        return resp;
    }

    public String UpdateClientControl(String user, String clave, String codigoverificacion) {
        if (DATOS.ChangePassoword(user, clave, codigoverificacion)) {
            return "Ok";
        } else {
            return "Error en la actualización.";
        }
    }
}
