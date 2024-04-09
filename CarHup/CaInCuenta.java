import java.awt.*;
import javax.swing.*;

public class CaInCuenta extends JFrame{


    private ImageIcon logoVna;
    private JPanelImage panelImagenLogin;
    private JPanelImage panelCreate;
    private JPanelImage panellogin;
    private JLabel error;

    private BotonImagen iniciarSesionButton;
    private BotonImagen crearCuentaButton;

    private JTextField campoCorreo;
    private JTextField campoTelefono;
    private JTextField campoEstado;
    private JTextField campoLocalidad;
    private JTextField campoMunicipio;
    private JFormattedTextField campoFechaNacimiento;
    private JTextField campoUsuario;
    private JPasswordField campoContrasena;
    private BotonImagen botonIniciarSesion;
    private String sexoSeleccionado;
    private BotonImagen crearCtaConductor;
    private BotonImagen finalizarButton;
    private BotonImagen iniciarSesionC;
    private JButton luego;
    private BotonImagen atras;
    

    public CaInCuenta(){
       setSize(500,600);
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       init();
    }

    public void init(){
        panellogin = new JPanelImage("CarHup/Imagenes/LoginI.png");
        panelCreate = new JPanelImage("CarHup/Imagenes/FondoC.jpg");
       

        logoVna = new ImageIcon("CarHup/Imagenes/Loficial2.png");
        iniciarSesionC = new BotonImagen("CarHup/Imagenes/IniciarSesionC.png");
        panelImagenLogin = new JPanelImage("CarHup/Imagenes/FondoInit.jpg");
        iniciarSesionButton = new BotonImagen("CarHup/Imagenes/IniciarSesion.png");
        crearCuentaButton = new BotonImagen("CarHup/Imagenes/CrearCuenta.png");
        luego = new JButton("Despues");
        campoCorreo = new JTextField();
        campoTelefono = new JTextField();
        campoEstado = new JTextField();
        campoLocalidad = new JTextField();
        campoMunicipio = new JTextField();
        campoUsuario = new JTextField();
        campoContrasena = new JPasswordField();
        botonIniciarSesion = new BotonImagen("CarHup/Imagenes/IniciarSesion.png");
        sexoSeleccionado = new String();
        crearCtaConductor = new BotonImagen("CarHup/Imagenes/CrearCuentaC.png");
        campoFechaNacimiento = new JFormattedTextField(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT));
        finalizarButton = new BotonImagen("CarHup/Imagenes/CrearCuenta.png");
        atras = new BotonImagen("CarHup/Imagenes/Atras.png");
        error = new JLabel("");
        error.setForeground(Color.red);
        login();
    }

    public void login() {
        eliminarPanelAnterior(panelCreate);
        eliminarPanelAnterior(panellogin);
        setTitle("Iniciar sesión o Crear Cuenta");
        ImageIcon imagen = new ImageIcon("CarHup/Imagenes/Loficial.png");
        setIconImage(imagen.getImage());
    
        panelImagenLogin.removeAll();
        panelImagenLogin.setLayout(null);
    
        JLabel tituloBienvenido = new JLabel("Bienvenido de nuevo");
        tituloBienvenido.setFont(new Font("Times New Roman", Font.BOLD, 30));
        tituloBienvenido.setForeground(Color.WHITE);
        tituloBienvenido.setBounds(110, 20, 300, 50);
        panelImagenLogin.add(tituloBienvenido);
    
        ImageIcon logoScaled = new ImageIcon(logoVna.getImage().getScaledInstance(175, 175, Image.SCALE_SMOOTH)); // Redimensionamos la imagen
        JLabel loginImagen = new JLabel(logoScaled);
        loginImagen.setBounds(160, 65, 175, 175); 
        panelImagenLogin.add(loginImagen);
    
        JLabel tituloSeguro = new JLabel("<html><center>Un viaje mas seguro<br>con CarHup</center></html>");
        tituloSeguro.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tituloSeguro.setForeground(Color.WHITE);
        tituloSeguro.setBounds(165, 220, 200, 50); 
        panelImagenLogin.add(tituloSeguro);
    
        iniciarSesionButton.setBounds(150,240,190,120); 
        panelImagenLogin.add(iniciarSesionButton);
    
        crearCuentaButton.setBounds(150, 310,190,120);
        panelImagenLogin.add(crearCuentaButton);

        luego.setBounds(370,400,90,50);
        luego.setContentAreaFilled(false);
        luego.setBorderPainted(false);
        luego.setForeground(Color.WHITE);
        panelImagenLogin.add(luego);
 
        ImageIcon facebookI = new ImageIcon("CarHup/Imagenes/Facebook.png");
        ImageIcon logoScaledF = new ImageIcon(facebookI.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)); // Redimensionamos la imagen
        JLabel facebookT = new JLabel(logoScaledF);
        facebookT.setBounds(80, 500, 50, 50); 
        panelImagenLogin.add(facebookT);

        ImageIcon twiterI = new ImageIcon("CarHup/Imagenes/Twiter.png");
        ImageIcon logoScaledT = new ImageIcon(twiterI.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)); // Redimensionamos la imagen
        JLabel twiterT = new JLabel(logoScaledT);
        twiterT.setBounds(180, 500, 50, 50); 
        panelImagenLogin.add(twiterT);

        ImageIcon youtubeI = new ImageIcon("CarHup/Imagenes/Youtube.png");
        ImageIcon logoScaledY = new ImageIcon(youtubeI.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)); // Redimensionamos la imagen
        JLabel youtubeT = new JLabel(logoScaledY);
        youtubeT.setBounds(300, 500, 50, 50); 
        panelImagenLogin.add(youtubeT);

        getContentPane().add(panelImagenLogin);
        setSize(500, 630); 
        setLocationRelativeTo(null); 
        setResizable(false);
        setVisible(true);      
    
        revalidate();
        repaint();
    }
    

    public void iniciarSesion() {
        eliminarPanelAnterior(panelImagenLogin); 
        
     
        panellogin = new JPanelImage("CarHup/Imagenes/LoginI.png");
        panellogin.setLayout(null); 
        
        JLabel iniciarSesionLabel = new JLabel("<Html><center>!Hola<br>Inicia Sesion</center></Html>");
        iniciarSesionLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        iniciarSesionLabel.setForeground(Color.WHITE);
        iniciarSesionLabel.setBounds(30, 20, 200, 80); // Establece posición y tamaño
        panellogin.add(iniciarSesionLabel);
        
        JLabel etiquetaNombreUsuario = new JLabel("Nombre de Usuario:");
        etiquetaNombreUsuario.setFont(new Font("Times New Roman", Font.BOLD, 14));
        etiquetaNombreUsuario.setForeground(Color.CYAN);
        etiquetaNombreUsuario.setBounds(50,220, 150, 20);
        panellogin.add(etiquetaNombreUsuario);
        
        campoUsuario.setPreferredSize(new Dimension(150, 25));
        campoUsuario.setBounds(200, 220, 150, 25);
        panellogin.add(campoUsuario);
        
        JLabel etiquetaContrasena = new JLabel("Contraseña:");
        etiquetaContrasena.setFont(new Font("Times New Roman", Font.BOLD, 14));
        etiquetaContrasena.setForeground(Color.CYAN);
        etiquetaContrasena.setBounds(50, 260, 150, 20);
        panellogin.add(etiquetaContrasena);
        
        campoContrasena.setPreferredSize(new Dimension(150, 25));
        campoContrasena.setBounds(200, 260, 150, 25);
        panellogin.add(campoContrasena);
        
        
        botonIniciarSesion.setBounds(90, 300, 160, 120);
        panellogin.add(botonIniciarSesion);


        iniciarSesionC.setBounds(260, 300,160, 120); 
        panellogin.add(iniciarSesionC);

        atras.setBounds(30, 500, 60, 60);
        panellogin.add(atras);


        error.setBounds(200, 300,200,20);
        panellogin.add(error);
        
        getContentPane().add(panellogin);
        revalidate();
        repaint();
    }
    
    
    public void crearCuenta() {
        eliminarPanelAnterior(panelImagenLogin);
        panelCreate.removeAll();
        panelCreate.setOpaque(false);
    
        JLabel tituloLabel = new JLabel("<html><center>Crea una nueva<br>Cuenta</center></html>");
        tituloLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
        tituloLabel.setForeground(Color.WHITE);
        tituloLabel.setBounds(50, 10, 400, 80);
        panelCreate.add(tituloLabel);
    
        JPanel formularioPanel = new JPanel(null);
        formularioPanel.setOpaque(false);
    
        JLabel nombreDeUsuario = new JLabel("Nombre de usuario:");
        nombreDeUsuario.setFont(new Font("Times New Roman", Font.BOLD, 14));
        nombreDeUsuario.setForeground(Color.WHITE);
        nombreDeUsuario.setBounds(50, 120, 150, 20);
        formularioPanel.add(nombreDeUsuario);
    
        campoUsuario.setPreferredSize(new Dimension(150, 25));
        campoUsuario.setBounds(200, 120, 150, 25);
        formularioPanel.add(campoUsuario);
    
        JLabel fechaNacimientoLabel = new JLabel("Fecha de Nacimiento:");
        fechaNacimientoLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        fechaNacimientoLabel.setForeground(Color.WHITE);
        fechaNacimientoLabel.setBounds(50, 160, 150, 20);
        formularioPanel.add(fechaNacimientoLabel);
    
        campoFechaNacimiento.setBounds(200, 160, 150, 25);
        formularioPanel.add(campoFechaNacimiento);
    
        JLabel sexoLabel = new JLabel("Sexo:");
        sexoLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        sexoLabel.setForeground(Color.WHITE);
        sexoLabel.setBounds(50, 200, 150, 20);
        formularioPanel.add(sexoLabel);
    
        String[] opcionesSexo = {"Hombre", "Mujer"};
        JComboBox<String> comboBoxSexo = new JComboBox<>(opcionesSexo);
        sexoSeleccionado = (String) comboBoxSexo.getSelectedItem();
        comboBoxSexo.setBounds(200, 200, 150, 25);
        formularioPanel.add(comboBoxSexo);
    
        JLabel correoLabel = new JLabel("Correo Electrónico:");
        correoLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        correoLabel.setForeground(Color.WHITE);
        correoLabel.setBounds(50, 240, 150, 20);
        formularioPanel.add(correoLabel);
    
        campoCorreo.setBounds(200, 240, 150, 25);
        formularioPanel.add(campoCorreo);
    
        JLabel contrasenaLabel = new JLabel("Contraseña:");
        contrasenaLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        contrasenaLabel.setForeground(Color.WHITE);
        contrasenaLabel.setBounds(50, 280, 150, 20);
        formularioPanel.add(contrasenaLabel);
    
        campoContrasena.setBounds(200, 280, 150, 25);
        formularioPanel.add(campoContrasena);
    
        JLabel telefonoLabel = new JLabel("Número de Teléfono:");
        telefonoLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        telefonoLabel.setForeground(Color.WHITE);
        telefonoLabel.setBounds(50, 320, 150, 20);
        formularioPanel.add(telefonoLabel);

        campoTelefono.setBounds(200, 320, 150, 25);
        formularioPanel.add(campoTelefono);
    
        JLabel estadoLabel = new JLabel("Estado:");
        estadoLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        estadoLabel.setForeground(Color.WHITE);
        estadoLabel.setBounds(50, 360, 150, 20);
        formularioPanel.add(estadoLabel);
    
        campoEstado.setBounds(200, 360, 150, 25);
        formularioPanel.add(campoEstado);
    
        JLabel municipioLabel = new JLabel("Municipio:");
        municipioLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        municipioLabel.setForeground(Color.WHITE);
        municipioLabel.setBounds(50, 400, 150, 20);
        formularioPanel.add(municipioLabel);
    
        campoMunicipio.setBounds(200, 400, 150, 25);
        formularioPanel.add(campoMunicipio);
    
        JLabel localidadLabel = new JLabel("Localidad:");
        localidadLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        localidadLabel.setForeground(Color.WHITE);
        localidadLabel.setBounds(50, 440, 150, 20);
        formularioPanel.add(localidadLabel);
    
        campoLocalidad.setBounds(200, 440, 150, 25);
        formularioPanel.add(campoLocalidad);
    
        finalizarButton.setBounds(90, 440, 160, 120);
        formularioPanel.add(finalizarButton);

        crearCtaConductor.setBounds(250, 440,160,120); 
        formularioPanel.add(crearCtaConductor);
        
        atras.setBounds(30, 500,60,60);
        atras.setContentAreaFilled(false);
        atras.setBorderPainted(false);
        atras.setForeground(Color.WHITE);
        formularioPanel.add(atras);
        
        error.setBounds(150,527,80,20);
        formularioPanel.add(error);

        panelCreate.add(formularioPanel);
        getContentPane().add(panelCreate);
        revalidate();
        repaint();
    }


    public BotonImagen getIniciarSesionC() {
        return iniciarSesionC;
    }

    public JButton getIniciarSesionButton() {
        return iniciarSesionButton;
    }
 
    public JButton getBotonIniciarSesion() {
        return botonIniciarSesion;
    }

    public JButton getCrearCuentaButton() {
        return crearCuentaButton;
    }
 
    public JButton getFinalizarButton() {
        return finalizarButton;
    }

    public JButton getCrearCtaConductor() {
        return crearCtaConductor;
    }

    public JTextField getCampoTelefono() {
        return campoTelefono;
    } 
    public JTextField getCampoUsuario() {
        return campoUsuario;
    }

    public String getSexoSeleccionado() {
        return sexoSeleccionado;
    }
 
    public JTextField getCampoFechaNacimiento() {
        return campoFechaNacimiento;
    }


    public JLabel getError() {
        return error;
    }
 
 
    public JPasswordField getCampoContrasena() {
        return campoContrasena;
    }
 
 
    public JTextField getCampoEstado() {
        return campoEstado;
    }
 
    public JTextField getCampoLocalidad() {
        return campoLocalidad;
    }
 
 
     public JTextField getCampoMunicipio() {
         return campoMunicipio;
     }


     public JButton getAtras() {
         return atras;
     }


     public JButton getLuego() {
         return luego;
     }

     public JTextField getCampoCorreo() {
         return campoCorreo;
     }
    
    public void eliminarPanelAnterior(JPanel panelAnterior) {
        getContentPane().remove(panelAnterior);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        ConfiguracionModel c = new ConfiguracionModel();
        ControladorPrincipal p = new ControladorPrincipal(c);
    }
}