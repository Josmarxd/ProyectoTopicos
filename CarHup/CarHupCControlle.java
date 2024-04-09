import java.awt.event.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class CarHupCControlle implements ActionListener {
    CarHupC ventana;
    ConfiguracionModel addU; 
    ControladorPrincipal irPrincipal;
    String nombrex;
 
    
    public CarHupCControlle(ConfiguracionModel addU, String nombre){
        ventana = new CarHupC("CARHUP");
        ventana.getNombreJLabel().setText(nombre);
        nombrex = nombre;
        this.addU = addU;
        botonesInternos();
    }

    public void botonesInternos(){  
        ventana.getInicioButton().addActionListener(this);
        ventana.getLoginButton().addActionListener(this);
        ventana.getConfiguracionButton().addActionListener(this);
        ventana.getAtras2().addActionListener(this);
        ventana.getMisReservas().addActionListener(this);
        ventana.getActualizar().addActionListener(e->ventana.misReservaciones(null, addU, nombrex));
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventana.getInicioButton()){
            ventana.getNorte().removeAll();
            ventana.norte();
        } else if (e.getSource() == ventana.getLoginButton()){
            cerrarSesion();
        } else if (e.getSource() == ventana.getConfiguracionButton()){
            ventana.configuracion();
        } else if(e.getSource() == ventana.getAtras2()){
            ventana.getVentana3().dispose();
        } else if(e.getSource() == ventana.getMisReservas()){
            ventana.abrirTerceraVentana();
            ventana.misReservaciones(null, addU,nombrex); // Pasar el nombre del usuario como nombre del conductor
        }
    }

    public void cerrarSesion(){
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) {
            ventana.dispose();
            ControladorPrincipal n = new ControladorPrincipal(addU);
        }
    }
}
