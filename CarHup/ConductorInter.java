import javax.swing.*;
import java.awt.*;

public class ConductorInter extends JFrame {
    private JPanel panel;

    public ConductorInter() {
        setTitle("Nueva Interfaz");
        setSize(800, 600); // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana

        // Crear un panel para colocar componentes
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        add(panel);

        // Agregar componentes a tu nueva interfaz
        JLabel label = new JLabel("¡Esta es tu nueva interfaz!");
        panel.add(label, BorderLayout.CENTER);

        // Mostrar la interfaz
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crear una instancia de la nueva interfaz en el método main para probarla
        SwingUtilities.invokeLater(() -> new ConductorInter());
    }
}
