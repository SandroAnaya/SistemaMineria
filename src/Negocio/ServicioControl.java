package Negocio;


import Datos.ServicioDAO;

import Entidades.Servicio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ServicioControl {

    private final ServicioDAO DATOS;
    private Servicio obj;
    private DefaultTableModel modeloTabla;
    public int registrosMostrados;

    public ServicioControl() {
        this.DATOS = new ServicioDAO();
        this.obj = new Servicio();
    }

    public DefaultTableModel listarServicios(String texto) {
        List<Servicio> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        String[] titulos = {"Id", "Nombre", "Caracteristicas"};
        //JOptionPane.showConfirmDialog(null, "Tamaño de la lista : "+lista.size());
        this.modeloTabla = new DefaultTableModel(null, titulos);
        String[] registro = new String[7];
        this.registrosMostrados = 0;
        for (Servicio item : lista) {
            registro[0] = Integer.toString(item.getIdServicio());
            registro[1] = item.getNombre();
            registro[2] = item.getCaracteristicas();

            this.modeloTabla.addRow(registro);
            this.registrosMostrados = this.registrosMostrados + 1;
        }
        return this.modeloTabla;
    }

    public String InsertarServicioControl(String nombre, String Caracteristicas) {

        obj.setNombre(nombre);
        obj.setCaracteristicas(Caracteristicas);
        if (DATOS.insertar(obj)) {
            return "OK";
        } else {
            return "Error en el registro.";
        }
    }

    public String ActualizarServicioControl(int id, String nombre, String Caracteristicas) {

        obj.setIdServicio(id);
        obj.setNombre(nombre);
        obj.setCaracteristicas(Caracteristicas);

        if (DATOS.actualizar(obj)) {
            return "OK";
        } else {
            return "Error en la actualización.";
        }
    }

    public String AnularServicio(int id) {

        if (this.DATOS.anular(id)) {
            return "OK";
        } else {
            return "Error en la Eliminación.";
        }
    }

}
