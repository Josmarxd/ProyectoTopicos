
import java.awt.event.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
public class CarHupUControlle implements ActionListener {
    CarHupU ventana;
    ConfiguracionModel addU;
    String nombrex; 
 
    
    public CarHupUControlle(ConfiguracionModel addU,String nombre){
        this.addU = addU;
        nombrex = nombre;
        ventana = new CarHupU("CARHUP");
        ventana.getNombreJLabel().setText("Hola "+nombre);
        botonesInternos();
    }

    public void botonesInternos(){ 
        ventana.getBuscarCButton().addActionListener(this); 
        ventana.getInicioButton().addActionListener(this);
        ventana.getLoginButton().addActionListener(this);
        ventana.getConfiguracionButton().addActionListener(this);
        ventana.getBuscarButton().addActionListener(this); 
        ventana.getAtras2().addActionListener(this);
        ventana.getResert().addActionListener(this);
        ventana.getReservar().addActionListener(this);
        ventana.getMisReservas().addActionListener(this);
        ventana.getBtnCancelar().addActionListener(e -> ventana.sugerencias(addU));
        ventana.getBtnReservar().addActionListener(e->reservarC());
        ventana.getBtnSalir().addActionListener(e->ventana.misReservaciones(null, addU, nombrex));
    }

    public void reservarC() {
        String reserva = ventana.ticketReserva();
        for (Usuario usuario : addU.getListaUsuarios()) {
            if (usuario.getNombre().equals(ventana.getNombreConductorReserva())) {
                usuario.agregarReserva(reserva);
                usuario.agregarUsuario(nombrex);                
            }else if (usuario.getNombre().equals(nombrex)) {
                usuario.agregarReserva(reserva);
            }
        }
        ventana.getVentana3().dispose();
        ventana.sugerencias(addU);
    }

    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == ventana.getInicioButton()){
        ventana.getNorte().removeAll();
        ventana.norte();
    } else if (e.getSource() == ventana.getLoginButton()){
          cerrarSesion();
    } else if (e.getSource() == ventana.getBuscarButton()){
        ventana.abrirTerceraVentana();
    } else if (e.getSource() == ventana.getConfiguracionButton()){
        ventana.configuracion();
    }else if(e.getSource()==ventana.getAtras2()){
            ventana.getVentana3().dispose();
    } else if(e.getSource() == ventana.getBuscarCButton()){
        ventana.buscar(ventana.getBuscarField().getText(), addU);
         ventana.getBuscarField().setText("");
    }else if (e.getSource() == ventana.getResert()) {
        ventana.sugerencias(addU);
    }else if(e.getSource() == ventana.getReservar()){
         ventana.reservar();
    }else if(e.getSource() == ventana.getMisReservas()){
        ventana.misReservaciones(null,addU,nombrex);
        ventana.abrirTerceraVentana();
    }
}

public void cerrarSesion(){
    // Crear el JOptionPane
    int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
    
    if (respuesta == JOptionPane.YES_OPTION) {
        ventana.dispose();
        ControladorPrincipal n = new ControladorPrincipal(addU);
    }
}



}
