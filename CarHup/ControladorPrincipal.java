import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal implements ActionListener{
    CaInCuenta cuenta;
    Usuario usuario;
    ConfiguracionModel addU;
    public ControladorPrincipal(ConfiguracionModel addU){
        this.addU = addU;
        cuenta = new CaInCuenta();
        botones();
    }


    public void addUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre(cuenta.getCampoUsuario().getText());
        usuario.setCorreo(cuenta.getCampoCorreo().getText());
        usuario.setFechaNacimiento(cuenta.getCampoFechaNacimiento().getText());
        usuario.setSexo(cuenta.getSexoSeleccionado()); 
        usuario.setEstado(cuenta.getCampoEstado().getText());
        usuario.setEsConductor(false);
        usuario.setTieneCuenta(true);
        usuario.setNumeroDeTelefono(cuenta.getCampoTelefono().getText());
        usuario.setMunicipio(cuenta.getCampoMunicipio().getText());
        usuario.setLocalidad(cuenta.getCampoLocalidad().getText());
        char[] passwordChars = cuenta.getCampoContrasena().getPassword();
        String passaword = new String(passwordChars);
        usuario.setPassaword(passaword);
        addU.agregarUsuario(usuario);
        cuenta.login();
      }  
  
      public void addUsuarioC(){
        Usuario usuario = new Usuario();
        usuario.setNombre(cuenta.getCampoUsuario().getText());
        usuario.setCorreo(cuenta.getCampoCorreo().getText());
        usuario.setFechaNacimiento(cuenta.getCampoFechaNacimiento().getText());
        usuario.setSexo(cuenta.getSexoSeleccionado()); 
        usuario.setEstado(cuenta.getCampoEstado().getText());
        usuario.setEsConductor(true);
        usuario.setTieneCuenta(true);
        usuario.setNumeroDeTelefono(cuenta.getCampoTelefono().getText());
        usuario.setMunicipio(cuenta.getCampoMunicipio().getText());
        usuario.setLocalidad(cuenta.getCampoLocalidad().getText());
        char[] passwordChars = cuenta.getCampoContrasena().getPassword();
        String passaword = new String(passwordChars);
        usuario.setPassaword(passaword);
        addU.agregarUsuario(usuario);
        cuenta.login();
      }

    public void botones(){
        cuenta.getIniciarSesionButton().addActionListener(this);
        cuenta.getCrearCuentaButton().addActionListener(this);
        cuenta.getFinalizarButton().addActionListener(this);
        cuenta.getCrearCtaConductor().addActionListener(this);
        cuenta.getAtras().addActionListener(this);
        cuenta.getLuego().addActionListener(this);
        cuenta.getBotonIniciarSesion().addActionListener(this);
        cuenta.getIniciarSesionC().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == cuenta.getIniciarSesionButton()) cuenta.iniciarSesion();
       else if(e.getSource() == cuenta.getCrearCuentaButton()) cuenta.crearCuenta();
       else if(e.getSource() == cuenta.getFinalizarButton()) addUsuario();
       else if(e.getSource()== cuenta.getCrearCtaConductor()) addUsuarioC();
       else if(e.getSource()== cuenta.getAtras()) cuenta.login();
       else if(e.getSource()== cuenta.getLuego()){
         cuenta.dispose();
         CarHupControlle c = new CarHupControlle(addU);
       }else if(e.getSource() == cuenta.getBotonIniciarSesion()){
        char[] passwordChars = cuenta.getCampoContrasena().getPassword();
        String passaword = new String(passwordChars);
        iniciarSesionU(cuenta.getCampoUsuario().getText(),passaword);
       }else if(e.getSource() == cuenta.getIniciarSesionC()){
        char[] passwordChars = cuenta.getCampoContrasena().getPassword();
        String passaword = new String(passwordChars);
        iniciarSesionC(cuenta.getCampoUsuario().getText(),passaword);
       }
    }

    public void iniciarSesionC(String nombreUsuario, String contraseña) {
        for (Usuario usuario : addU.getListaUsuarios()) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                if (usuario.getPassaword().equals(contraseña)) {
                    if (usuario.getTieneCuenta() && usuario.getEsConductor()) {
                        cuenta.dispose();
                        CarHupCControlle conductor = new CarHupCControlle(addU,nombreUsuario);
                    } else {
                        cuenta.getError().setText("La cuenta no es de un conductor");
                        return;
                    }
                } else {
                    cuenta.getError().setText("Contraseña invalida");
                    return;
                }
            }
        }
        
        cuenta.getError().setText("Usuario no encontrado");
    }
    
    public void iniciarSesionU(String nombreUsuario, String contraseña) {
        if (addU == null || addU.getListaUsuarios() == null) {
            return;
        }
    
        for (Usuario usuario : addU.getListaUsuarios()) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                if (usuario.getPassaword().equals(contraseña)) {
                    if (usuario.getTieneCuenta() && !usuario.getEsConductor()) {
                        cuenta.dispose();
                        CarHupUControlle usuariox = new CarHupUControlle(addU,nombreUsuario);
                    } else {
                        cuenta.getError().setText("La cuenta no es de un Usuario");
                        return;
                    }
                } else {
                    cuenta.getError().setText("Contraseña invalida");
                    return;
                }
            }
        }
        cuenta.getError().setText("Usuario no encontrado");
    }
}    