
package controlador;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Tecnico;
import modelo.TecnicoDao;

public class TecnicoController {

    private TecnicoDao tecnicoDao = new TecnicoDao();

    // ================== REGISTRAR ==================
    public boolean registrarTecnico(String nombre, String apellido, String ci, String telefono,
            String correo, String especialidad, String estado) {

        if (nombre.isEmpty() || apellido.isEmpty() || ci.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nombre, Apellido y CI son obligatorios.");
            return false;
        }
        Tecnico t = new Tecnico(nombre, apellido, ci, telefono, correo, especialidad, estado);
        return tecnicoDao.registrar(t);
    }

    // ================== LISTAR ==================
    public void listarTecnicos(JTable tabla) {
        DefaultTableModel modelo = tecnicoDao.listar();
        tabla.setModel(modelo);
    }

    // ================== BUSCAR ==================
    public void buscarTecnicos(String texto, JTable tabla) {
        DefaultTableModel modelo = tecnicoDao.buscar(texto);
        tabla.setModel(modelo);
    }

    // ================== MODIFICAR ==================
    public boolean modificarTecnico(int id, String nombre, String apellido, String ci, String telefono,
            String correo, String especialidad, String estado) {

        if (id <= 0) {
            JOptionPane.showMessageDialog(null, "Selecciona un tecnico de la tabla (o escribe su Id) antes de modificar.");
            return false;
        }
        Tecnico t = new Tecnico(id, nombre, apellido, ci, telefono, correo, especialidad, estado);
        return tecnicoDao.modificar(t);
    }

    // ================== ELIMINAR ==================
    public boolean eliminarTecnico(int id) {
        if (id <= 0) {
            JOptionPane.showMessageDialog(null, "Selecciona un tecnico de la tabla (o escribe su Id) antes de eliminar.");
            return false;
        }
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar este tecnico?",
                "Confirmar eliminacion", JOptionPane.YES_NO_OPTION);
        if (confirmar != JOptionPane.YES_OPTION) {
            return false;
        }
        return tecnicoDao.eliminar(id);
    }

    // Carga los datos de un tecnico (por Id) hacia los campos del formulario, para poder Modificarlo
    public void cargarTecnicoEnFormulario(int id, JTextField txtNombre, JTextField txtApellido, JTextField txtCi,
            JTextField txtTelefono, JTextField txtCorreo, javax.swing.JComboBox<String> comboEspecialidad,
            javax.swing.JComboBox<String> comboEstado, JTextField txtId) {

        Tecnico t = tecnicoDao.buscarPorId(id);
        if (t == null) {
            JOptionPane.showMessageDialog(null, "No se encontro un tecnico con ese Id.");
            return;
        }
        txtId.setText(String.valueOf(t.getId()));
        txtNombre.setText(t.getNombre());
        txtApellido.setText(t.getApellido());
        txtCi.setText(t.getCi());
        txtTelefono.setText(t.getTelefono());
        txtCorreo.setText(t.getCorreo());
        comboEspecialidad.setSelectedItem(t.getEspecialidad());
        comboEstado.setSelectedItem(t.getEstado());
    }

    // ================== CANCELAR / LIMPIAR ==================
    public void cancelar(JTextField... campos) {
        for (JTextField campo : campos) {
            campo.setText("");
        }
    }
}
