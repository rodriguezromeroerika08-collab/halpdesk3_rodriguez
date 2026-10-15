
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioDao {
    //Instanciar Conexion
    ConexionesMySQL cn = new ConexionesMySQL();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    // ================== REGISTRAR (Video 37) ==================
    public boolean registrar(Usuario u) {
        boolean resultado = false;
        String sql = "INSERT INTO usuario (nombre, apellido, correo, telefono, usuario, contrasena, estado) VALUES (?,?,?,?,?,?,?)";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setString(1, u.getNombre());
            pst.setString(2, u.getApellido());
            pst.setString(3, u.getCorreo());
            pst.setString(4, u.getTelefono());
            pst.setString(5, u.getUsuario());
            pst.setString(6, u.getContrasena());
            pst.setString(7, u.getEstado());

            int filas = pst.executeUpdate();
            if (filas > 0) {
                resultado = true;
                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el usuario: " + e.getMessage());
        }
        return resultado;
    }

    // ================== LISTAR (Video 38) ==================
    public DefaultTableModel listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Usuario");
        modelo.addColumn("Estado");

        String sql = "SELECT id, nombre, apellido, correo, telefono, usuario, estado FROM usuario";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            Object[] fila = new Object[7];
            while (rs.next()) {
                fila[0] = rs.getInt("id");
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getString("apellido");
                fila[3] = rs.getString("correo");
                fila[4] = rs.getString("telefono");
                fila[5] = rs.getString("usuario");
                fila[6] = rs.getString("estado");
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar los usuarios: " + e.getMessage());
        }
        return modelo;
    }

    // ================== BUSCAR (Video 38) ==================
    public DefaultTableModel buscar(String texto) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Usuario");
        modelo.addColumn("Estado");

        String sql = "SELECT id, nombre, apellido, correo, telefono, usuario, estado FROM usuario "
                + "WHERE nombre LIKE ? OR apellido LIKE ? OR usuario LIKE ?";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + texto + "%");
            pst.setString(2, "%" + texto + "%");
            pst.setString(3, "%" + texto + "%");
            rs = pst.executeQuery();

            Object[] fila = new Object[7];
            while (rs.next()) {
                fila[0] = rs.getInt("id");
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getString("apellido");
                fila[3] = rs.getString("correo");
                fila[4] = rs.getString("telefono");
                fila[5] = rs.getString("usuario");
                fila[6] = rs.getString("estado");
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar usuarios: " + e.getMessage());
        }
        return modelo;
    }

    // Variante que regresa una lista de objetos Usuario (util si no se usa JTable)
    public List<Usuario> buscarLista(String texto) {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT id, nombre, apellido, correo, telefono, usuario, contrasena, estado FROM usuario "
                + "WHERE nombre LIKE ? OR apellido LIKE ? OR usuario LIKE ?";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + texto + "%");
            pst.setString(2, "%" + texto + "%");
            pst.setString(3, "%" + texto + "%");
            rs = pst.executeQuery();

            while (rs.next()) {
                Usuario u = new Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("correo"),
                        rs.getString("telefono"),
                        rs.getString("usuario"),
                        rs.getString("contrasena"),
                        rs.getString("estado")
                );
                lista.add(u);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar usuarios: " + e.getMessage());
        }
        return lista;
    }

    // ================== MODIFICAR (Video 39) ==================
    public boolean modificar(Usuario u) {
        boolean resultado = false;
        String sql = "UPDATE usuario SET nombre=?, apellido=?, correo=?, telefono=?, usuario=?, contrasena=?, estado=? WHERE id=?";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setString(1, u.getNombre());
            pst.setString(2, u.getApellido());
            pst.setString(3, u.getCorreo());
            pst.setString(4, u.getTelefono());
            pst.setString(5, u.getUsuario());
            pst.setString(6, u.getContrasena());
            pst.setString(7, u.getEstado());
            pst.setInt(8, u.getId());

            int filas = pst.executeUpdate();
            if (filas > 0) {
                resultado = true;
                JOptionPane.showMessageDialog(null, "Usuario modificado correctamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el usuario: " + e.getMessage());
        }
        return resultado;
    }

    // ================== ELIMINAR (Video 40) ==================
    public boolean eliminar(int id) {
        boolean resultado = false;
        String sql = "DELETE FROM usuario WHERE id=?";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);

            int filas = pst.executeUpdate();
            if (filas > 0) {
                resultado = true;
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario: " + e.getMessage());
        }
        return resultado;
    }
}
