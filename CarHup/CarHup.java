import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;
import javax.swing.*;
import java.util.List;
public class CarHup extends JFrame{

    private JPanelImage panelImagenLogin;
    private JPanel loginNorte;
    private JDialog ventana2;
    private JPanel norte;
    private ImageIcon logoVna;
    private JButton iniciarSesionButton;
    private JButton crearCuentaButton;
    private JPanel loginCenterP;
    private JButton botonIniciarSesion;
    private JButton crearCtaConductor;
    private JButton crearButton;
    private JTextField campoUsuario;


    private JPanel infFot;
    
    // Datos del Usuario
    private JTextField campoCorreo;
    private JTextField campoTelefono;
    private JTextField campoEstado;
    private JTextField campoLocalidad;
    private JTextField campoMunicipio;
    private JTextField campoFechaNacimiento;
    private JPasswordField campoContrasena;
    private String sexoSeleccionado;
    
    // Configuración
    private JButton miInformacionButton;
    private JButton modoOscuroButton;
    private JPanel config;
    

    //Buscar
    private JPanel inicioP;
    private JScrollPane barraDesplazamiento;
    // Botones Norte y más
    private JButton inicioButton;
    private BotonImagen buscarButton;
    private ImageIcon buscarImagen;
    private BotonImagen loginButton;
    private ImageIcon loginImagen;
    private JButton configuracionButton;
    private JLabel nombreCarHup;
    private JPanel principal;
    // Botones de Buscar y JLabel/información
    private JTextField buscarField;
    private JLabel nombreLabel;
    private JLabel numeroDeTelefonoLabel;
    private JLabel correoLabel;
    private JLabel edadLabel;
    private JButton llamarButton;
    private JButton finalizarButton;
    private JButton resert;
    private JButton buscarCButton;
    private JPanel informacioPanel;
    private Color textoColorWhite;
    private Color textoColorBlack;
    private JPanelImage fondoPanel;
    private JButton acercaDe;

    
       
    public CarHup(String nombre){
    super(nombre);
    infFot = new JPanel();
    inicioP = new JPanel();
    inicioP.setOpaque(false);
    resert = new JButton("actualizar");
    loginNorte = new JPanel();
    ventana2 = new JDialog(this, "VENTANA 2", true);
    norte = new JPanel();
    nombreCarHup = new JLabel("CARHUP");
    principal = new JPanel();
    inicioButton = new JButton("Inicio");

    buscarImagen = new ImageIcon("CarHup/Imagenes/Buscar.png");
    buscarButton = new BotonImagen(buscarImagen);

    loginImagen = new ImageIcon("CarHup/Imagenes/Cuenta.png");
    loginButton = new BotonImagen(loginImagen);
    
    configuracionButton = new JButton("Configuración");
    modoOscuroButton = new JButton("Modo Oscuro");
    miInformacionButton = new JButton("Mi Información");
    logoVna = new ImageIcon("CarHup/Imagenes/Loficial.png");
    buscarCButton = new JButton("Buscar");
    barraDesplazamiento = null;
    textoColorWhite = Color.WHITE;
    textoColorBlack = Color.BLACK;
    acercaDe = new JButton("Sugerencias");
    informacioPanel = new JPanel();

    // Buscar
    nombreLabel = new JLabel("Usuario");
    numeroDeTelefonoLabel = new JLabel("S/N");
    llamarButton = new JButton("Llamar");
    buscarField = new JTextField("Buscar");
    resert = new JButton("Sugerencias");

    // Login
    iniciarSesionButton = new JButton("Iniciar sesión");
    crearCuentaButton = new JButton("Crear Cuenta");
    loginCenterP = new JPanel();
    botonIniciarSesion = new JButton("Iniciar Sesión");
    crearCtaConductor = new JButton("Crear Cuenta conductor");
    crearButton = new JButton("Crear");
    campoTelefono = new JTextField();
    campoEstado = new JTextField();
    campoUsuario = new JTextField();
    campoLocalidad = new JTextField();
    campoMunicipio = new JTextField();
    campoFechaNacimiento = new JTextField();
    campoCorreo = new JTextField();
    campoContrasena = new JPasswordField();
    miInformacionButton = new JButton("Mi Información");
    config = new JPanel();
    finalizarButton = new JButton("Finalizar");
    fondoPanel = new JPanelImage("CarHup/Imagenes/Fondo.png");
    panelImagenLogin = new JPanelImage("CarHup/Imagenes/Fondo1.jpg");
    init();
    }


