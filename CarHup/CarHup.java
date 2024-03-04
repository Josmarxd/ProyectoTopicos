package CarHup;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CarHup extends JFrame implements ActionListener{

    //Josmar
    JPanel loginNorte;
    JDialog ventana2;
    JPanel norte;
    ImageIcon logoVna;

    //Koyoc
    JPanel inicioP;

    //PANEL NORTE
    JLabel nombreU;
    JLabel nombreCarHup;
    JLabel logo;
    

    //botones nena
    JButton inicioButton;
    JButton buscarButton;
    JButton loginButton;
    JButton configuracionButton;
    JButton modoOscuroButton;
    JButton miInformacionButton;

      

    public CarHup(){
        loginNorte = new JPanel();
        ventana2 = new JDialog(this, "VENTANA 2",true);
        inicioP = new JPanel();

        norte = new JPanel();
        nombreU = new JLabel("Hola"+ " Josmar");
        nombreCarHup = new JLabel("CARHUP");
        logo = new JLabel();
        inicioButton = new JButton("Inicio");
        buscarButton = new JButton("Buscar");
        loginButton = new JButton("Login");
        configuracionButton = new JButton("Configuración");
        modoOscuroButton = new JButton("Modo Oscuro");
        miInformacionButton = new JButton("Mi Información");
        logoVna = new ImageIcon("CarHup/Imagenes/Loficial.png");
        init();
        
    }


    private void init(){
       this.setVisible(true);
       this.setSize(900,900);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setLayout(new BorderLayout());
       this.setLocationRelativeTo(null);
       this.setTitle("CARHUP");
       this.setIconImage(logoVna.getImage());

       norte();
       inicio();

       // Registra ActionListener para los botones
    inicioButton.addActionListener(this);
    buscarButton.addActionListener(this);
    loginButton.addActionListener(this);
    configuracionButton.addActionListener(this);
    modoOscuroButton.addActionListener(this);
    miInformacionButton.addActionListener(this);
    }

    private void norte() {
        norte.setLayout(null);
        norte.setPreferredSize(new Dimension(800, 200));
        norte.setBackground(Color.black);
        nombreCarHup.setFont(new Font("Times New Roman", Font.BOLD, 35));
        nombreCarHup.setForeground(Color.WHITE);
        // Agregar espacio entre "CARHUP" y el logo
        nombreCarHup.setBounds(570, 20, 200, 30);
        inicioButton.setBounds(450,150,70,30);
        loginButton.setBounds(540, 150, 70, 30);
        buscarButton.setBounds(630, 150, 80, 30);
        configuracionButton.setBounds(720, 150, 120, 30);
        // Agregar "CARHUP" al panel
        norte.add(nombreCarHup);
        norte.add(inicioButton);
        norte.add(loginButton);
        norte.add(buscarButton);
        norte.add(configuracionButton);
        // Configuración del logo
        logo.setIcon(new ImageIcon(logoVna.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        logo.setBounds(600, 0, 100, 250);
        // Agregar el logo al panel
        norte.add(logo);
        
        this.getContentPane().add(norte, BorderLayout.NORTH);
    }

    
        
    private void login() {
        ventana2.setVisible(true);
        ventana2.setSize(400, 500);
        ventana2.setLocationRelativeTo(null);
        ventana2.setTitle("Iniciar sesión o Crear Cuenta");
        ventana2.setIconImage(logoVna.getImage());
        ventana2.setLayout(new BorderLayout());

        loginNorte.setLayout(null);
        loginNorte.setBackground(Color.BLACK);
        loginNorte.setPreferredSize(new Dimension(900, 140));

        JLabel inicioCrear = new JLabel("¿Eres nuevo o ya tienes una cuenta?");
        inicioCrear.setFont(new Font("Times New Roman", Font.BOLD, 23));
        inicioCrear.setBounds(10, 14, 400, 100);
        inicioCrear.setForeground(Color.WHITE);

        JLabel loginImagen = new JLabel();
        loginImagen.setIcon(new ImageIcon(logoVna.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH)));
        loginImagen.setBounds(150, 0, 200, 100);

        JButton iniciarSesionButton = new JButton("Iniciar sesión");
        JButton crearCuentaButton = new JButton("Crear Cuenta");

        iniciarSesionButton.setBounds(50, 100, 120, 20);
        crearCuentaButton.setBounds(200, 100, 120, 20);

        JPanel loginCenterP = new JPanel();
        loginCenterP.setBackground(new Color(30, 30, 30));
        loginCenterP.setLayout(null);
        loginCenterP.setPreferredSize(new Dimension(900,900));

        
        crearCuentaButton.addActionListener(e -> crearCuenta(loginCenterP));
        iniciarSesionButton.addActionListener(e -> iniciarSesion(loginCenterP));

        loginNorte.add(iniciarSesionButton);
        loginNorte.add(crearCuentaButton);
        loginNorte.add(inicioCrear);
        loginNorte.add(loginImagen);
        ventana2.getContentPane().add(loginNorte, BorderLayout.NORTH);
        ventana2.getContentPane().setBackground(new Color(30,30,30));
    }

    private void iniciarSesion(JPanel loginCenterP) {
        loginCenterP.removeAll();
        
        JLabel iniciarSecion = new JLabel("Inicia sesion");
        iniciarSecion.setFont(new Font("Times New Roman", Font.BOLD, 20));
        iniciarSecion.setForeground(Color.WHITE);
        iniciarSecion.setBounds(20, 10, 200, 30);
        loginCenterP.add(iniciarSecion);

        JLabel etiquetaNombreUsuario = new JLabel("Nombre de Usuario:");
        JTextField campoNombreUsuario = new JTextField();
    
        JLabel etiquetaContrasena = new JLabel("Contraseña:");
        JPasswordField campoContrasena = new JPasswordField();

        Font fuenteEtiqueta = new Font("Times New Roman", Font.BOLD, 14);
        Color colorTexto = Color.WHITE;

        etiquetaContrasena.setFont(fuenteEtiqueta);
        etiquetaContrasena.setForeground(colorTexto);

        etiquetaNombreUsuario.setFont(fuenteEtiqueta);
        etiquetaNombreUsuario.setForeground(colorTexto);


    
        // Botón de inicio de sesión
        JButton botonIniciarSesion = new JButton("Iniciar Sesión");
        botonIniciarSesion.addActionListener(e -> iniciarDatos());
    
        
        etiquetaNombreUsuario.setBounds(20, 45, 150, 25);
        campoNombreUsuario.setBounds(190, 45, 150, 25);
    
        etiquetaContrasena.setBounds(20, 80, 150, 25);
        campoContrasena.setBounds(190, 80, 150, 25);
    
        botonIniciarSesion.setBounds(20, 120, 300, 25);
    
        
        loginCenterP.add(etiquetaNombreUsuario);
        loginCenterP.add(campoNombreUsuario);
        loginCenterP.add(etiquetaContrasena);
        loginCenterP.add(campoContrasena);
        loginCenterP.add(botonIniciarSesion);

        ventana2.getContentPane().add(loginCenterP, BorderLayout.CENTER);
        ventana2.revalidate();
        ventana2.repaint();
    }
    
    

   private void crearCuenta(JPanel loginCenterP) {
    loginCenterP.removeAll();

    // Etiqueta "Crear Cuenta"
    JLabel crearCuentaLabel = new JLabel("Crear Cuenta");
    crearCuentaLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
    crearCuentaLabel.setForeground(Color.WHITE);
    crearCuentaLabel.setBounds(50, 10, 200, 30);
    loginCenterP.add(crearCuentaLabel);

    // Etiquetas y componentes restantes
    JLabel nombreDeUsuario = new JLabel("Nombre de usuario:");
    JTextField campoUsuario = new JTextField(20);

    JLabel fechaNacimientoLabel = new JLabel("Fecha de Nacimiento:");
    JTextField campoFechaNacimiento = new JTextField(20);

    JLabel sexoLabel = new JLabel("Sexo:");
    String[] opcionesSexo = {"Hombre", "Mujer"};
    JComboBox<String> comboBoxSexo = new JComboBox<>(opcionesSexo);

    JLabel correoLabel = new JLabel("Correo Electrónico:");
    JTextField campoCorreo = new JTextField(20);

    JLabel contrasenaLabel = new JLabel("Contraseña:");
    JPasswordField campoContrasena = new JPasswordField(20);

    JButton crearCtaConductor = new JButton("Crear Cuenta conductor");
    JButton crearButton = new JButton("Crear");

    // Aplicar estilo a las etiquetas
    Font fuenteEtiqueta = new Font("Times New Roman", Font.BOLD, 14);
    Color colorTexto = Color.WHITE;

    fechaNacimientoLabel.setFont(fuenteEtiqueta);
    fechaNacimientoLabel.setForeground(colorTexto);

    sexoLabel.setFont(fuenteEtiqueta);
    sexoLabel.setForeground(colorTexto);

    correoLabel.setFont(fuenteEtiqueta);
    correoLabel.setForeground(colorTexto);

    contrasenaLabel.setFont(fuenteEtiqueta);
    contrasenaLabel.setForeground(colorTexto);

    nombreDeUsuario.setFont(fuenteEtiqueta);
    nombreDeUsuario.setForeground(colorTexto);

    crearCtaConductor.addActionListener(e -> crearCuentaConductor(loginCenterP));
    crearButton.addActionListener(e -> guardarDatos());

    // Posiciones de las etiquetas y componentes
    nombreDeUsuario.setBounds(50, 50, 150, 20);
    campoUsuario.setBounds(200, 50, 120, 20);

    fechaNacimientoLabel.setBounds(50, 80, 150, 20);
    campoFechaNacimiento.setBounds(200, 80, 120, 20);

    sexoLabel.setBounds(50, 110, 150, 20);
    comboBoxSexo.setBounds(200, 110, 120, 20);

    correoLabel.setBounds(50, 140, 150, 20);
    campoCorreo.setBounds(200, 140, 120, 20);

    contrasenaLabel.setBounds(50, 170, 150, 20);
    campoContrasena.setBounds(200, 170, 120, 20);

    crearCtaConductor.setBounds(195, 220, 175, 20);
    crearButton.setBounds(50, 220, 100, 20);

    // Agregar componentes al panel
    loginCenterP.add(nombreDeUsuario);
    loginCenterP.add(campoUsuario);
    loginCenterP.add(fechaNacimientoLabel);
    loginCenterP.add(campoFechaNacimiento);
    loginCenterP.add(sexoLabel);
    loginCenterP.add(comboBoxSexo);
    loginCenterP.add(correoLabel);
    loginCenterP.add(campoCorreo);
    loginCenterP.add(contrasenaLabel);
    loginCenterP.add(campoContrasena);
    loginCenterP.add(crearCtaConductor);
    loginCenterP.add(crearButton);

    ventana2.getContentPane().add(loginCenterP, BorderLayout.CENTER);
    ventana2.revalidate();
    ventana2.repaint();
    }

    private void guardarDatos(){
     // Logica para guardar los datos
    }


    private void iniciarDatos(){
    //Logica para iniciar session
    }
    

    private void crearCuentaConductor(JPanel loginCenterP) {
        loginCenterP.removeAll();  // Limpiar el panel existente
    
        // Etiqueta de agradecimiento
        JLabel graciasLabel = new JLabel("<html>¡GRACIAS por unirte!<br>Ahora necesitamos más información:</html>");
        graciasLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        graciasLabel.setForeground(Color.WHITE);
        graciasLabel.setBounds(50, 10, 400, 50);
    
        // Nuevos campos de información
        JLabel telefonoLabel = new JLabel("Número de Teléfono:");
        JTextField campoTelefono = new JTextField();
    
        JLabel estadoLabel = new JLabel("Estado:");
        JTextField campoEstado = new JTextField();
    
        JLabel municipioLabel = new JLabel("Municipio:");
        JTextField campoMunicipio = new JTextField();
    
        JLabel localidadLabel = new JLabel("Localidad:");
        JTextField campoLocalidad = new JTextField();
    
        JButton finalizarButton = new JButton("Finalizar");
    
        // Estilo para las etiquetas
        Font fuenteEtiqueta = new Font("Times New Roman", Font.BOLD, 14);
        Color colorTexto = Color.WHITE;
    
        telefonoLabel.setFont(fuenteEtiqueta);
        telefonoLabel.setForeground(colorTexto);
    
        estadoLabel.setFont(fuenteEtiqueta);
        estadoLabel.setForeground(colorTexto);
    
        municipioLabel.setFont(fuenteEtiqueta);
        municipioLabel.setForeground(colorTexto);
    
        localidadLabel.setFont(fuenteEtiqueta);
        localidadLabel.setForeground(colorTexto);
    
        // Posiciones de los nuevos componentes
        telefonoLabel.setBounds(50, 70, 150, 20);
        campoTelefono.setBounds(200, 70, 120, 20);
    
        estadoLabel.setBounds(50, 100, 150, 20);
        campoEstado.setBounds(200, 100, 120, 20);
    
        municipioLabel.setBounds(50, 130, 150, 20);
        campoMunicipio.setBounds(200, 130, 120, 20);
    
        localidadLabel.setBounds(50, 160, 150, 20);
        campoLocalidad.setBounds(200, 160, 120, 20);
    
        finalizarButton.setBounds(50, 200, 120, 30);
    
        // Agregar fondo al panel
        loginCenterP.setBackground(new Color(30, 30, 30));
    
        // Agregar componentes al panel
        loginCenterP.add(graciasLabel);
        loginCenterP.add(telefonoLabel);
        loginCenterP.add(campoTelefono);
        loginCenterP.add(estadoLabel);
        loginCenterP.add(campoEstado);
        loginCenterP.add(municipioLabel);
        loginCenterP.add(campoMunicipio);
        loginCenterP.add(localidadLabel);
        loginCenterP.add(campoLocalidad);
        loginCenterP.add(finalizarButton);
    
        // Agregar el panel al contenido de la ventana2
        ventana2.getContentPane().add(loginCenterP, BorderLayout.CENTER);
    
        // Refrescar la ventana2
        ventana2.revalidate();
        ventana2.repaint();
    }
    
    

    private void buscarConductor() {
        // Implementar funcionalidad de búsqueda de conductor
    }

    private void configuracion() {

    }

    private void modoOscuro(){

    }

    private void miInformacion(){

    }

    private void inicio(){
        inicioP.setBackground(new Color(30,30,30));
        this.getContentPane().add(inicioP);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == configuracionButton) {
            configuracion();
        } else if (e.getSource() == buscarButton) {
            buscarConductor();
        } else if (e.getSource() == inicioButton) {
            inicio();
        } else if (e.getSource() == loginButton) {
            login();
        } else if (e.getSource() == modoOscuroButton) {
            modoOscuro();
        } else if (e.getSource() == miInformacionButton) {
           miInformacion();
        }
    }
    public static void main(String[] args) {
        CarHup car = new CarHup();
    } 

}