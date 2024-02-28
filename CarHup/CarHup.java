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
        ImageIcon logoimg = new ImageIcon("CarHup/Imagenes/Loficial.png");
        logo.setIcon(new ImageIcon(logoimg.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        logo.setBounds(600, 0, 100, 250);

        // Agregar el logo al panel
        norte.add(logo);

        this.getContentPane().add(norte, BorderLayout.NORTH);
    }




    private void login() {
        // Implementar funcionalidad de login
    }

    private void buscarConductor() {
        // Implementar funcionalidad de búsqueda de conductor
    }

    private void configuracion() {
        // Implementar funcionalidad de historial
    }

    private void inicio() {
        // Implementar funcionalidad de inicio
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buscarButton)
            buscarConductor();
        else if (e.getSource() == configuracionButton)
            configuracion();
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