    private void init(){
       this.setVisible(true);
       this.setSize(900,900);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setLocationRelativeTo(null);
       this.setIconImage(logoVna.getImage());   
       this.getContentPane().add(fondoPanel);
        norte();
        inicio();
    }

    private void norte() {
    norte.setPreferredSize(new Dimension(800, 200));
    norte.setLayout(new FlowLayout(FlowLayout.LEFT, 200, 50)); 
    norte.setOpaque(false);

    nombreCarHup.setFont(new Font("Aptos", Font.BOLD, 30)); 
    nombreCarHup.setForeground(textoColorBlack);

    norte.add(nombreCarHup);

    
    JPanel panelBotones = new JPanel();
    panelBotones.setOpaque(false);
    panelBotones.setLayout(new FlowLayout(FlowLayout.LEFT, 35, 0)); 

    inicioButton.setContentAreaFilled(false);
    inicioButton.setFont(new Font("Aptos", Font.PLAIN, 18));
    inicioButton.setPreferredSize(new Dimension(100, 50));
    panelBotones.add(inicioButton);


    configuracionButton.setContentAreaFilled(false);
    configuracionButton.setFont(new Font("Aptos", Font.PLAIN, 18)); 
    configuracionButton.setPreferredSize(new Dimension(150, 50));
    panelBotones.add(configuracionButton);

    resert.setContentAreaFilled(false);
    resert.setFont(new Font("Aptos", Font.PLAIN, 18));
    panelBotones.add(resert);


    buscarButton.setContentAreaFilled(false);
    buscarButton.setFont(new Font("Aptos", Font.PLAIN, 18));
    panelBotones.add(buscarButton);
    
    loginButton.setContentAreaFilled(false);
    loginButton.setFont(new Font("Aptos", Font.PLAIN, 18));
    panelBotones.add(loginButton);

    norte.add(panelBotones);
    fondoPanel.add(norte, BorderLayout.NORTH);
}

    
public void login() {
    ventana2.setSize(400, 500);
    ventana2.setTitle("Iniciar sesión o Crear Cuenta");
    ventana2.setIconImage(logoVna.getImage());

    panelImagenLogin.setLayout(new BorderLayout());

    loginNorte.removeAll();

    loginCenterP.setBorder(BorderFactory.createEtchedBorder());
    
    loginNorte.setPreferredSize(new Dimension(400, 140));
    loginNorte.setOpaque(false);

    JLabel inicioCrear = new JLabel("¿Eres nuevo o ya tienes una cuenta?");
    inicioCrear.setFont(new Font("Times New Roman", Font.BOLD, 23));
    inicioCrear.setForeground(Color.WHITE);
    loginNorte.add(inicioCrear);

    JLabel loginImagen = new JLabel(new ImageIcon(logoVna.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH)));
    loginNorte.add(loginImagen);

    iniciarSesionButton.setPreferredSize(new Dimension(120, 30));
    iniciarSesionButton.setForeground(Color.WHITE); // Letras blancas
    iniciarSesionButton.setContentAreaFilled(false);
    loginNorte.add(iniciarSesionButton);
    loginNorte.setBorder(BorderFactory.createEtchedBorder());

    crearCuentaButton.setPreferredSize(new Dimension(120, 30));
    crearCuentaButton.setForeground(Color.WHITE); // Letras blancas
    crearCuentaButton.setContentAreaFilled(false);
    loginNorte.add(crearCuentaButton);

    panelImagenLogin.add(loginNorte, BorderLayout.NORTH);
    ventana2.setLocationRelativeTo(null);
    ventana2.getContentPane().add(panelImagenLogin);
    ventana2.setVisible(true);

    ventana2.revalidate();
    ventana2.repaint();
}



public void iniciarSesion() {
    loginCenterP.removeAll();
    loginCenterP.setOpaque(false);
    
    JLabel iniciarSesionLabel = new JLabel("Inicia sesión");
    iniciarSesionLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
    iniciarSesionLabel.setForeground(Color.WHITE);
    loginCenterP.add(iniciarSesionLabel, BorderLayout.NORTH);

    JPanel formularioPanel = new JPanel();
    formularioPanel.setLayout(new GridLayout(2, 2, 10, 10)); // 2 filas, 2 columnas, espacios de 10px
    formularioPanel.setOpaque(false);
    

    JLabel etiquetaNombreUsuario = new JLabel("Nombre de Usuario:");
    etiquetaNombreUsuario.setFont(new Font("Times New Roman", Font.BOLD, 14));
    etiquetaNombreUsuario.setForeground(Color.WHITE);

    campoUsuario.setPreferredSize(new Dimension(150, 25));

    JLabel etiquetaContrasena = new JLabel("Contraseña:");
    etiquetaContrasena.setFont(new Font("Times New Roman", Font.BOLD, 14));
    etiquetaContrasena.setForeground(Color.WHITE);

    
    campoContrasena.setPreferredSize(new Dimension(150, 25));

    formularioPanel.add(etiquetaNombreUsuario);
    formularioPanel.add(campoUsuario);
    formularioPanel.add(etiquetaContrasena);
    formularioPanel.add(campoContrasena);

    loginCenterP.add(formularioPanel, BorderLayout.CENTER); 

    botonIniciarSesion.setForeground(Color.WHITE); 
    botonIniciarSesion.setContentAreaFilled(false);
    loginCenterP.add(botonIniciarSesion, BorderLayout.SOUTH); 
    panelImagenLogin.add(loginCenterP, BorderLayout.CENTER);
    ventana2.revalidate();
    ventana2.repaint();
}

 

