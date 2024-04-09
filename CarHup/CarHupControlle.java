
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
<<<<<<< HEAD
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

=======
        ventana.getBuscador().removeAll();
    } 
}

    

public void botonesInternos(){ 
    ventana.getFinalizarButton().addActionListener(e -> addUsuarioC());
    ventana.getIniciarSesionButton().addActionListener(e -> ventana.iniciarSesion());
    ventana.getCrearCuentaButton().addActionListener(e -> ventana.crearCuenta());
    ventana.getCrearButton().addActionListener(e -> addUsuario());
    ventana.getIniciarSesionButton().addActionListener(e -> iniciarSesion());
    ventana.getMiInformacionButton().addActionListener(e -> ventana.miInformacion());
    ventana.getModoOscuroButton().addActionListener(e -> ventana.modoOscuro());
    ventana.getCrearCtaConductor().addActionListener(e -> ventana.crearCuentaConductor());
    ventana.getResert().addActionListener(e -> ventana.sugerencias(addU));
    ventana.getCuentaButton().addActionListener(e -> abrirNuevaInterfaz());
    ventana.getBuscarCButton().addActionListener(e -> ventana.buscar(ventana.getBuscarField().getText(), addU));
    ventana.getInicioButton().addActionListener(this);
    ventana.getLoginButton().addActionListener(this);
    ventana.getConfiguracionButton().addActionListener(this);
    ventana.getBuscarButton().addActionListener(this);

   
}

    
    
    
    public void iniciarSesion(){
    }

    public void mostrarBuscadorDialog() {
       
        ventana.getBuscador().setOpaque(false);
        ventana.getBuscador().setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));

        ventana.getBuscarField().setText("Digite el Nombre");
        ventana.getBuscarField().setPreferredSize(new Dimension(200, 25));
        ventana.getBuscarCButton().setPreferredSize(new Dimension(100, 25));
        ventana.getBuscarCButton().setContentAreaFilled(false);

        ventana.getBuscador().add(ventana.getBuscarField());
        ventana.getBuscador().add(ventana.getBuscarCButton());
        ventana.getNorte().add(ventana.getBuscador());
        ventana.getNorte().revalidate();
        ventana.getNorte().repaint();
    }
>>>>>>> f7165f16c46300cbba38bde4041a97d12c7dbe04
}
