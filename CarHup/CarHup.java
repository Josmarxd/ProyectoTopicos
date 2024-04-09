import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CarHup extends JFrame{

    private ImageIcon logoVna;
    private JDialog ventana3;


    private JLabel nombreJLabel;

    private BotonImagen atras2;


    private JPanel buscador;
    private JDialog ventana2;
    private JPanelImage norte;
    private JButton miInformacionButton;
    private JButton modoOscuroButton;
    private JPanelImage config;
    private JPanel inicioP;
    private JButton inicioButton;
    private BotonImagen buscarButton;
    private BotonImagen loginButton;
    private JButton configuracionButton;
    private JLabel nombreCarHup;
    private JTextField buscarField;
    private JButton llamarButton;
    private JButton resert;
    private JButton buscarCButton;
    private JButton acercaDe;
    private JPanelImage sugerenciaI;
    private JPanel panelBotones;
    private JButton misReservas;
    private JButton reservar;
       
    public CarHup(String nombre) {
        super(nombre);
        buscador = new JPanel();
        inicioP = new JPanel();
        inicioP.setOpaque(false);
        misReservas = new JButton("Mis Reservas");
        reservar = new JButton("Reservar");
        nombreJLabel = new JLabel("Usuario");
        ventana3 = new JDialog(this, "Sugerencias",true);
        sugerenciaI= new JPanelImage("CarHup/Imagenes/FondoPanel.jpg");
        atras2 = new BotonImagen("CarHup/Imagenes/Atras.png");
        resert = new JButton("actualizar");
        norte = new JPanelImage("CarHup/Imagenes/FondoPanel.jpg");
        nombreCarHup = new JLabel("CARHUP");
        inicioButton = new JButton("Inicio");
        buscarButton = new BotonImagen("CarHup/Imagenes/Buscar.png");
        loginButton = new BotonImagen("CarHup/Imagenes/Cuenta.png");
        panelBotones = new JPanel();
        
        configuracionButton = new JButton("Configuración");
        modoOscuroButton = new JButton("Modo Oscuro");
        miInformacionButton = new JButton("Mi Información");
        logoVna = new ImageIcon("CarHup/Imagenes/Loficial.png");
        buscarCButton = new JButton("Buscar");
        acercaDe = new JButton("Sugerencias");
    
        // Buscar
        llamarButton = new JButton("Llamar");
        buscarField = new JTextField("Buscar");
        resert = new JButton("Sugerencias");
    
        miInformacionButton = new JButton("Mi Información");
        config = new JPanelImage("CarHup/Imagenes/Fondo1.jpg");
        logoVna = new ImageIcon("CarHup/Imagenes/Loficial2.png");
        init();
    }
    


    public void init(){
       this.setVisible(true);
       this.setSize(900,900);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setLocationRelativeTo(null);
       this.setIconImage(logoVna.getImage());   
        norte();
    }


    public void norte() {
        norte.setPreferredSize(new Dimension(800, 200));
        norte.setLayout(new FlowLayout(FlowLayout.LEFT, 200, 50));
    
        nombreCarHup.setFont(new Font("Aptos", Font.BOLD, 30));
        nombreCarHup.setForeground(Color.WHITE);
    
        panelBotones.setOpaque(false);
        panelBotones.setLayout(new FlowLayout(FlowLayout.LEFT, 35, 0));

        panelBotones.add(nombreCarHup);
    
        inicioButton.setContentAreaFilled(false);
        inicioButton.setFont(new Font("Aptos", Font.PLAIN, 18));
        inicioButton.setPreferredSize(new Dimension(100, 50));
        panelBotones.add(inicioButton);
    
        configuracionButton.setContentAreaFilled(false);
        configuracionButton.setFont(new Font("Aptos", Font.PLAIN, 18));
        configuracionButton.setPreferredSize(new Dimension(150, 50));
        panelBotones.add(configuracionButton);

        misReservas.setContentAreaFilled(false);
        misReservas.setFont(new Font("Aptos", Font.PLAIN, 18));
        panelBotones.add(misReservas);
        
        buscarButton.setContentAreaFilled(false);
        buscarButton.setFont(new Font("Aptos", Font.PLAIN, 18));
        panelBotones.add(buscarButton);
    
        loginButton.setContentAreaFilled(false);
        loginButton.setFont(new Font("Aptos", Font.PLAIN, 18));
        panelBotones.add(loginButton);

        nombreJLabel.setFont(new Font("Aptos", Font.BOLD, 30));
        nombreJLabel.setForeground(Color.WHITE);
        
        panelBotones.add(nombreJLabel);
        norte.setLayout(new BorderLayout());
        norte.add(panelBotones, BorderLayout.NORTH);

        JFXPanel jfxPanel = new JFXPanel();
        Platform.runLater(() -> {
            WebView webView = new WebView();
            webView.getEngine().load("https://www.google.com/maps");

            Scene scene = new Scene(webView);
            jfxPanel.setScene(scene);
            norte.add(jfxPanel,BorderLayout.CENTER);
        });
        
        getContentPane().add(norte);
    }
    
    
    public void eliminarPanelAnterior1(JPanel panelAnterior) {
        ventana3.remove(panelAnterior);
        ventana3.revalidate();
        ventana3.repaint();
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
    

    public void abrirTerceraVentana() {
        actualizarContenidoVentana();
        ventana3.setTitle("Buscar Y Sugerencias");
        ventana3.setModal(true);
        ventana3.setSize(600, 650);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int xPosition = screenSize.width - ventana3.getWidth();
        int yPosition = screenSize.height / 8;
        ventana3.setLocation(xPosition, yPosition);
    
        ventana3.setResizable(false);
        ventana3.setUndecorated(true);
        ventana3.setVisible(true);
    }
    

    JPanel buscador2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 0));
    private void actualizarContenidoVentana() {
        buscador2.removeAll();

        buscarField.setPreferredSize(new Dimension(200,25));
        buscarCButton.setPreferredSize(new Dimension(100,25));
        buscarCButton.setContentAreaFilled(false);
        resert.setContentAreaFilled(false);
        resert.setFont(new Font("Aptos", Font.PLAIN, 18));
        buscador2.add(atras2);
        buscador2.add(buscarField);
        buscador2.add(buscarCButton);
        buscador2.add(resert);
    
        buscador2.setBackground(Color.cyan);
        ventana3.add(buscador2, BorderLayout.NORTH);
    }


    public void buscar(String nombreConductor, ConfiguracionModel addUsuario) {
        sugerenciaI.removeAll();
        
        List<Usuario> listaUsuarios = addUsuario.getListaUsuarios();
        Usuario conductorEncontrado = null;
        
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(nombreConductor) && usuario.getEsConductor() == true) {
                conductorEncontrado = usuario;
                break;
            }
        }
        
        if (conductorEncontrado != null) {
            JPanelImage usuarioPanel = new JPanelImage("CarHup/Imagenes/Fondo1.jpg");
            usuarioPanel.setLayout(new GridLayout(1, 2));
    
            JPanelImage fotoPanel = new JPanelImage("CarHup/Imagenes/Fondo1.jpg");
            fotoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    
            JLabel fotoLabel = new JLabel();
            fotoPanel.add(fotoLabel);
    
            JPanel descripcionPanel = new JPanel();
            descripcionPanel.setOpaque(false);
            descripcionPanel.setLayout(new GridLayout(4, 1));
    
            Font fuenteEtiqueta = new Font("Times New Roman", Font.BOLD, 14);
            Color colorTexto = Color.WHITE;
    
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
    
            
            reservar.setForeground(Color.WHITE);
            reservar.setBackground(Color.BLACK);
    
            descripcionPanel.add(reservar);
            usuarioPanel.add(fotoPanel);
            usuarioPanel.add(descripcionPanel);
            usuarioPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
            sugerenciaI.add(usuarioPanel);
            

            ventana3.add(sugerenciaI, BorderLayout.CENTER);
        } else {
            // Mostrar mensaje de que no se encontró ningún conductor
            JLabel mensajeLabel = new JLabel("No se encontró ningún conductor con el nombre especificado.");
            sugerenciaI.add(mensajeLabel);
            ventana3.add(sugerenciaI, BorderLayout.CENTER);
        }
        
        ventana3.revalidate();
    }
    
    
    

    public void sugerencias(ConfiguracionModel addUsuario) {
        sugerenciaI.removeAll();
        Font fuenteEtiqueta = new Font("Times New Roman", Font.BOLD, 14);
        Color colorTexto = Color.WHITE;
    
        List<Usuario> listaUsuarios = addUsuario.getListaUsuarios();
    
        List<Usuario> conductoresDisponibles = new ArrayList<>();
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getEsConductor()) {
                conductoresDisponibles.add(usuario);
            }
        }
    

        if (!conductoresDisponibles.isEmpty()) {
            Collections.shuffle(conductoresDisponibles);
            

            int numSugerencias = Math.min(conductoresDisponibles.size(), 5); // Por ejemplo, mostraremos hasta 5 sugerencias
            for (int i = 0; i < numSugerencias; i++) {
                Usuario conductor = conductoresDisponibles.get(i);
                
                JPanelImage usuarioPanel = new JPanelImage("CarHup/Imagenes/Fondo1.jpg");
                usuarioPanel.setLayout(new GridLayout(1, 2));
    
                JPanelImage fotoPanel = new JPanelImage("CarHup/Imagenes/Fondo1.jpg");
                fotoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    
                JLabel fotoLabel = new JLabel();
                fotoPanel.add(fotoLabel);
    
                JPanel descripcionPanel = new JPanel();
                descripcionPanel.setOpaque(false);
                descripcionPanel.setLayout(new GridLayout(4, 1));
    
                JLabel nombreLabel = new JLabel("Nombre: " + conductor.getNombre());
                nombreLabel.setFont(fuenteEtiqueta);
                nombreLabel.setForeground(colorTexto);
                descripcionPanel.add(nombreLabel);
    
                JLabel fechaNacimientoLabel = new JLabel("Fecha de Nacimiento: " + conductor.getFechaNacimiento());
                fechaNacimientoLabel.setFont(fuenteEtiqueta);
                fechaNacimientoLabel.setForeground(colorTexto);
                descripcionPanel.add(fechaNacimientoLabel);
    
                JLabel correoLabel = new JLabel("Correo: " + conductor.getCorreo());
                correoLabel.setFont(fuenteEtiqueta);
                correoLabel.setForeground(colorTexto);
                descripcionPanel.add(correoLabel);
    
                
                reservar.setForeground(Color.WHITE);
                reservar.setBackground(Color.BLACK);
    
                descripcionPanel.add(reservar);
                usuarioPanel.add(fotoPanel);
                usuarioPanel.add(descripcionPanel);
                usuarioPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
                sugerenciaI.add(usuarioPanel);
                ventana3.add(sugerenciaI, BorderLayout.CENTER);
            }
        } else {
            JLabel mensajeLabel = new JLabel("No hay conductores disponibles para mostrar sugerencias.");
            sugerenciaI.add(mensajeLabel);
            ventana3.add(sugerenciaI, BorderLayout.CENTER);
        }
        ventana3.revalidate();
    }
    

    public JButton getLlamarButton() {
        return llamarButton;
    }
  
    public JTextField getBuscarField() {
        return buscarField;
    }


    public JButton getReservar() {
        return reservar;
    }


    public JButton getResert() {
        return resert;
    }



    public JPanel getPanelBotones() {
        return panelBotones;
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


    public JLabel getNombreJLabel() {
        return nombreJLabel;
    }

   

   public JDialog getVentana3() {
       return ventana3;
   }

   public JButton getMiInformacionButton() {
       return miInformacionButton;
   }

   public JPanel getNorte() {
       return norte;
   }

   public JButton getBuscarCButton() {
    return buscarCButton;
   }

  
   public BotonImagen getAtras2() {
       return atras2;
   }



    public JPanel getBuscador() {
        return buscador;
    }
   

    public JDialog getVentana2() {
        return ventana2;
    }


    public JButton getMisReservas() {
        return misReservas;
    }
}

