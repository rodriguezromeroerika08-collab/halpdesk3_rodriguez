
package controlador;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import modelo.UsuarioDao;

/**
 * Controlador para el CRUD de la tabla usuario.
 * No depende de nombres especificos de componentes de InterfazPrincipal:
 * cada metodo recibe los datos que necesita como parametro, para que puedas
 * llamarlo desde el evento (actionPerformed) del boton que corresponda,
 * usando los jTextField / jTable que ya tengas creados en tu formulario.
 */
public class UsuarioController {

    private UsuarioDao usuarioDao = new UsuarioDao();

    // ================== REGISTRAR (Video 37) ==================
    public boolean registrarUsuario(String nombre, String apellido, String correo,
            String telefono, String usuario, String contrasena, String estado) {

        Usuario u = new Usuario(nombre, apellido, correo, telefono, usuario, contrasena, estado);
        return usuarioDao.registrar(u);
    }

    // ================== LISTAR (Video 38) ==================
    // Ejemplo de uso: usuarioController.listarUsuarios(TableUsuario);
    public void listarUsuarios(JTable tabla) {
        DefaultTableModel modelo = usuarioDao.listar();
        tabla.setModel(modelo);
    }

    // ================== BUSCAR (Video 38) ==================
    // Ejemplo de uso: usuarioController.buscarUsuarios(txtBuscar.getText(), TableUsuario);
    public void buscarUsuarios(String texto, JTable tabla) {
        DefaultTableModel modelo = usuarioDao.buscar(texto);
        tabla.setModel(modelo);
    }

    // ================== MODIFICAR (Video 39) ==================
    public boolean modificarUsuario(int id, String nombre, String apellido, String correo,
            String telefono, String usuario, String contrasena, String estado) {

        Usuario u = new Usuario(id, nombre, apellido, correo, telefono, usuario, contrasena, estado);
        return usuarioDao.modificar(u);
    }

    // ================== ELIMINAR (Video 40) ==================
    public boolean eliminarUsuario(int id) {
        return usuarioDao.eliminar(id);
    }

    // ================== CANCELAR (Video 40) ==================
    // Limpia cualquier grupo de jTextField que le pases, por ejemplo:
    // usuarioController.cancelar(txtNombre, txtApellido, txtCorreo, txtTelefono, txtUsuario, txtContrasena);
    public void cancelar(JTextField... campos) {
        for (JTextField campo : campos) {
            campo.setText("");
        }
    }

    // Utilidad para cargar una fila seleccionada de la tabla hacia un objeto Usuario,
    // util antes de llamar a modificarUsuario() o para precargar el formulario.
    public Usuario obtenerUsuarioDeFila(JTable tabla, int fila) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int id = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
        String nombre = modelo.getValueAt(fila, 1).toString();
        String apellido = modelo.getValueAt(fila, 2).toString();
        String correo = modelo.getValueAt(fila, 3).toString();
        String telefono = modelo.getValueAt(fila, 4).toString();
        String usuario = modelo.getValueAt(fila, 5).toString();
        String estado = modelo.getValueAt(fila, 6).toString();
        return new Usuario(id, nombre, apellido, correo, telefono, usuario, "", estado);
    }
}
