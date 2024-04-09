
import java.awt.event.*;
public class CarHupControlle implements ActionListener {
    CarHup ventana;
    ConfiguracionModel addU; 
    ControladorPrincipal irPrincipal;
 
    
    public CarHupControlle(ConfiguracionModel addU){
        this.addU = addU;
        ventana = new CarHup("CARHUP");
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
    }


    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == ventana.getInicioButton()){
        ventana.getNorte().removeAll();
        ventana.norte();
    } else if (e.getSource() == ventana.getLoginButton()){
           ventana.setVisible(false);
           ControladorPrincipal controladorPrincipal = new ControladorPrincipal(addU);
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
        ventana.setVisible(false);
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(addU);
    }else if(e.getSource() == ventana.getMisReservas()){
        ventana.setVisible(false);
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(addU);
    }
   }

}

