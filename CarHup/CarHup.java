package CarHup;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CarHup extends JFrame implements ActionListener{

    JPanel norte;

    //PANEL NORTE
    JLabel nombreU;
    JLabel nombreCarHup;
    JLabel logo;

    //botones nena
    JButton inicioButton;
    JButton buscarButton;
    JButton loginButton;
    JButton configuracionButton;
      

    public CarHup(){
        norte = new JPanel();

        nombreU = new JLabel("Hola"+ " Josmar");
        nombreCarHup = new JLabel("CARHUP");
        logo = new JLabel();
        inicioButton = new JButton("Inicio");
        buscarButton = new JButton("Buscar");
        loginButton = new JButton("Login");
        configuracionButton = new JButton("Configuración");
        init();
    }


    private void init(){
       this.setVisible(true);
       this.setSize(400,400);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setLayout(new BorderLayout());
       norte();
    }

    private void norte(){
        //Configuracion Panel
        norte.setLayout(null); //Para desbloquear las etiquetas detro del panel
        norte.setPreferredSize(new Dimension(900, 170)); //establecer la dimension del panel
        norte.setBackground(Color.CYAN);


       //Configurarcion etiqueta Nombre Usuario Inicio
        nombreU.setBounds(60, 130, 200, 30); //dimencion del etiqueta nombre
        nombreU.setFont(new Font("Times New Roman",Font.BOLD, 35)); //Personalisar Etiqueta Nombre

        //Configuracion logo
        ImageIcon logoimg = new ImageIcon("src/Imagenes/CarHup.jpg");
        logo.setIcon(new ImageIcon(logoimg.getImage().getScaledInstance(140, 55,Image.SCALE_SMOOTH))); //modificar y alavez añadir
        logo.setBounds(800, 100, 140, 55); //tañano de la etiqueta imagen


        //configuracion nombreApp
        nombreCarHup.setBounds(600, 50,150, 35);
        nombreCarHup.setFont(new Font("Times New Roman",Font.BOLD,35));

        // Posicionamiento de los botones
        inicioButton.setBounds(10, 10, 100, 30);
        buscarButton.setBounds(120, 10, 100, 30);
        loginButton.setBounds(230, 10, 100, 30);
        configuracionButton.setBounds(340, 10, 150, 30);

        norte.add(nombreU, BorderLayout.CENTER);
        norte.add(nombreCarHup);
        norte.add(logo);
        norte.add(inicioButton);
        norte.add(buscarButton);
        norte.add(loginButton);
        norte.add(configuracionButton);

        this.getContentPane().add(norte, BorderLayout.NORTH);
    }

    private void login() {
        // Implementar funcionalidad de login
    }

    private void buscarConductor() {
        // Implementar funcionalidad de búsqueda de conductor
    }

    private void historial() {
        // Implementar funcionalidad de historial
    }

    private void inicio() {
        // Implementar funcionalidad de inicio
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buscarButton)
            buscarConductor();
        else if (e.getSource() == configuracionButton)
            historial();
        else if (e.getSource() == inicioButton)
            inicio();
        else if (e.getSource() == loginButton)
            login();
        // Agregar acciones para el botón de configuración si es necesario
    }

   


    public static void main(String[] args) {
        CarHup car = new CarHup();
    }

}