import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;
public class CarHupC extends JFrame{

    private ImageIcon logoVna;
    private JDialog ventana3;
    private JLabel nombreJLabel;
    private JButton btnSalir;
    private BotonImagen atras2;
    private JButton actualizar;
    private JPanelImage norte;
    private JButton miInformacionButton;
    private JButton modoOscuroButton;
    private JPanelImage config;
    private JButton inicioButton;
    private BotonImagen loginButton;
    private JButton configuracionButton;
    private JLabel nombreCarHup;
    private JButton acercaDe;
    private JPanelImage sugerenciaI;
    private JPanel panelBotones;
    private JButton misReservas;
    private int cont;
       
    public CarHupC(String nombre) {
        super(nombre);
        cont = 0;
        misReservas = new JButton("Mis Reservas");
        nombreJLabel = new JLabel("Usuario");
        ventana3 = new JDialog(this, "Sugerencias",true);
        sugerenciaI= new JPanelImage("CarHup/Imagenes/FondoPanel.jpg");
        atras2 = new BotonImagen("CarHup/Imagenes/Atras.png");
        norte = new JPanelImage("CarHup/Imagenes/FondoPanel.jpg");
        nombreCarHup = new JLabel("CARHUP");
        inicioButton = new JButton("Inicio");
        loginButton = new BotonImagen("CarHup/Imagenes/Cuenta.png");
        panelBotones = new JPanel();
        actualizar = new JButton("Actualizar");
        
        
        configuracionButton = new JButton("Configuración");
        modoOscuroButton = new JButton("Modo Oscuro");
        miInformacionButton = new JButton("Mi Información");
        logoVna = new ImageIcon("CarHup/Imagenes/Loficial.png");
        acercaDe = new JButton("Sugerencias");

        btnSalir = new JButton("Atras");
    
        // Buscar
    
        miInformacionButton = new JButton("Mi Información");
        config = new JPanelImage("CarHup/Imagenes/Fondo1.jpg");
        logoVna = new ImageIcon("CarHup/Imagenes/Loficial2.png");
        init();
    }



    public void iniciarSesion() {
        JFXPanel jfxPanel = new JFXPanel();
        Platform.runLater(() -> {
            WebView webView = new WebView();
            webView.getEngine().load("https://www.google.com/maps");
    
            Scene scene = new Scene(webView);
            jfxPanel.setScene(scene);
            norte.add(jfxPanel, BorderLayout.CENTER);
        });
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
        buscador2.add(atras2);
        actualizar.setContentAreaFilled(false);
        buscador2.add(actualizar);
        buscador2.setBackground(Color.cyan);
        ventana3.add(buscador2, BorderLayout.NORTH);
    }


    public void misReservaciones(ActionListener actionListener, ConfiguracionModel addU,String nombreConductor) {
        sugerenciaI.removeAll();
    
        for (Usuario usuario : addU.getListaUsuarios()) {
            if (usuario.getNombre().equals(nombreConductor)) {
                String[] reservas = usuario.getReservas();
                String[] usuariosAsignados = usuario.getUsuarioAsignado(); // Obtener el arreglo de nombres de usuario asignados
    
                JPanel bounds = new JPanel();
                bounds.setLayout(new GridLayout(reservas.length, 1));
    
                int index = 0;
                for (String reserva : reservas) {
                    if (reserva != null) {
                        JPanel reservaPanel = new JPanel(new BorderLayout());
                        JLabel labelReserva = new JLabel("Reservación: " + index);
                        JLabel labelDetalle = new JLabel(reserva);
    
                        // Agregar el nombre de usuario asignado
                        JLabel labelUsuarioAsignado = new JLabel("Usuario Asignado: " + usuariosAsignados[index]);
                        reservaPanel.add(labelUsuarioAsignado, BorderLayout.WEST);
    
                        JPanel botonesPanel = new JPanel(new GridLayout(2, 1));
                        JButton cancelarReservacion = new JButton("Cancelar");
                        JButton btnVer = new JButton("Ver");
    
                        botonesPanel.add(cancelarReservacion);
                        botonesPanel.add(btnVer);
    
                        int cor = index;
                        btnVer.addActionListener(e -> verReservaCompleta(addU, nombreConductor,cor));
                        cancelarReservacion.addActionListener(e -> eliminarReservacion(addU, nombreConductor, cor, usuariosAsignados[cor]));
                        reservaPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    
                        reservaPanel.add(labelReserva, BorderLayout.NORTH);
                        reservaPanel.add(labelDetalle, BorderLayout.CENTER);
                        reservaPanel.add(botonesPanel, BorderLayout.EAST);
    
                        reservaPanel.setBackground(Color.CYAN);
                        botonesPanel.setOpaque(false);
    
                        bounds.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
                        bounds.add(Box.createVerticalStrut(5));
                        bounds.add(reservaPanel);
                        bounds.setOpaque(false);
                        index++;
                    }
                }
                JPanel estructura = new JPanel(new BorderLayout());
                estructura.add(bounds, BorderLayout.CENTER);
                JLabel nombre = new JLabel("Reservas del Conductor");
                nombre.setFont(new Font("Aptos", Font.BOLD, 30));
                nombre.setForeground(Color.BLACK);
                estructura.add(nombre, BorderLayout.NORTH);
                estructura.add(bounds, BorderLayout.CENTER);
                sugerenciaI.add(estructura);
                ventana3.add(sugerenciaI, BorderLayout.CENTER);
                break;
            }
        }
    
        ventana3.revalidate();
    }




