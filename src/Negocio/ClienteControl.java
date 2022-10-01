package Negocio;

import Datos.ClienteDAO;
import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteControl {

    private final ClienteDAO DATOS;
    private Cliente obj;

    private DefaultTableModel modeloTabla;
    public int registrosMostrados;

    public ClienteControl() {
        this.DATOS = new ClienteDAO();
        this.obj = new Cliente();
    }

    public DefaultTableModel listar(String texto) {
        List<Cliente> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        String[] titulos = {"Id", "Nombres", "Apellidos", "Direccion", "RUC", "Celular"};
        this.modeloTabla = new DefaultTableModel(null, titulos);
        String[] registro = new String[6];

        this.registrosMostrados = 0;
        for (Cliente item : lista) {
            registro[0] = Integer.toString(item.getId());
            registro[1] = item.getNombres();
            registro[2] = item.getApellidos();
            registro[3] = item.getDni();
            registro[4] = item.getDireccion();
            registro[5] = item.getCelular();
            this.modeloTabla.addRow(registro);
            this.registrosMostrados = this.registrosMostrados + 1;
        }
        return this.modeloTabla;
    }

    public String insertarCliente(String Nombres, String Apellidos, String Direccion, String Dni, String Celular) {

        obj.setNombres(Nombres);
        obj.setApellidos(Apellidos);
        obj.setDireccion(Direccion);
        obj.setDni(Dni);
        obj.setCelular(Celular);
        if (DATOS.insertar(obj)) {
            return "OK";
        } else {
            return "Error en el registro.";
        }
    }

    public String actualizarCliente(int id, String Nombres, String Apellidos, String Direccion, String Dni, String Celular) {

        obj.setId(id);
        obj.setNombres(Nombres);
        obj.setApellidos(Apellidos);
        obj.setDireccion(Direccion);
        obj.setDni(Dni);
        obj.setCelular(Celular);
        if (DATOS.actualizar(obj)) {
            return "OK";
        } else {
            return "Error en la actualización.";
        }
    }

    public String AnularCliente(int id) {
        if (DATOS.anular(id)) {
            return "OK";
        } else {
            return "Error en la Eliminación.";
        }
    }

}
