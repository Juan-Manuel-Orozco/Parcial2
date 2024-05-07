package org.example;

public class RolSistema {
    private int id;
    private String nombreRol;
    private String email;
    private String clave;

    public RolSistema(int id, String nombreRol, String email, String clave) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.email = email;
        this.clave = clave;
    }
    public static void imprimirRol(Rol rol) {
        System.out.println("El rol actual es: " + rol);
    }
    public void realizarTarea() {
        System.out.println("Realizando tarea para el rol: " + nombreRol);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    public void imprimirRol() {
        System.out.println("ID: " + id);
        System.out.println("Nombre del Rol: " + nombreRol);
        System.out.println("Email: " + email);
        System.out.println("Clave: " + clave);
    }
}
