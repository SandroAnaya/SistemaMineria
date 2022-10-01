package Negocio;


import Datos.DashboardDAO;

public class DashboardControl {

    private final DashboardDAO DATOS;

    public DashboardControl() {
        this.DATOS = new DashboardDAO();
    }

    public int TotalDeClientes() {
        return this.DATOS.TotalDeClientes();
    }

    public int TotalDeUsuarios() {
        return this.DATOS.TotalDeUsuarios();
    }

    public int TotalDeServicios() {
        return this.DATOS.TotalDeServicios();
    }

    public int TotalDePedidos() {
        return this.DATOS.TotalDePedidos();
    }

}
