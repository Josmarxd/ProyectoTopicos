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
        norte.setLayout(new BoxLayout(norte, BoxLayout.Y_AXIS));
        norte.setPreferredSize(new Dimension(800, 200));
        norte.setBackground(Color.black);

        nombreCarHup.setFont(new Font("Times New Roman", Font.BOLD, 35));
        nombreCarHup.setAlignmentX(Component.CENTER_ALIGNMENT);
        nombreCarHup.setForeground(Color.WHITE);
        // Agregar espacio entre "CARHUP" y el logo
        norte.add(Box.createVerticalStrut(10));

        // Agregar "CARHUP" al panel
        norte.add(nombreCarHup);

        // Configuración del logo
        ImageIcon logoimg = new ImageIcon("carhuplogo.jpg");
        logo.setIcon(new ImageIcon(logoimg.getImage().getScaledInstance(140, 55, Image.SCALE_SMOOTH)));
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Agregar el logo al panel
        norte.add(logo);

        JPanel botonesPanel = new JPanel(new FlowLayout()); // Panel para los botones
        botonesPanel.setBackground(Color.BLACK); 
        botonesPanel.add(inicioButton);
        botonesPanel.add(buscarButton);
        botonesPanel.add(loginButton);
        botonesPanel.add(configuracionButton);

        logo.setAlignmentX(Component.CENTER_ALIGNMENT);

        norte.add(nombreCarHup);
        norte.add(botonesPanel);
        norte.add(logo);

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