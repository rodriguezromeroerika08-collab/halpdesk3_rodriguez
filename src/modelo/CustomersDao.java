
package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomersDao {
    //Instanciar Conexion
    ConexionesMySQL cn=new ConexionesMySQL();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    // ================== REGISTRAR (Video 37) ==================
    public boolean registrar(Customers c) {
        boolean resultado = false;
        String sql = "INSERT INTO customers (full_name, addresss, telephone, email, create_at, update_at) VALUES (?,?,?,?,?,?)";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setString(1, c.getFull_name());
            pst.setString(2, c.getAddresss());
            pst.setString(3, c.getTelephone());
            pst.setString(4, c.getEmail());
            pst.setString(5, c.getCreate());
            pst.setString(6, c.getUpdate());

            int filas = pst.executeUpdate();
            if (filas > 0) {
                resultado = true;
                JOptionPane.showMessageDialog(null, "Cliente registrado correctamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el cliente: " + e.getMessage());
        }
        return resultado;
    }

    // ================== LISTAR (Video 38) ==================
    public DefaultTableModel listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre completo");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");

        String sql = "SELECT id, full_name, addresss, telephone, email FROM customers";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            Object[] fila = new Object[5];
            while (rs.next()) {
                fila[0] = rs.getInt("id");
                fila[1] = rs.getString("full_name");
                fila[2] = rs.getString("addresss");
                fila[3] = rs.getString("telephone");
                fila[4] = rs.getString("email");
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar los clientes: " + e.getMessage());
        }
        return modelo;
    }

    // ================== BUSCAR (Video 38) ==================
    public DefaultTableModel buscar(String texto) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre completo");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");

        String sql = "SELECT id, full_name, addresss, telephone, email FROM customers "
                + "WHERE full_name LIKE ? OR email LIKE ? OR telephone LIKE ?";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + texto + "%");
            pst.setString(2, "%" + texto + "%");
            pst.setString(3, "%" + texto + "%");
            rs = pst.executeQuery();

            Object[] fila = new Object[5];
            while (rs.next()) {
                fila[0] = rs.getInt("id");
                fila[1] = rs.getString("full_name");
                fila[2] = rs.getString("addresss");
                fila[3] = rs.getString("telephone");
                fila[4] = rs.getString("email");
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar clientes: " + e.getMessage());
        }
        return modelo;
    }

    // ================== MODIFICAR (Video 39) ==================
    public boolean modificar(Customers c) {
        boolean resultado = false;
        String sql = "UPDATE customers SET full_name=?, addresss=?, telephone=?, email=?, update_at=? WHERE id=?";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setString(1, c.getFull_name());
            pst.setString(2, c.getAddresss());
            pst.setString(3, c.getTelephone());
            pst.setString(4, c.getEmail());
            pst.setString(5, c.getUpdate());
            pst.setInt(6, c.getId());

            int filas = pst.executeUpdate();
            if (filas > 0) {
                resultado = true;
                JOptionPane.showMessageDialog(null, "Cliente modificado correctamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el cliente: " + e.getMessage());
        }
        return resultado;
    }

    // ================== ELIMINAR (Video 40) ==================
    public boolean eliminar(int id) {
        boolean resultado = false;
        String sql = "DELETE FROM customers WHERE id=?";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);

            int filas = pst.executeUpdate();
            if (filas > 0) {
                resultado = true;
                JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: " + e.getMessage());
        }
        return resultado;
    }
}
