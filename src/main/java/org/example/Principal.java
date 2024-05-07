package org.example;

public class Principal {
    public static void main(String[] args) {
        RolSistema admin = new RolSistema(1, "Administrador", "admin@dominio.com", "claveAdmin");
        RolSistema usuario = new RolSistema(2, "Usuario", "usuario@dominio.com", "claveUsuario");
        RolSistema invitado = new RolSistema(3, "Invitado", "invitado@dominio.com", "claveInvitado");
        RolSistema supervisor = new RolSistema(4, "Supervisor", "supervisor@dominio.com", "claveSupervisor");

        admin.imprimirRol();
        usuario.imprimirRol();
        invitado.imprimirRol();
        supervisor.imprimirRol();
    }
}
