package CarHup;
import java.awt.*;
import java.awt.event.*;
import java.util.Collections;

import javax.swing.*;
public class CarHup extends JFrame implements ActionListener{

    //Josmar
    JPanel loginNorte;
    JDialog ventana2;
    JPanel norte;
    ImageIcon logoVna;

    //Koyoc
    JPanel inicioP;
    JScrollPane barraDesplazamiento; 

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

    ConfiguracionModel usuario;

      

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
        barraDesplazamiento=null;

        usuario = new ConfiguracionModel();
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

        iniciarSesionButton.addActionListener(e -> iniciarSesion(loginCenterP));
        crearCuentaButton.addActionListener(e -> crearCuenta(loginCenterP));
 
        loginNorte.add(iniciarSesionButton);
        loginNorte.add(crearCuentaButton);
        loginNorte.add(inicioCrear);
        loginNorte.add(loginImagen);
        ventana2.getContentPane().add(loginNorte, BorderLayout.NORTH);
        ventana2.getContentPane().setBackground(new Color(30,30,30));
    }

    private void iniciarSesion(JPanel loginCenterP){
       //Josmar
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

    crearCtaConductor.addActionListener(e -> crearCuentaConductor());
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

    }
    

    private void crearCuentaConductor(){
        //Josmar
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

    private void inicio() {

    Datos datos = new Datos();
    List<Usuario> listaUsuarios = datos.datos1();
    
    inicioP.removeAll(); 
    
    inicioP.setLayout(new GridLayout(listaUsuarios.size(), 2));
    
    Collections.shuffle(listaUsuarios);
    
    for (Usuario usuario : listaUsuarios) {
        // Panel para cada usuario
        JPanel usuarioPanel = new JPanel(new BorderLayout());
        usuarioPanel.setBackground(new Color(150, 100, 50));
            usuarioPanel.setLayout(new GridLayout(1, 2)); 
    
            // Subpanel para la foto
            JPanel fotoPanel = new JPanel();
            JLabel fotoLabel = new JLabel("Foto de " + usuario.getNombre());
            fotoPanel.add(fotoLabel);

            //Sub panel para la descripcion
            JPanel descripcionPanel = new JPanel();
            descripcionPanel.setLayout(new GridLayout(4, 1)); // Tres filas para la descripción
            descripcionPanel.add(new JLabel("Nombre: " + usuario.getNombre()));
            descripcionPanel.add(new JLabel("Fecha de Nacimiento: " + usuario.getFechaNacimiento()));
            descripcionPanel.add(new JLabel("Correo: " + usuario.getCorreo()));

            // Botón "Llamar"
            JButton llamarButton = new JButton("Llamar");
            llamarButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Lógica para llamar al usuario
                    JOptionPane.showMessageDialog(null, "Llamando a " + usuario.getNombre());
                }
            });

            descripcionPanel.add(llamarButton);
            usuarioPanel.add(fotoPanel);
            usuarioPanel.add(descripcionPanel);
            usuarioPanel.setBorder(BorderFactory.createLineBorder(new Color(255, 140, 0)));
            inicioP.add(usuarioPanel);
        }
        
        if (barraDesplazamiento == null) {
            barraDesplazamiento = new JScrollPane(inicioP);
            barraDesplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            getContentPane().add(barraDesplazamiento, BorderLayout.CENTER);
        } else {
            barraDesplazamiento.setViewportView(inicioP);
        }
        revalidate();
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