public void crearCuenta() {
loginCenterP.removeAll();
loginCenterP.setOpaque(false);

JLabel crearCuentaLabel = new JLabel("Crear Cuenta");
crearCuentaLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
crearCuentaLabel.setForeground(Color.WHITE);
loginCenterP.add(crearCuentaLabel, BorderLayout.NORTH);

// Panel para el formulario
JPanel formularioPanel = new JPanel(new GridLayout(0, 2, 5, 5)); // 0 filas, 2 columnas, espacios de 5px
formularioPanel.setOpaque(false);

// Etiquetas y componentes del formulario
JLabel nombreDeUsuario = new JLabel("Nombre de usuario:");
nombreDeUsuario.setFont(new Font("Times New Roman", Font.BOLD, 14));
nombreDeUsuario.setForeground(Color.WHITE);



JLabel fechaNacimientoLabel = new JLabel("Fecha de Nacimiento:");
fechaNacimientoLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
fechaNacimientoLabel.setForeground(Color.WHITE);


JLabel sexoLabel = new JLabel("Sexo:");
sexoLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
sexoLabel.setForeground(Color.WHITE);
String[] opcionesSexo = {"Hombre", "Mujer"};
JComboBox<String> comboBoxSexo = new JComboBox<>(opcionesSexo);
sexoSeleccionado = (String) comboBoxSexo.getSelectedItem();

JLabel correoLabel = new JLabel("Correo Electrónico:");
correoLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
correoLabel.setForeground(Color.WHITE);


JLabel contrasenaLabel = new JLabel("Contraseña:");
contrasenaLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
contrasenaLabel.setForeground(Color.WHITE);



crearCtaConductor.setForeground(Color.WHITE);
crearCtaConductor.setContentAreaFilled(false);

crearButton.setForeground(Color.WHITE);
crearButton.setContentAreaFilled(false);


formularioPanel.add(nombreDeUsuario);
formularioPanel.add(campoUsuario);
formularioPanel.add(fechaNacimientoLabel);
formularioPanel.add(campoFechaNacimiento);
formularioPanel.add(sexoLabel);
formularioPanel.add(comboBoxSexo);
formularioPanel.add(correoLabel);
formularioPanel.add(campoCorreo);
formularioPanel.add(contrasenaLabel);
formularioPanel.add(campoContrasena);
formularioPanel.add(crearCtaConductor);
formularioPanel.add(crearButton);


loginCenterP.add(formularioPanel, BorderLayout.CENTER);
panelImagenLogin.add(loginCenterP, BorderLayout.CENTER);
ventana2.revalidate();
ventana2.repaint();
}



