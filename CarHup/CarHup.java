import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.util.List;
public class CarHup extends JFrame{

    private JPanel buscador;
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
    private JTextField campoCorreo;
    private JTextField campoTelefono;
    private JTextField campoEstado;
    private JTextField campoLocalidad;
    private JTextField campoMunicipio;
    private JTextField campoFechaNacimiento;
    private JPasswordField campoContrasena;
    private String sexoSeleccionado;
    private JButton miInformacionButton;
    private JButton modoOscuroButton;
    private JPanelImage config;
    private JPanel inicioP;
    private JScrollPane barraDesplazamiento;
    private JButton inicioButton;
    private BotonImagen buscarButton;
    private ImageIcon buscarImagen;
    private BotonImagen loginButton;
    private ImageIcon loginImagen;
    private JButton configuracionButton;
    private JLabel nombreCarHup;
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
    private Color textoColorBlack;
    private JPanelImage fondoPanel;
    private JButton acercaDe;

    
       
    public CarHup(String nombre) {
        super(nombre);
        buscador = new JPanel();
        infFot = new JPanel();
        inicioP = new JPanel();
        inicioP.setOpaque(false);
        resert = new JButton("actualizar");
        loginNorte = new JPanel();
        ventana2 = new JDialog(this, "VENTANA 2", true);
        norte = new JPanel();
        nombreCarHup = new JLabel("CARHUP");
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
        config = new JPanelImage("CarHup/Imagenes/Fondo1.jpg");
        finalizarButton = new JButton("Finalizar");
        fondoPanel = new JPanelImage("CarHup/Imagenes/Fondo.png");
        panelImagenLogin = new JPanelImage("CarHup/Imagenes/Fondo.png");
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
        inicioCrear.setForeground(Color.BLACK);
        loginNorte.add(inicioCrear);
    
        JLabel loginImagen = new JLabel(new ImageIcon(logoVna.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH)));
        loginNorte.add(loginImagen);
    
        iniciarSesionButton.setPreferredSize(new Dimension(120, 30));
        iniciarSesionButton.setForeground(Color.BLACK); // Letras blancas
        iniciarSesionButton.setContentAreaFilled(false);
        loginNorte.add(iniciarSesionButton);
        loginNorte.setBorder(BorderFactory.createEtchedBorder());
    
        crearCuentaButton.setPreferredSize(new Dimension(120, 30));
        crearCuentaButton.setForeground(Color.BLACK); // Letras blancas
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
        iniciarSesionLabel.setForeground(Color.BLACK);
        loginCenterP.add(iniciarSesionLabel, BorderLayout.NORTH);
    
        JPanel formularioPanel = new JPanel();
        formularioPanel.setLayout(new GridLayout(2, 2, 10, 10));
        formularioPanel.setOpaque(false);
    
        JLabel etiquetaNombreUsuario = new JLabel("Nombre de Usuario:");
        etiquetaNombreUsuario.setFont(new Font("Times New Roman", Font.BOLD, 14));
        etiquetaNombreUsuario.setForeground(Color.BLACK);
    
        campoUsuario.setPreferredSize(new Dimension(150, 25));
    
        JLabel etiquetaContrasena = new JLabel("Contraseña:");
        etiquetaContrasena.setFont(new Font("Times New Roman", Font.BOLD, 14));
        etiquetaContrasena.setForeground(Color.BLACK);
    
        campoContrasena.setPreferredSize(new Dimension(150, 25));
    
        formularioPanel.add(etiquetaNombreUsuario);
        formularioPanel.add(campoUsuario);
        formularioPanel.add(etiquetaContrasena);
        formularioPanel.add(campoContrasena);
    
        loginCenterP.add(formularioPanel, BorderLayout.CENTER); 
    
        botonIniciarSesion.setForeground(Color.BLACK); 
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
        crearCuentaLabel.setForeground(Color.BLACK);
        loginCenterP.add(crearCuentaLabel, BorderLayout.NORTH);
    
        JPanel formularioPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        formularioPanel.setOpaque(false);
    
        JLabel nombreDeUsuario = new JLabel("Nombre de usuario:");
        nombreDeUsuario.setFont(new Font("Times New Roman", Font.BOLD, 14));
        nombreDeUsuario.setForeground(Color.BLACK);
    
        JLabel fechaNacimientoLabel = new JLabel("Fecha de Nacimiento:");
        fechaNacimientoLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        fechaNacimientoLabel.setForeground(Color.BLACK);
    
        JLabel sexoLabel = new JLabel("Sexo:");
        sexoLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        sexoLabel.setForeground(Color.BLACK);
        String[] opcionesSexo = {"Hombre", "Mujer"};
        JComboBox<String> comboBoxSexo = new JComboBox<>(opcionesSexo);
        sexoSeleccionado = (String) comboBoxSexo.getSelectedItem();
    
        JLabel correoLabel = new JLabel("Correo Electrónico:");
        correoLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        correoLabel.setForeground(Color.BLACK);
    
