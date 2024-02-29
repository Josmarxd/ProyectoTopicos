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

     //Buscar Conductor
    JButton buscarCButton;


    //Historial Conductor
    JButton historialButton;

    //INICIO;
    JButton iniciButton;

    //INICIAR SECION;
    JButton loginButton;
      

    public CarHup(){
        norte = new JPanel();

        nombreU = new JLabel("Hola"+ " Josmar");
        nombreCarHup = new JLabel("CARHUP");
        logo = new JLabel();
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
        norte.setPreferredSize(new Dimension(500, 170)); //establecer la dimension del panel
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

        //Login

        
        //buscar Conductor

        
        //Historial
        

        norte.add(nombreU,BorderLayout.CENTER); //añadir Etiqueta al panel
        norte.add(nombreCarHup); //añadir nombre de la app
        norte.add(logo); //añadir imagen
        this.getContentPane().add(norte,BorderLayout.NORTH); // colocar panel al norte      
    }

    private void login(){
    }


    private void buscarConductor(){

    }

    private void historial(){

    }

    private void inicio(){
     System.out.println("A JOSMAR LE GUSTAN LOS NEGROS");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buscarCButton)
              buscarConductor();
        else if(e.getSource() == historialButton)
              historial();
        else if(e.getSource() == iniciButton)
            inicio();
        else if(e.getSource() == loginButton)
            login();
    }


    public static void main(String[] args) {
        CarHup car = new CarHup();
    }

}