public void crearCuentaConductor() {
loginCenterP.removeAll();
loginCenterP.setOpaque(false);

JLabel graciasLabel = new JLabel("<html>¡GRACIAS por unirte!<br>Ahora necesitamos más información:</html>");
graciasLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
graciasLabel.setForeground(Color.WHITE);
loginCenterP.add(graciasLabel, BorderLayout.NORTH);


JPanel formularioPanel = new JPanel(new GridLayout(0, 2, 30, 20)); // 0 filas, 2 columnas, espacios de 5px
formularioPanel.setOpaque(false);

// Nuevos campos de información
JLabel telefonoLabel = new JLabel("Número de Teléfono:");
telefonoLabel.setForeground(Color.WHITE); 
formularioPanel.add(telefonoLabel);
formularioPanel.add(campoTelefono);

JLabel estadoLabel = new JLabel("Estado:");
estadoLabel.setForeground(Color.WHITE);
formularioPanel.add(estadoLabel);
formularioPanel.add(campoEstado);

JLabel municipioLabel = new JLabel("Municipio:");
municipioLabel.setForeground(Color.WHITE); // Establecer color de texto blanco
formularioPanel.add(municipioLabel);
formularioPanel.add(campoMunicipio);

JLabel localidadLabel = new JLabel("Localidad:");
localidadLabel.setForeground(Color.WHITE); // Establecer color de texto blanco
formularioPanel.add(localidadLabel);
formularioPanel.add(campoLocalidad);

finalizarButton.setForeground(Color.WHITE); 
finalizarButton.setContentAreaFilled(false); 

formularioPanel.add(finalizarButton);

loginCenterP.add(formularioPanel, BorderLayout.CENTER);
panelImagenLogin.add(loginCenterP, BorderLayout.CENTER);

ventana2.revalidate();
ventana2.repaint();
} 
    
    public void configuracion() {
        // Crear el panel de configuración
        config.setBackground(new Color(30, 30, 30));

        miInformacionButton.setBounds(50, 50, 140, 30); //boton
        config.add(miInformacionButton); //añadimos

        modoOscuroButton.setBounds(50, 100, 140, 30);
        config.add(modoOscuroButton); //boton 2
    
        // Crear el diálogo de configuración
        JDialog configuracionDialog = new JDialog();
        configuracionDialog.setTitle("Configuración");
        configuracionDialog.setModal(true);
        configuracionDialog.getContentPane().add(config); // Añadir el panel al diálogo
    
        // Obtener las dimensiones de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
    
        // Configurar el tamaño del diálogo para que abarque todo el largo de la pantalla
        configuracionDialog.setSize(300, height);
    
        // Configurar la ubicación del diálogo para que se abra en la parte derecha de la pantalla
        configuracionDialog.setLocation(width - configuracionDialog.getWidth(), 0);
    
        // Hacer visible el diálogo
        configuracionDialog.setVisible(true);
        JLabel configuracionLabel = new JLabel("Configuración");
    
        // Añadir el logo y el texto al panel
        config.add(configuracionLabel);
    }

    public void modoOscuro(){
       JLabel Activado = new JLabel("Activado");
       JLabel Desactivado = new JLabel("Desactivado");

    Activado.setBounds(50, 150, 140, 30);
    Activado.setForeground(Color.CYAN);
    Desactivado.setBounds(50, 200, 140, 30);
    Desactivado.setForeground(Color.CYAN);

    config.add(Activado);
    config.add(Desactivado);

    config.revalidate();
    config.repaint();
}
    public void miInformacion(){
    }


    public void inicio() {
    fondoPanel.remove(inicioP); // Eliminar todos los componentes de inicioP
    inicioP.removeAll(); // Eliminar todos los componentes de inicioP
    inicioP.setOpaque(false); // Hacer el panel inicioP transparente
    inicioP.setBackground(new Color(0, 0, 0, 0)); // Establecer el fondo como transparente

    JPanel principal = new JPanel();
    principal.setOpaque(false); // Hacer el panel principal transparente
    principal.setBackground(new Color(0, 0, 0, 0)); // Establecer el fondo como transparente

    JLabel tituloGrande = new JLabel("La movilidad del Futuro llegó");
    tituloGrande.setFont(new Font("Arial", Font.BOLD, 65)); 
    tituloGrande.setForeground(Color.BLACK); 
    principal.add(tituloGrande); 
        
    JLabel tituloMediano = new JLabel("La experiencia de autoconductor más seguro con Car Hup");
    tituloMediano.setFont(new Font("Arial", Font.BOLD, 35));
    tituloMediano.setForeground(Color.BLACK);
    principal.add(tituloMediano);

    inicioP.add(principal);
    fondoPanel.add(inicioP);
    fondoPanel.revalidate();
}

