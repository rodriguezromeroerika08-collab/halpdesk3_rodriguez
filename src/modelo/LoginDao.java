package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDao {
    ConexionesMySQL cn = new ConexionesMySQL();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Verifica usuario y contrasena contra la tabla "usuario".
     * Retorna el objeto Login (sin contrasena) si las credenciales son
     * correctas y el usuario esta Activo; retorna null si no.
     */
    public Login autenticar(String usuario, String contrasena) {
        Login login = null;
        String sql = "SELECT id, nombre, apellido, usuario, estado FROM usuario WHERE usuario=? AND contrasena=?";
        try {
            conn = cn.getConexion();
            pst = conn.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, contrasena);
            rs = pst.executeQuery();

            if (rs.next()) {
                String estado = rs.getString("estado");
                if (estado != null && estado.equalsIgnoreCase("Activo")) {
                    login = new Login(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getString("usuario"),
                            estado
                    );
                } else {
                    JOptionPane.showMessageDialog(null, "Este usuario esta inactivo. Contacta al administrador.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contrasena incorrectos.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al validar el usuario: " + e.getMessage());
        }
        return login;
    }
}
