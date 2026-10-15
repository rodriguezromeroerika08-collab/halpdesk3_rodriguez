package main;

import vista.InterfazPrincipal; // Importamos la ventana rosa

public class main {
    public static void main(String[] args) {
        // En lugar de abrir el login, abrimos directo tu interfaz principal
        InterfazPrincipal interfaz = new InterfazPrincipal();
        interfaz.setVisible(true);
    }
}