public void sugerencias(ConfiguracionModel addUsuario) {
    fondoPanel.remove(inicioP); // Eliminar todos los componentes de inicioP
    inicioP.removeAll(); // Eliminar todos los componentes de inicioP
    inicioP.setOpaque(false); // Hacer el panel inicioP transparente
    inicioP.setBackground(new Color(0, 0, 0, 0)); // Establecer el fondo como transparente

    Font fuenteEtiqueta = new Font("Times New Roman", Font.BOLD, 14);
    Color colorTexto = Color.WHITE; // Cambiar color del texto a blanco
    
    List<Usuario> listaUsuarios = addUsuario.getListaUsuarios();
    
    inicioP.setLayout(new GridLayout(listaUsuarios.size(), 2));
    
    Collections.shuffle(listaUsuarios);
    for (Usuario usuario : listaUsuarios) {
        if (usuario.getEsConductor()) {
            // Construir paneles y agregar contenido para cada usuario
            JPanel usuarioPanel = new JPanel(new BorderLayout());
            usuarioPanel.setOpaque(false); // Hacer el panel usuarioPanel transparente
            usuarioPanel.setBackground(new Color(0, 0, 0, 0)); // Establecer el fondo como transparente
            usuarioPanel.setLayout(new GridLayout(1, 2));
            
            // Subpanel para la foto
            JPanel fotoPanel = new JPanel();
            fotoPanel.setOpaque(false); // Hacer el panel fotoPanel transparente
            fotoPanel.setBackground(new Color(0, 0, 0, 0)); // Establecer el fondo como transparente
            fotoPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
            
            // Permitir que la etiqueta tenga fondo
            JLabel fotoLabel = new JLabel();
            fotoPanel.add(fotoLabel);
    
            // Subpanel para la descripción
            JPanel descripcionPanel = new JPanel();
            descripcionPanel.setOpaque(false); // Hacer el panel descripcionPanel transparente
            descripcionPanel.setBackground(new Color(0, 0, 0, 0)); // Establecer el fondo como transparente
            descripcionPanel.setLayout(new GridLayout(4, 1));
    
            JLabel nombreLabel = new JLabel("Nombre: " + usuario.getNombre());
            nombreLabel.setFont(fuenteEtiqueta);
            nombreLabel.setForeground(colorTexto);
            descripcionPanel.add(nombreLabel);
    
            JLabel fechaNacimientoLabel = new JLabel("Fecha de Nacimiento: " + usuario.getFechaNacimiento());
            fechaNacimientoLabel.setFont(fuenteEtiqueta);
            fechaNacimientoLabel.setForeground(colorTexto);
            descripcionPanel.add(fechaNacimientoLabel);
    
            JLabel correoLabel = new JLabel("Correo: " + usuario.getCorreo());
            correoLabel.setFont(fuenteEtiqueta);
            correoLabel.setForeground(colorTexto);
            descripcionPanel.add(correoLabel);
    
            // Botón "Llamar"
            JButton llamarButton = new JButton("Llamar");
            llamarButton.setForeground(colorTexto); // Cambiar color del texto del botón a blanco
    
            descripcionPanel.add(llamarButton);
            usuarioPanel.add(fotoPanel);
            usuarioPanel.add(descripcionPanel);
            usuarioPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
            inicioP.add(usuarioPanel);
        }
    }
    
    fondoPanel.add(inicioP);
    fondoPanel.revalidate();
}

    
     
    
    
    
    
    
    
    


    public void setNombreLabel(JLabel nombreLabel) {
        this.nombreLabel = nombreLabel;
    }

    public void setNumeroDeTelefonoLabel(JLabel numeroDeTelefonoLabel) {
        this.numeroDeTelefonoLabel = numeroDeTelefonoLabel;
    }


    public JButton getLlamarButton() {
        return llamarButton;
    }

    public JLabel getNombreLabel() {
        return nombreLabel;
    }

    public JLabel getNumeroDeTelefonoLabel() {
        return numeroDeTelefonoLabel;
    }

  
    public JTextField getBuscarField() {
        return buscarField;
    }


    public JLabel getCorreoLabel() {
        return correoLabel;
    }

    public void setEdadLabel(JLabel edadLabel) {
        this.edadLabel = edadLabel;
    }

    public JTextField getCampoCorreo() {
        return campoCorreo;
    }


    public JLabel getEdadLabel() {
        return edadLabel;
    }


    public JButton getResert() {
        return resert;
    }

    public String getSexoSeleccionado() {
        return sexoSeleccionado;
    }


    public JButton getInicioButton() {
        return inicioButton;
    }

    public JButton getBuscarButton() {
        return buscarButton;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getConfiguracionButton() {
        return configuracionButton;
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

   public JButton getMiInformacionButton() {
       return miInformacionButton;
   }

   public JPanel getNorte() {
       return norte;
   }


   public JButton getModoOscuroButton() {
       return modoOscuroButton;
   }

   public JButton getCrearButton() {
       return crearButton;
   }

   public JTextField getCampoTelefono() {
       return campoTelefono;
   }

   public JButton getBuscarCButton() {
       return buscarCButton;
   }

   public JTextField getCampoUsuario() {
       return campoUsuario;
   }

   public JTextField getCampoFechaNacimiento() {
       return campoFechaNacimiento;
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


    

    public static void main(String[] args) {
        CarHupControlle c = new CarHupControlle();
    }
}

