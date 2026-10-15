
package controlador;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.InterfazPrincipal;

public class LoginController implements MouseListener{
    private InterfazPrincipal principal;
    public LoginController(InterfazPrincipal principal){
        this.principal = principal;
        
        this.principal.lblincidencias.addMouseListener(this);
        this.principal.lblUsuario.addMouseListener(this);
        this.principal.lblTecnicos.addMouseListener(this);
        this.principal.lblCategorias.addMouseListener(this);
        this.principal.lblEspecialidades.addMouseListener(this);
        this.principal.lblReportes.addMouseListener(this);
        this.principal.lblAsistente.addMouseListener(this);
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()== principal.lblincidencias){
           principal.panelincidencia.setBackground(new Color(0,153,153));           
        }
        else if(e.getSource()==principal.lblUsuario){
            principal.panelUsuarios.setBackground(new Color(0,153,153)); 
        }
        else if(e.getSource()==principal.lblTecnicos){
            principal.panelTecnicos.setBackground(new Color(0,153,153)); 
        }
        else if(e.getSource()==principal.lblCategorias){
            principal.panelCategorias.setBackground(new Color(0,153,153)); 
        }
        else if(e.getSource()==principal.lblEspecialidades){
            principal.panelEspecialidades.setBackground(new Color(0,153,153)); 
        }
        else if(e.getSource()==principal.lblReportes){
            principal.panelReportes.setBackground(new Color(0,153,153)); 
        }
        else if(e.getSource()==principal.lblAsistente){
            principal.panelAsistente.setBackground(new Color(0,153,153)); 
        }
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
    if(e.getSource()== principal.lblincidencias){
           principal.panelincidencia.setBackground(new Color(0,0,102));           
        }
        else if(e.getSource()==principal.lblUsuario){
            principal.panelUsuarios.setBackground(new Color(0,0,102)); 
        }
        else if(e.getSource()==principal.lblTecnicos){
            principal.panelTecnicos.setBackground(new Color(0,0,102)); 
        }
        else if(e.getSource()==principal.lblCategorias){
            principal.panelCategorias.setBackground(new Color(0,0,102)); 
        }
        else if(e.getSource()==principal.lblEspecialidades){
            principal.panelEspecialidades.setBackground(new Color(0,0,102)); 
        }
        else if(e.getSource()==principal.lblReportes){
            principal.panelReportes.setBackground(new Color(0,0,102)); 
        }
        else if(e.getSource()==principal.lblAsistente){
            principal.panelAsistente.setBackground(new Color(0,0,102)); 
        }
        
        
    }
    
}
