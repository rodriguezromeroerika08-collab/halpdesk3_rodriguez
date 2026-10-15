package modelo;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ReportePDF {

    // Fuentes para el estilo corporativo del documento
    private static final Font FUENTE_TITULO = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD, BaseColor.BLACK);
    private static final Font FUENTE_SUBTITULO = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.BLACK);
    private static final Font FUENTE_INFO = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);
    private static final Font FUENTE_CABECERA_TABLA = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLD, BaseColor.WHITE);
    private static final Font FUENTE_CELDA = new Font(Font.FontFamily.HELVETICA, 8, Font.NORMAL, BaseColor.BLACK);
    
    // Color azul marino del video institucional
    private static final BaseColor COLOR_AZUL_NAVY = new BaseColor(0, 32, 96);

    /**
     * 1. REPORTE GENERAL DE INCIDENCIAS (Formato Horizontal)
     * Encaja con la llamada: pdf.generarReporteGeneral(datos, estado, categoria);
     */
    public void generarReporteGeneral(List<String[]> datos, String estado, String categoria) {
        // Formato horizontal (rotate) para que entren holgadamente las 9 columnas
        Document documento = new Document(PageSize.A4.rotate(), 30, 30, 30, 30);
        try {
            String nombreArchivo = "Reporte_General_Incidencias_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            documento.open();

            // Encabezados
            Paragraph titulo = new Paragraph("SISTEMA HELPDESK\nREPORTE GENERAL DE INCIDENCIAS", FUENTE_TITULO);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);
            documento.add(Chunk.NEWLINE);

            // Filtros aplicados
            String fechaActual = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
            documento.add(new Paragraph("Fecha de generación: " + fechaActual, FUENTE_INFO));
            documento.add(new Paragraph("Filtros -> Estado: " + estado + " | Categoría: " + categoria, FUENTE_INFO));
            documento.add(Chunk.NEWLINE);

            // Estructura de la Tabla (9 columnas)
            PdfPTable tabla = new PdfPTable(9);
            tabla.setWidthPercentage(100);
            tabla.setWidths(new float[]{1.2f, 1.3f, 1.0f, 2.5f, 1.2f, 2.0f, 2.0f, 2.0f, 1.2f});

            String[] cabeceras = {"Ticket", "Fecha", "Hora", "Título", "Prioridad", "Usuario", "Técnico", "Categoría", "Estado"};
            for (String cabecera : cabeceras) {
                PdfPCell celda = new PdfPCell(new Paragraph(cabecera, FUENTE_CABECERA_TABLA));
                celda.setBackgroundColor(COLOR_AZUL_NAVY);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(5);
                tabla.addCell(celda);
            }

            // Carga de filas desde la BD
            for (String[] fila : datos) {
                for (String campo : fila) {
                    PdfPCell celda = new PdfPCell(new Paragraph(campo != null ? campo : "", FUENTE_CELDA));
                    celda.setPadding(4);
                    celda.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tabla.addCell(celda);
                }
            }

            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            
            Paragraph total = new Paragraph("Total de Incidencias Registradas: " + datos.size(), FUENTE_SUBTITULO);
            total.setAlignment(Element.ALIGN_RIGHT);
            documento.add(total);

            documento.close();
            
            // --- SISTEMA DE APERTURA FORZADA AUTOMÁTICA EN WINDOWS ---
            try {
                java.io.File archivo = new java.io.File(nombreArchivo);
                if (archivo.exists()) {
                    if (java.awt.Desktop.isDesktopSupported() && java.awt.Desktop.getDesktop().isSupported(java.awt.Desktop.Action.OPEN)) {
                        java.awt.Desktop.getDesktop().open(archivo);
                    } else {
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + archivo.getAbsolutePath());
                    }
                }
            } catch (Exception ex) {
                System.out.println("Aviso: No se pudo abrir la vista previa automática: " + ex.getMessage());
            }
            // --------------------------------------------------------

            System.out.println("PDF General generado correctamente.");
        } catch (Exception e) {
            System.out.println("Error en PDF General: " + e.getMessage());
        }
    }

    /**
     * 2. REPORTE ESTADÍSTICO AGRUPADO (Formato Vertical)
     * Encaja con la llamada: pdf.generarReporte(datos, "TITULO", "Columna1", prioridad);
     */
    public void generarReporte(List<String[]> datos, String tituloReporte, String nombreColumna, String prioridad) {
        Document documento = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            String nombreArchivo = "Reporte_" + nombreColumna + "_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            documento.open();

            // Título Dinámico
            Paragraph titulo = new Paragraph("SISTEMA HELPDESK\n" + tituloReporte.toUpperCase(), FUENTE_TITULO);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);
            documento.add(Chunk.NEWLINE);

            String fechaActual = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
            documento.add(new Paragraph("Fecha de generación: " + fechaActual, FUENTE_INFO));
            documento.add(new Paragraph("Prioridad analizada: " + prioridad, FUENTE_INFO));
            documento.add(Chunk.NEWLINE);

            // Tabla Estadística de 2 Columnas (Nombre del grupo y Cantidad de tickets)
            PdfPTable tabla = new PdfPTable(2);
            tabla.setWidthPercentage(80);
            tabla.setWidths(new float[]{3.0f, 1.5f});

            // Cabeceras dinámicas
            String[] cabeceras = {nombreColumna.toUpperCase(), "CANTIDAD DE INCIDENCIAS"};
            for (String cabecera : cabeceras) {
                PdfPCell celda = new PdfPCell(new Paragraph(cabecera, FUENTE_CABECERA_TABLA));
                celda.setBackgroundColor(COLOR_AZUL_NAVY);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(6);
                tabla.addCell(celda);
            }

            // Carga de filas agrupadas
            int granTotal = 0;
            for (String[] fila : datos) {
                if (fila.length >= 2) {
                    PdfPCell celdaNombre = new PdfPCell(new Paragraph(fila[0] != null ? fila[0] : "No asignado", FUENTE_INFO));
                    PdfPCell celdaTotal = new PdfPCell(new Paragraph(fila[1] != null ? fila[1] : "0", FUENTE_INFO));
                    
                    celdaNombre.setPadding(5);
                    celdaTotal.setPadding(5);
                    celdaTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
                    
                    tabla.addCell(celdaNombre);
                    tabla.addCell(celdaTotal);
                    
                    try {
                        granTotal += Integer.parseInt(fila[1]);
                    } catch (NumberFormatException e) {
                        // Resguardo en caso de nulos o textos
                    }
                }
            }

            documento.add(tabla);
            documento.add(Chunk.NEWLINE);

            Paragraph total = new Paragraph("Suma Total de Incidencias: " + granTotal, FUENTE_SUBTITULO);
            total.setAlignment(Element.ALIGN_RIGHT);
            documento.add(total);

            documento.close();
            
            // --- SISTEMA DE APERTURA FORZADA AUTOMÁTICA EN WINDOWS ---
            try {
                java.io.File archivo = new java.io.File(nombreArchivo);
                if (archivo.exists()) {
                    if (java.awt.Desktop.isDesktopSupported() && java.awt.Desktop.getDesktop().isSupported(java.awt.Desktop.Action.OPEN)) {
                        java.awt.Desktop.getDesktop().open(archivo);
                    } else {
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + archivo.getAbsolutePath());
                    }
                }
            } catch (Exception ex) {
                System.out.println("Aviso: No se pudo abrir la vista previa automática: " + ex.getMessage());
            }
            // --------------------------------------------------------

            System.out.println("PDF Estadístico generado correctamente.");
        } catch (Exception e) {
            System.out.println("Error en PDF Estadístico: " + e.getMessage());
        }
    }
}