        JLabel contrasenaLabel = new JLabel("Contraseña:");
        contrasenaLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        contrasenaLabel.setForeground(Color.BLACK);
    
        crearCtaConductor.setForeground(Color.BLACK);
        crearCtaConductor.setContentAreaFilled(false);
    
        crearButton.setForeground(Color.BLACK);
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
        graciasLabel.setForeground(Color.BLACK);
        loginCenterP.add(graciasLabel, BorderLayout.NORTH);
    
        JPanel formularioPanel = new JPanel(new GridLayout(0, 2, 30, 20));
        formularioPanel.setOpaque(false);
    
        JLabel telefonoLabel = new JLabel("Número de Teléfono:");
        telefonoLabel.setForeground(Color.BLACK);
        formularioPanel.add(telefonoLabel);
        formularioPanel.add(campoTelefono);
    
        JLabel estadoLabel = new JLabel("Estado:");
        estadoLabel.setForeground(Color.BLACK);
        formularioPanel.add(estadoLabel);
        formularioPanel.add(campoEstado);
    
        JLabel municipioLabel = new JLabel("Municipio:");
        municipioLabel.setForeground(Color.BLACK);
        formularioPanel.add(municipioLabel);
        formularioPanel.add(campoMunicipio);
    
        JLabel localidadLabel = new JLabel("Localidad:");
        localidadLabel.setForeground(Color.BLACK);
        formularioPanel.add(localidadLabel);
        formularioPanel.add(campoLocalidad);
    
        finalizarButton.setForeground(Color.BLACK);
        finalizarButton.setContentAreaFilled(false);
        formularioPanel.add(finalizarButton);
    
        loginCenterP.add(formularioPanel, BorderLayout.CENTER);
        panelImagenLogin.add(loginCenterP, BorderLayout.CENTER);
    
