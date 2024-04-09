import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarHupU extends JFrame{

    private JButton misReservas;
    private JButton reservar;
    private JPanel panelBotones;
    private ImageIcon logoVna;
    private JDialog ventana3;
    private JLabel nombreJLabel;
    private BotonImagen atras2;
    private JButton cancelarReservacion;
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
    private String nombreConductorReserva;

    private JPanel panelReserva;
    private JTextField txtTelefono;
    private JTextField txtNombre;
    private JComboBox<String> cbxPasajeros;
    private JComboBox<String> cbxMonedas25;
    private JComboBox<String> cbxHoraMinutosAMPM;
    private JComboBox<String> cbxDestino;
    private JComboBox<String> cbxLugarPasajero;
    private JButton btnReservar;
    private JButton btnCancelar;
    private JButton btnSalir;
    private JLabel lblTicket;
    private JButton btnVer;
       
    public CarHupU(String nombre) {
        super(nombre);
        buscador = new JPanel();
        inicioP = new JPanel();
        inicioP.setOpaque(false);
        misReservas = new JButton("Mis Reservas");
        reservar = new JButton("Reservar");
        cancelarReservacion = new JButton("Cancelar");
        nombreJLabel = new JLabel("Usuario");
        ventana3 = new JDialog(this, "Sugerencias",true);
        sugerenciaI= new JPanelImage("CarHup/Imagenes/FondoPanel.jpg");
        atras2 = new BotonImagen("CarHup/Imagenes/Atras.png");
        resert = new JButton("actualizar");
        norte = new JPanelImage("CarHup/Imagenes/FondoPanel.jpg");
        nombreCarHup = new JLabel("CARHUP");
        inicioButton = new JButton("Inicio");
        btnVer = new JButton("Ver");
        nombreConductorReserva = "";
        buscarButton = new BotonImagen("CarHup/Imagenes/Buscar.png");
        loginButton = new BotonImagen("CarHup/Imagenes/Cuenta.png");
        panelBotones = new JPanel();
        lblTicket = new JLabel();


        btnCancelar = new JButton("Cancelar");
        btnReservar = new JButton("Reservar");

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
        config = new JPanelImage("CarHup/Imagenes/Fondo1..jpg");
        logoVna = new ImageIcon("CarHup/Imagenes/Loficial2.png");
        btnSalir = new JButton("Atras");
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
        
        nombreConductorReserva = "";
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
            
            nombreConductorReserva = conductorEncontrado.getNombre();

     
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
            JLabel mensajeLabel = new JLabel("No se encontró ningún conductor con el nombre especificado.");
            sugerenciaI.add(mensajeLabel);
            ventana3.add(sugerenciaI, BorderLayout.CENTER);
        }
        
        ventana3.revalidate();
    }
    
    
    

    public void sugerencias(ConfiguracionModel addUsuario) {
        sugerenciaI.removeAll();
        nombreConductorReserva = "";
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
    
             
           Usuario conductor = conductoresDisponibles.get(0);
           nombreConductorReserva = conductor.getNombre();
            
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
        } else {
            JLabel mensajeLabel = new JLabel("No hay conductores disponibles para mostrar sugerencias.");
            sugerenciaI.add(mensajeLabel);
            ventana3.add(sugerenciaI, BorderLayout.CENTER);
        }
        ventana3.revalidate();
    }
    



    public void reservar() {
        sugerenciaI.removeAll();  
        JPanelImage panelReserva = new JPanelImage("CarHup/Imagenes/FondoC.jpg");
        panelReserva.setLayout(new GridLayout(13, 2, 10, 10));
        
        // Configurar color blanco para todos los labels
        Color colorBlanco = Color.WHITE;
    
        JLabel lblTelefono = new JLabel("Número Telefónico:");
        lblTelefono.setForeground(colorBlanco);
        txtTelefono = new JTextField();
        
        JLabel lblNombre = new JLabel("Nombre Completo:");
        lblNombre.setForeground(colorBlanco);
        txtNombre = new JTextField("");
        
        JLabel lblPasajeros = new JLabel("Cantidad de Pasajeros:");
        lblPasajeros.setForeground(colorBlanco);
        String[] pasajeros = {"1", "2", "3", "4", "5", "6", "7"};
        cbxPasajeros = new JComboBox<>(pasajeros);
        
        JLabel lblMonedas25 = new JLabel("Cantidad de Monedas de 25 Pesos:");
        lblMonedas25.setForeground(colorBlanco);
        String[] monedas25 = {"0", "25", "50", "75", "100", "125", "150", "175", "200", "225", "250", "275", "300", "325", "350", "375", "400", "425", "450", "475", "500", "525", "550", "575", "600", "625", "650", "675", "700", "725", "750", "775", "800", "825", "850", "875", "900", "925", "950", "975", "1000"};
        cbxMonedas25 = new JComboBox<>(monedas25);
        
        JLabel lblHoraReserva = new JLabel("Hora de la Reserva:");
        lblHoraReserva.setForeground(colorBlanco);
        String[] horasMinutosAMPM = {"8:00 AM", "8:15 AM", "8:30 AM", "8:45 AM", "9:00 AM", "9:15 AM", "9:30 AM", "9:45 AM", "10:00 AM", "10:15 AM", "10:30 AM", "10:45 AM", "11:00 AM", "11:15 AM", "11:30 AM", "11:45 AM", "12:00 PM", "12:15 PM", "12:30 PM", "12:45 PM", "1:00 PM", "1:15 PM", "1:30 PM", "1:45 PM", "2:00 PM", "2:15 PM", "2:30 PM", "2:45 PM", "3:00 PM", "3:15 PM", "3:30 PM", "3:45 PM", "4:00 PM", "4:15 PM", "4:30 PM", "4:45 PM", "5:00 PM", "5:15 PM", "5:30 PM", "5:45 PM", "6:00 PM", "6:15 PM", "6:30 PM", "6:45 PM", "7:00 PM", "7:15 PM", "7:30 PM", "7:45 PM", "8:00 PM", "8:15 PM", "8:30 PM"};
        cbxHoraMinutosAMPM = new JComboBox<>(horasMinutosAMPM);
        
        JLabel lblDestino = new JLabel("Destino (ubicacion google Maps):");
        lblDestino.setForeground(colorBlanco);
        String[] destinos = {"Halacho", "Calkini", "Centro Becal", "Cbtis", "Tec Itescam", "Otro"};
        cbxDestino = new JComboBox<>(destinos);
        cbxDestino.setEditable(true); // Permitir edición del combo box
        
        JLabel lblLugarPasajero = new JLabel("Donde Me encuentro (ubicacion de google Maps):");
        lblLugarPasajero.setForeground(colorBlanco);
        String[] lugares = {"Halacho", "Calkini", "Centro Becal", "Cbtis", "Tec Itescam", "Otro"};
        cbxLugarPasajero = new JComboBox<>(lugares);
        cbxLugarPasajero.setEditable(true);
        
        JLabel lblPrecio = new JLabel("Precio por Total: 0");
        lblPrecio.setForeground(colorBlanco);
    
        btnReservar.setOpaque(false);
        btnReservar.setContentAreaFilled(false);
        btnReservar.setBorderPainted(false);
        btnReservar.setForeground(colorBlanco);
    
        btnCancelar.setOpaque(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setForeground(colorBlanco);

        panelReserva.add(lblTelefono);
        panelReserva.add(txtTelefono);
        panelReserva.add(lblNombre);
        panelReserva.add(txtNombre);
        panelReserva.add(lblPasajeros);
        panelReserva.add(cbxPasajeros);
        panelReserva.add(lblMonedas25);
        panelReserva.add(cbxMonedas25);
        panelReserva.add(lblHoraReserva);
        panelReserva.add(cbxHoraMinutosAMPM);
        panelReserva.add(lblDestino);
        panelReserva.add(cbxDestino);
        panelReserva.add(lblLugarPasajero);
        panelReserva.add(cbxLugarPasajero);
        panelReserva.add(btnReservar);
        panelReserva.add(btnCancelar);
        panelReserva.add(lblPrecio);
        panelReserva.add(lblTicket);
    
        sugerenciaI.add(panelReserva);
        ventana3.add(sugerenciaI);
    
        ventana3.revalidate();
    }
    
    

    public String ticketReserva() {
       String ticket = "<html>Ticket de Reserva:<br>" +
                "Nombre: " + txtNombre.getText().trim() + "<br>" +
                "Teléfono: " + txtTelefono.getText().trim() + "<br>" +
                "Pasajeros: " + cbxPasajeros.getSelectedItem() + "<br>" +
                "Monedas de 25 Pesos: " + cbxMonedas25.getSelectedItem() + "<br>" +
                "Hora Reserva: " + cbxHoraMinutosAMPM.getSelectedItem() + "<br>" +
                "Destino: " + cbxDestino.getSelectedItem() + "<br>" +
                "Lugar Pasajero: " + cbxLugarPasajero.getSelectedItem() + "<br>" +
                "Precio: $175</html>";
                return ticket;
    }


    public void misReservaciones(ActionListener actionListener, ConfiguracionModel addU, String nombreUsuario) {
        sugerenciaI.removeAll();
        
        for (Usuario usuario : addU.getListaUsuarios()) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                JPanel bounds = new JPanel();
                bounds.setLayout(new GridLayout(usuario.getReservas().length, 1)); // GridLayout para organizar las reservas verticalmente
    
                int index = 0;
                for (String reserva : usuario.getReservas()) {
                    if (reserva != null) { // Verificar si la reserva no es nula
                        JPanel reservaPanel = new JPanel(new BorderLayout());
                        JLabel labelReserva = new JLabel("Reservación: " + index);
                        JLabel labelDetalle = new JLabel(reserva);
    
                        JPanel botonesPanel = new JPanel(new GridLayout(2, 1));
                        JButton cancelarReservacion = new JButton("Cancelar");
                        JButton btnVer = new JButton("Ver");
    
                        botonesPanel.add(cancelarReservacion);
                        botonesPanel.add(btnVer);
    
                        int cor = index;
                        btnVer.addActionListener(e -> verReservaCompleta(addU, nombreUsuario, cor));
                        cancelarReservacion.addActionListener(e -> eliminarReservacion(addU, nombreUsuario, cor, nombreConductorReserva));
                        reservaPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0)); // Espacio alrededor de la reserva
    
                        reservaPanel.add(labelReserva, BorderLayout.NORTH);
                        reservaPanel.add(labelDetalle, BorderLayout.CENTER);
                        reservaPanel.add(botonesPanel, BorderLayout.EAST); // Agregar el panel de botones a la derecha
    
                        // Después de inicializar el reservaPanel
                        reservaPanel.setBackground(Color.CYAN);
                        botonesPanel.setOpaque(false); // Hacer el panel de botones transparente
    
                        bounds.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
                        bounds.add(Box.createVerticalStrut(5));
                        bounds.add(reservaPanel);
                        bounds.setOpaque(false);
                        index++;
                    }
                }
                JPanel estructura = new JPanel(new BorderLayout());
                estructura.add(bounds, BorderLayout.CENTER);
                JLabel nombre = new JLabel("Mis Reservas");
                nombre.setFont(new Font("Aptos", Font.BOLD, 30));
                nombre.setForeground(Color.BLACK);
                estructura.add(nombre, BorderLayout.NORTH);
                estructura.add(bounds, BorderLayout.CENTER);
                sugerenciaI.add(estructura); // Agregar el panel bounds al panel sugerenciaI
                ventana3.add(sugerenciaI); // Agregar sugerenciaI al contenedor principal
                break;
            }
        }
    
        ventana3.revalidate(); // Revalidar el contenedor principal
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


   public JButton getBtnReservar() {
       return btnReservar;
   }


   public JButton getBtnCancelar() {
       return btnCancelar;
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


    public JPanel getPanelReserva() {
        return panelReserva;
    }

    public String getNombreConductorReserva() {
        return nombreConductorReserva;
    }


    public JButton getBtnSalir() {
        return btnSalir;
    }
}

