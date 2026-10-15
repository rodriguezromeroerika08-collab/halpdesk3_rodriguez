package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReporteDao {
    
    private final ConexionesMySQL conexion = new ConexionesMySQL();
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    /**
     * 1. Métodos para Reporte General Filtrado
     * CORREGIDO: Lógica robusta para anular filtros cuando se selecciona "Todos" o "Todas"
     */
    public List<String[]> obtenerIncidenciasFiltradas(String estado, String categoria) {
        List<String[]> lista = new ArrayList<>();
        String sql = "SELECT i.ticket, i.fecha, i.hora, i.titulo, i.prioridad, "
                   + "u.nombres AS usuario, t.nombres AS tecnico, c.nombre AS categoria, i.estado "
                   + "FROM incidencia i "
                   + "INNER JOIN usuario u ON i.usuario_id = u.id_usuario "
                   + "INNER JOIN tecnico t ON i.tecnico_id = t.id_tecnico "
                   + "INNER JOIN categoria c ON i.categoria_id = c.id_categoria WHERE 1=1";
        
        // Si no es "Todos", se aplica el filtro de estado de manera limpia
        if (estado != null && !estado.trim().equalsIgnoreCase("Todos")) {
            sql += " AND i.estado = '" + estado.trim() + "'";
        }
        
        // Si no es "Todas" ni "Todos", se aplica el filtro de categoría de manera limpia
        if (categoria != null && !categoria.trim().equalsIgnoreCase("Todas") && !categoria.trim().equalsIgnoreCase("Todos")) {
            sql += " AND c.nombre = '" + categoria.trim() + "'";
        }

        try {
            con = conexion.getConexion(); 
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String[] fila = new String[9];
                fila[0] = rs.getString("ticket"); 
                fila[1] = rs.getString("fecha");
                fila[2] = rs.getString("hora");
                fila[3] = rs.getString("titulo");
                fila[4] = rs.getString("prioridad");
                fila[5] = rs.getString("usuario");
                fila[6] = rs.getString("tecnico");
                fila[7] = rs.getString("categoria");
                fila[8] = rs.getString("estado");
                lista.add(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error en obtenerIncidenciasFiltradas: " + e.toString());
        } finally {
            limpiarRecursos();
        }
        return lista;
    }

    /**
     * 2. Métodos para Reporte Estadístico por Técnico
     * CORREGIDO: Ajustado el INNER JOIN con 'tecnico_id'
     */
    public List<String[]> obtenerIncidenciasPorTecnico() {
        List<String[]> lista = new ArrayList<>();
        String sql = "SELECT t.nombres AS tecnico, COUNT(i.id_incidencia) AS total "
                   + "FROM incidencia i "
                   + "INNER JOIN tecnico t ON i.tecnico_id = t.id_tecnico "
                   + "GROUP BY t.nombres ORDER BY total DESC";
        try {
            con = conexion.getConexion(); 
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String[] fila = new String[2];
                fila[0] = rs.getString("tecnico");
                fila[1] = rs.getString("total");
                lista.add(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error en obtenerIncidenciasPorTecnico: " + e.toString());
        } finally {
            limpiarRecursos();
        }
        return lista;
    }

    /**
     * 3. Métodos para Reporte Estadístico por Categoría
     * CORREGIDO: Ajustado el INNER JOIN con 'categoria_id'
     */
    public List<String[]> obtenerIncidenciasPorCategoria() {
        List<String[]> lista = new ArrayList<>();
        String sql = "SELECT c.nombre AS categoria, COUNT(i.id_incidencia) AS total "
                   + "FROM incidencia i "
                   + "INNER JOIN categoria c ON i.categoria_id = c.id_categoria "
                   + "GROUP BY c.nombre ORDER BY total DESC";
        try {
            con = conexion.getConexion(); 
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String[] fila = new String[2];
                fila[0] = rs.getString("categoria");
                fila[1] = rs.getString("total");
                lista.add(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error en obtenerIncidenciasPorCategoria: " + e.toString());
        } finally {
            limpiarRecursos();
        }
        return lista;
    }

    private void limpiarRecursos() {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.out.println("Error cerrando conexiones: " + e.getMessage());
        }
    }
}