        ventana2.revalidate();
        ventana2.repaint();
    }
     
    


    public void configuracion() {
        config.setLayout(null);
    
        JLabel configuracionLabel = new JLabel("Configuración");
        configuracionLabel.setForeground(Color.WHITE);
        configuracionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        configuracionLabel.setBounds(0, 10, 300, 30);
        config.add(configuracionLabel);
    
        miInformacionButton.setBounds(50, 50, 200, 40);
        modoOscuroButton.setBounds(50, 100, 200, 40);
        acercaDe.setBounds(50, 150, 200, 40);
    
        miInformacionButton.setForeground(Color.WHITE);
        miInformacionButton.setBackground(new Color(50, 50, 50));
        miInformacionButton.setFocusPainted(false);
    
        modoOscuroButton.setForeground(Color.WHITE);
        modoOscuroButton.setBackground(new Color(50, 50, 50));
        modoOscuroButton.setFocusPainted(false);
    
        acercaDe.setForeground(Color.WHITE);
        acercaDe.setBackground(new Color(50, 50, 50));
        acercaDe.setFocusPainted(false);
    
        config.add(miInformacionButton);
        config.add(modoOscuroButton);
        config.add(acercaDe);
    
        JLabel versionLabel = new JLabel("Versión 0.1");
        versionLabel.setForeground(Color.WHITE);
        versionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        versionLabel.setBounds(0, 210, 300, 30);
        config.add(versionLabel);
    
        JDialog configuracionDialog = new JDialog();
        configuracionDialog.setTitle("Configuración");
        configuracionDialog.setModal(true);
        configuracionDialog.getContentPane().add(config);
    
        configuracionDialog.setSize(300, 750);
    
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        configuracionDialog.setLocation(screenSize.width - configuracionDialog.getWidth(), 0);
    
        configuracionDialog.setVisible(true);
    }
    




    public void modoOscuro(){
     //METODO PARA EL MODO OSCURO
   }
    public void miInformacion(){
        //METODO PARA INFORMACION
    }


    public void buscar(String nombreConductor, ConfiguracionModel addUsuario) {
        
        inicioP.removeAll();
        inicioP.setOpaque(false);
    
        Font fuenteEtiqueta = new Font("Times New Roman", Font.BOLD, 14);
        Color colorTexto = Color.WHITE; 
    
        List<Usuario> listaUsuarios = addUsuario.getListaUsuarios();
    

        Usuario conductorEncontrado = null;
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(nombreConductor)) {
                conductorEncontrado = usuario;
                break;
            }
        }
    
        if (conductorEncontrado != null) {
            JPanelImage usuarioPanel = new JPanelImage("CarHup/Imagenes/Fondo1.jpg");
            
            usuarioPanel.setLayout(new GridLayout(1, 2));

            JPanelImage fotoPanel = new JPanelImage("CarHup/Imagenes/Fondo1.jpg");
            fotoPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
    
            JLabel fotoLabel = new JLabel();
            fotoPanel.add(fotoLabel);
    
            JPanel descripcionPanel = new JPanel();
            descripcionPanel.setOpaque(false);
            descripcionPanel.setLayout(new GridLayout(4, 1));
    
            JLabel nombreLabel = new JLabel("Nombre: " + conductorEncontrado.getNombre());
            nombreLabel.setFont(fuenteEtiqueta);
            nombreLabel.setForeground(colorTexto);
            descripcionPanel.add(nombreLabel);
    
            JLabel fechaNacimientoLabel = new JLabel("Fecha de Nacimiento: " + conductorEncontrado.getFechaNacimiento());
            fechaNacimientoLabel.setFont(fuenteEtiqueta);
            fechaNacimientoLabel.setForeground(colorTexto);
            descripcionPanel.add(fechaNacimientoLabel);
    
            JLabel correoLabel = new JLabel("Correo: " + conductorEncontrado.getCorreo());
            correoLabel.setFont(fuenteEtiqueta);
            correoLabel.setForeground(colorTexto);
            descripcionPanel.add(correoLabel);
    
            JButton llamarButton = new JButton("Llamar");
            llamarButton.setForeground(Color.WHITE);
            llamarButton.setBackground(Color.BLACK);
    
            descripcionPanel.add(llamarButton);
            usuarioPanel.add(fotoPanel);
            usuarioPanel.add(descripcionPanel);
            usuarioPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            inicioP.add(usuarioPanel);
    
            if (barraDesplazamiento == null) {
                barraDesplazamiento = new JScrollPane(inicioP);
                barraDesplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                barraDesplazamiento.setOpaque(false);
                barraDesplazamiento.getViewport().setOpaque(false); 
                fondoPanel.add(barraDesplazamiento, BorderLayout.CENTER);
            } else {
               
                barraDesplazamiento.setViewportView(inicioP);
            }
    
            fondoPanel.revalidate();
        }
    }
    
    


    public void inicio() {
        inicioP.removeAll();
        inicioP.setOpaque(false);
    
        JPanel principal = new JPanel();
        principal.setLayout(new FlowLayout(FlowLayout.CENTER)); 
        principal.setOpaque(false);
    
        JLabel tituloGrande = new JLabel("La movilidad del Futuro llegó");
        tituloGrande.setFont(new Font("Arial", Font.BOLD, 65));
        tituloGrande.setForeground(Color.BLACK);
        principal.add(tituloGrande);
    
        JLabel tituloMediano = new JLabel("La experiencia de autoconductor más seguro con Car Hup");
        tituloMediano.setFont(new Font("Arial", Font.BOLD, 35));
        tituloMediano.setForeground(Color.BLACK);
        principal.add(tituloMediano);
    
        inicioP.setLayout(new BorderLayout());
        inicioP.add(principal, BorderLayout.CENTER);
    
        fondoPanel.setOpaque(false);
        fondoPanel.setBackground(new Color(0, 0, 0));
        fondoPanel.add(inicioP, BorderLayout.CENTER);
        fondoPanel.revalidate();
    }
    
    
    public void sugerencias(ConfiguracionModel addUsuario) {
        inicioP.removeAll();
        inicioP.setOpaque(false);
    
        Font fuenteEtiqueta = new Font("Times New Roman", Font.BOLD, 14);
        Color colorTexto = Color.WHITE; 
    
        List<Usuario> listaUsuarios = addUsuario.getListaUsuarios();
    
        inicioP.setLayout(new GridLayout(listaUsuarios.size(), 2));
    
        Collections.shuffle(listaUsuarios);
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getEsConductor()) {
                JPanelImage usuarioPanel = new JPanelImage("CarHup/Imagenes/Fondo1.jpg");
                usuarioPanel.setLayout(new GridLayout(1, 2));

                JPanelImage fotoPanel = new JPanelImage("CarHup/Imagenes/Fondo1.jpg");
                fotoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    
                JLabel fotoLabel = new JLabel();
                fotoPanel.add(fotoLabel);
    
                JPanel descripcionPanel = new JPanel();
                descripcionPanel.setOpaque(false);
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
    
                JButton llamarButton = new JButton("Llamar");
                llamarButton.setForeground(Color.WHITE);
                llamarButton.setBackground(Color.BLACK);
    
                descripcionPanel.add(llamarButton);
                usuarioPanel.add(fotoPanel);
                usuarioPanel.add(descripcionPanel);
                usuarioPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
                inicioP.add(usuarioPanel);
            }
        }
    

        if (barraDesplazamiento == null) {
            barraDesplazamiento = new JScrollPane(inicioP);
            barraDesplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            barraDesplazamiento.setOpaque(false); 
            barraDesplazamiento.getViewport().setOpaque(false); 
    
            fondoPanel.add(barraDesplazamiento, BorderLayout.CENTER);
        } else {
            barraDesplazamiento.setViewportView(inicioP);
        }
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

    public JPanel getBuscador() {
        return buscador;
    }

    public static void main(String[] args) {
        CarHupControlle c = new CarHupControlle();
    }
}

