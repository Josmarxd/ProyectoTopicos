import java.awt.*;
import java.awt.event.*;
public class CarHupControlle implements ActionListener {
    CarHup ventana;
    ConfiguracionModel add;
    ConfiguracionModel addU;
   
    
    public CarHupControlle(){
      ventana = new CarHup("CARHUP");
      add = new ConfiguracionModel();
      addU = new ConfiguracionModel();
      botonesInternos();

    }

    public void addUsuario(){
      Usuario usuario = new Usuario();
      usuario.setNombre(ventana.getCampoUsuario().getText());
      usuario.setCorreo(ventana.getCampoCorreo().getText());
      usuario.setFechaNacimiento(ventana.getCampoFechaNacimiento().getText());
      usuario.setSexo(ventana.getSexoSeleccionado());      
      add.agregarUsuario(usuario);
    }  

    public void addUsuario2(Usuario usuario){
        usuario.setNombre(ventana.getCampoUsuario().getText());
        usuario.setCorreo(ventana.getCampoCorreo().getText());
        usuario.setFechaNacimiento(ventana.getCampoFechaNacimiento().getText());
        usuario.setSexo(ventana.getSexoSeleccionado());
    }

    public void addUsuarioC(){
        Usuario usuario = new Usuario();
        usuario.setEsConductor(true);
        addUsuario2(usuario);
        usuario.setEsConductor(true);
        ventana.getNombreLabel().setText(usuario.getNombre());
        usuario.setEstado(ventana.getCampoEstado().getText());
        usuario.setEsConductor(true);
        usuario.setNumeroDeTelefono(ventana.getCampoTelefono().getText());
        usuario.setMunicipio(ventana.getCampoMunicipio().getText());
        usuario.setLocalidad(ventana.getCampoLocalidad().getText());
        ventana.getNumeroDeTelefonoLabel().setText(usuario.getNumeroDeTelefono());
        addU.agregarUsuario(usuario);
    }


    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == ventana.getInicioButton()){
        ventana.inicio();
        ventana.getBuscador().removeAll();
    } else if (e.getSource() == ventana.getLoginButton()){
        ventana.login();
        ventana.getBuscador().removeAll();
    } else if (e.getSource() == ventana.getBuscarButton()){
        mostrarBuscadorDialog();
    } else if (e.getSource() == ventana.getConfiguracionButton()){
        ventana.configuracion();
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
}
