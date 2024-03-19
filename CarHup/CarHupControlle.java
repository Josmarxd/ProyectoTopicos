import java.awt.event.*;
import javax.swing.*;
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
        if (e.getSource() == ventana.getInicioButton())
            ventana.inicio();
        else if (e.getSource() == ventana.getLoginButton())
            ventana.login();
        else if (e.getSource() == ventana.getBuscarButton())
            mostrarBuscadorDialog();
        else if (e.getSource() == ventana.getConfiguracionButton())
            ventana.configuracion();
    }
    

    public void botonesInternos(){ 
        ventana.getFinalizarButton().addActionListener(e->addUsuarioC()); 
        ventana.getIniciarSesionButton().addActionListener(e -> ventana.iniciarSesion());
        ventana.getCrearCuentaButton().addActionListener(e->ventana.crearCuenta());
        ventana.getCrearButton().addActionListener(e-> addUsuario());
        ventana.getIniciarSesionButton().addActionListener(e->iniciarSesion());
        ventana.getMiInformacionButton().addActionListener(e->ventana.miInformacion());
        ventana.getModoOscuroButton().addActionListener(e->ventana.modoOscuro());
        ventana.getCrearCtaConductor().addActionListener(e->ventana.crearCuentaConductor());
        ventana.getResert().addActionListener(e-> ventana.sugerencias(addU));
        ventana.getInicioButton().addActionListener(this);
        ventana.getLoginButton().addActionListener(this);
        ventana.getConfiguracionButton().addActionListener(this);
        ventana.getBuscarButton().addActionListener(this);
    }
    
    
    public void iniciarSesion(){
    }

    public void mostrarBuscadorDialog() {
        ventana.getBuscarField().setText("Digite el Nombre");
        ventana.getBuscarField().setBounds(50, 150, 200, 30);
        ventana.getBuscarCButton().setBounds(260, 150, 100, 30);
        ventana.getResert().setBounds(860,150,80,30);
    
        ventana.getNorte().add(ventana.getBuscarField());
        ventana.getNorte().add(ventana.getBuscarCButton());
        ventana.getNorte().add(ventana.getResert());
    
        // Actualiza el panel norte
        ventana.getNorte().revalidate();
        ventana.getNorte().repaint();
    }
}

