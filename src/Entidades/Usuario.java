

package Entidades;

public class Usuario {
    
    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String celular;
    private String usuario;
    private String clave;
    private String codigoverificacion;
    private int rol; 

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String dni, String direccion, String celular, String usuario, String clave, String codigoverificacion, int rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.celular = celular;
        this.usuario = usuario;
        this.clave = clave;
        this.codigoverificacion = codigoverificacion;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCodigoverificacion() {
        return codigoverificacion;
    }

    public void setCodigoverificacion(String codigoverificacion) {
        this.codigoverificacion = codigoverificacion;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
  

    
    
}
