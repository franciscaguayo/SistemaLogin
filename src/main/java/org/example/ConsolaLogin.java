package org.example;
import java.util.Scanner;

public class ConsolaLogin {
    Scanner scanner = new Scanner(System.in);
    DatosLogin datos = new DatosLogin();
    Login login = new Login();

    public void menu() {
        String opcion;
        do {
            mostrarOpciones();
            opcion = scanner.nextLine();
            ejecutarOpcion(opcion);
        } while (!opcion.equals("2"));
    }

    private void mostrarOpciones() {
        System.out.println("MENU");
        System.out.println("1. Iniciar sesion: ");
        System.out.println("2. Salir: ");
        System.out.println("Selecciona una opcion: ");
    }

    private void ejecutarOpcion(String opcion) {
        switch (opcion){
            case "1":
                manejarLogin();
                break;

            case "2":
                System.out.println("Saliendo del sistema");
                break;

            default:
                System.out.println("Opcion invalida, intente de nuevo");
        }
    }

    private void manejarLogin() {
        System.out.println("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.println("Contraseña: ");
        String clave = scanner.nextLine();

        boolean exito = login.autenticar(usuario, clave,datos);
        if (exito) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Credenciales incorrectas, intente de nuevo");
        }
    }
}