    public void verReservaCompleta(ConfiguracionModel addU, String nombre, int numero) {
        // Iterar sobre la lista de usuarios
        for (Usuario usuario : addU.getListaUsuarios()) {
            // Verificar si el nombre del usuario coincide
            if (usuario.getNombre().equals(nombre)) {
                String[] reservas = usuario.getReservas();
                // Verificar si el número de reserva es válido
                if (numero >= 0 && numero < reservas.length && reservas[numero] != null) {
                    // Crear el panel principal para la reserva completa
                    JPanel reservaPanel = new JPanel(new BorderLayout());
    
                    // Crear el panel para el título
                    JPanel tituloPanel = new JPanel();
                    JLabel tituloLabel = new JLabel("Reserva Completa");
                    tituloLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Aumentar el tamaño de la fuente
                    tituloPanel.add(tituloLabel);
                    reservaPanel.add(tituloPanel, BorderLayout.NORTH);
    
                    // Crear el panel para mostrar los detalles de la reserva
                    JPanel detallePanel = new JPanel(new GridLayout(2, 1));
                    JLabel labelReserva = new JLabel("Reservación: " + numero);
                    labelReserva.setFont(new Font("Arial", Font.PLAIN, 18)); // Aumentar el tamaño de la fuente
                    JLabel labelDetalle = new JLabel(reservas[numero]);
                    labelDetalle.setFont(new Font("Arial", Font.PLAIN, 14)); // Aumentar el tamaño de la fuente
                    detallePanel.add(labelReserva);
                    detallePanel.add(labelDetalle);
                    reservaPanel.add(detallePanel, BorderLayout.CENTER);
    
                    // Crear el panel para el botón de salir
                    JPanel botonPanel = new JPanel();
                    botonPanel.add(btnSalir);
                    btnSalir.setContentAreaFilled(false);
                    reservaPanel.add(botonPanel, BorderLayout.WEST);
    
                    // Limpiar el panel sugerenciaI y agregar el panel de la reserva completa
                    sugerenciaI.removeAll();
                    sugerenciaI.add(reservaPanel);
                    sugerenciaI.setBackground(Color.CYAN);
                    ventana3.revalidate(); // Revalidar el contenedor principal para mostrar los cambios
                    return; // Salir del método después de mostrar la reserva completa
                } else {
                    // Mostrar mensaje de error si el número de reserva no es válido
                    JOptionPane.showMessageDialog(null, "El número de reserva especificado no es válido.");
                    return; // Salir del método después de mostrar el mensaje de error
                }
            }
        }
        // Mostrar mensaje si no se encontró ningún usuario con el nombre especificado
        JOptionPane.showMessageDialog(null, "No se encontró ningún usuario con el nombre especificado.");
    }
    
    
    
    
    
    


    public void eliminarReservacion(ConfiguracionModel addU, String nombreUsuario, int numero, String nombreConductor) {
        List<Usuario> listaUsuarios = addU.getListaUsuarios();
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(nombreConductor)) {
                usuario.eliminarReserva(numero); // Elimina la reserva del conductor
                // No es necesario eliminar al usuario asignado del conductor si es solo para la reserva
                JOptionPane.showMessageDialog(null, "Reserva del conductor eliminada exitosamente.");
                return;
            }
        }
    
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                usuario.eliminarReserva(numero); // Elimina la reserva del usuario asignado
                JOptionPane.showMessageDialog(null, "Reserva del usuario eliminada exitosamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró ningún usuario con el nombre de usuario ni conductor especificado.");
    }
    
    





    public JPanel getPanelBotones() {
        return panelBotones;
    }


    public JButton getInicioButton() {
        return inicioButton;
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

  
   public JButton getActualizar() {
       return actualizar;
   }

   public BotonImagen getAtras2() {
       return atras2;
   }

    public JButton getMisReservas() {
        return misReservas;
    }
}

