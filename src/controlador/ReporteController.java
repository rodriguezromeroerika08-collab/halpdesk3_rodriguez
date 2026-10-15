package controlador;

import java.util.List;
import modelo.ReporteDao;
import modelo.ReportePDF;
import vista.InterfazPrincipal; 

public class ReporteController {
    private final ReporteDao dao;
    private final ReportePDF pdf;
    private final InterfazPrincipal vistaPrincipal; 

    public ReporteController(InterfazPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.dao = new ReporteDao();
        this.pdf = new ReportePDF();
    }

    public void ejecutarReporte(String estado, String categoria, String prioridad) {
        
        if (estado.equals("AGRUPADO_TECNICO")) {
            List<String[]> datos = dao.obtenerIncidenciasPorTecnico();
            pdf.generarReporte(datos, "REPORTE DE INCIDENCIAS POR TÉCNICO", "Técnico", prioridad);
            
        } else if (estado.equals("AGRUPADO_CATEGORIA")) {
            List<String[]> datos = dao.obtenerIncidenciasPorCategoria();
            pdf.generarReporte(datos, "REPORTE DE INCIDENCIAS POR CATEGORÍA", "Categoría", prioridad);
            
        } else {
            List<String[]> datos = dao.obtenerIncidenciasFiltradas(estado, categoria);
            pdf.generarReporteGeneral(datos, estado, categoria);
        }
    }
}
