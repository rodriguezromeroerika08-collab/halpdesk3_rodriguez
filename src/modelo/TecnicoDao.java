
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TecnicoDao {
    //Instanciar Conexion
    ConexionesMySQL cn = new ConexionesMySQL();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    // ================== REGISTRAR ==================
    public boolean registrar(Tecnico t) {
        boolean resultado = false;
        String sql = "INSERT INTO tecnico (nombre, apellido, ci, telefono, correo, especialidad, estado) VALUES (?,?,?,?,?,?,?)";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setString(1, t.getNombre());
            pst.setString(2, t.getApellido());
            pst.setString(3, t.getCi());
            pst.setString(4, t.getTelefono());
            pst.setString(5, t.getCorreo());
            pst.setString(6, t.getEspecialidad());
            pst.setString(7, t.getEstado());

            int filas = pst.executeUpdate();
            if (filas > 0) {
                resultado = true;
                JOptionPane.showMessageDialog(null, "Tecnico registrado correctamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el tecnico: " + e.getMessage());
        }
        return resultado;
    }

    // ================== LISTAR ==================
    public DefaultTableModel listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("CI");
        modelo.addColumn("Telefono");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Estado");
        modelo.addColumn("Correo");

        String sql = "SELECT id, nombre, apellido, ci, telefono, especialidad, estado, correo FROM tecnico";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            Object[] fila = new Object[8];
            while (rs.next()) {
                fila[0] = rs.getInt("id");
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getString("apellido");
                fila[3] = rs.getString("ci");
                fila[4] = rs.getString("telefono");
                fila[5] = rs.getString("especialidad");
                fila[6] = rs.getString("estado");
                fila[7] = rs.getString("correo");
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar los tecnicos: " + e.getMessage());
        }
        return modelo;
    }

    // ================== BUSCAR ==================
    public DefaultTableModel buscar(String texto) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("CI");
        modelo.addColumn("Telefono");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Estado");
        modelo.addColumn("Correo");

        String sql = "SELECT id, nombre, apellido, ci, telefono, especialidad, estado, correo FROM tecnico "
                + "WHERE nombre LIKE ? OR apellido LIKE ? OR ci LIKE ?";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + texto + "%");
            pst.setString(2, "%" + texto + "%");
            pst.setString(3, "%" + texto + "%");
            rs = pst.executeQuery();

            Object[] fila = new Object[8];
            while (rs.next()) {
                fila[0] = rs.getInt("id");
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getString("apellido");
                fila[3] = rs.getString("ci");
                fila[4] = rs.getString("telefono");
                fila[5] = rs.getString("especialidad");
                fila[6] = rs.getString("estado");
                fila[7] = rs.getString("correo");
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar tecnicos: " + e.getMessage());
        }
        return modelo;
    }

    // Trae un solo tecnico por su id (util para cargar el formulario antes de Modificar)
    public Tecnico buscarPorId(int id) {
        Tecnico t = null;
        String sql = "SELECT id, nombre, apellido, ci, telefono, especialidad, estado, correo FROM tecnico WHERE id=?";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                t = new Tecnico(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("ci"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        rs.getString("especialidad"),
                        rs.getString("estado")
                );
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el tecnico: " + e.getMessage());
        }
        return t;
    }

    // ================== MODIFICAR ==================
    public boolean modificar(Tecnico t) {
        boolean resultado = false;
        String sql = "UPDATE tecnico SET nombre=?, apellido=?, ci=?, telefono=?, correo=?, especialidad=?, estado=? WHERE id=?";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setString(1, t.getNombre());
            pst.setString(2, t.getApellido());
            pst.setString(3, t.getCi());
            pst.setString(4, t.getTelefono());
            pst.setString(5, t.getCorreo());
            pst.setString(6, t.getEspecialidad());
            pst.setString(7, t.getEstado());
            pst.setInt(8, t.getId());

            int filas = pst.executeUpdate();
            if (filas > 0) {
                resultado = true;
                JOptionPane.showMessageDialog(null, "Tecnico modificado correctamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el tecnico: " + e.getMessage());
        }
        return resultado;
    }

    // ================== ELIMINAR ==================
    public boolean eliminar(int id) {
        boolean resultado = false;
        String sql = "DELETE FROM tecnico WHERE id=?";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);

            int filas = pst.executeUpdate();
            if (filas > 0) {
                resultado = true;
                JOptionPane.showMessageDialog(null, "Tecnico eliminado correctamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el tecnico: " + e.getMessage());
        }
        return resultado;
    }
}
