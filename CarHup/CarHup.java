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
        ventana2.setSize(400,500);
        ventana2.setLocationRelativeTo(null);
        ventana2.setTitle("Iniciar sesion o Crear Cuenta");
        ventana2.setIconImage(logoVna.getImage());
        ventana2.setLayout(new BorderLayout());
        
        loginNorte.setLayout(null);
        loginNorte.setBackground(Color.BLACK);
        loginNorte.setPreferredSize(new Dimension(900,140));

        JLabel inicioCrear = new JLabel("¿Eres nuevo o ya tienes una cuenta?");
         inicioCrear.setFont(new Font("Times New Roman", Font.BOLD, 23));
         inicioCrear.setBounds(10,14,400,100);
         inicioCrear.setForeground(Color.WHITE);

         JLabel loginImagen = new JLabel();
         loginImagen.setIcon(new ImageIcon(logoVna.getImage().getScaledInstance(60, 60,Image.SCALE_SMOOTH)));
         loginImagen.setBounds(150,0, 200, 100);


         JButton iniciarSesionButton = new JButton("Iniciar sesion");
         JButton crearCuentaButton = new JButton("Crear Cuenta");
         JButton crearCtaConductor = new JButton("Crear Cuenta conductor");
 
         iniciarSesionButton.addActionListener(e -> iniciarSesion());
         crearCuentaButton.addActionListener(e -> crearCuenta());
         crearCtaConductor.addActionListener(e -> crearCuentaConductor());

        iniciarSesionButton.setBounds(50,100,120,20);
        crearCuentaButton.setBounds(200,100,120,20);


        JPanel loginCenterP = new JPanel();
        loginCenterP.setBackground(new Color(30,30,30));

        
        loginNorte.add(iniciarSesionButton);
        loginNorte.add(crearCuentaButton);
        loginNorte.add(inicioCrear);
        loginNorte.add(loginImagen);
        ventana2.getContentPane().add(loginNorte,BorderLayout.NORTH);
        ventana2.getContentPane().add(loginCenterP);
        this.add(ventana2);
        
    }

    private void iniciarSesion(){
       //Josmar
    }

    private void crearCuenta(){
      //Josmar
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