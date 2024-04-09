import javax.swing.*;
import java.awt.*;

public class ConductorInter extends JFrame {
    public ConductorInter() {
        setTitle("Nueva Interfaz");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo esta ventana al presionar el botón de cerrar
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1)); // Dos filas, una para cada botón

        JButton solicitudesButton = new JButton("Solicitudes");
        JButton perfilButton = new JButton("Perfil");

        panel.add(solicitudesButton);
        panel.add(perfilButton);

        add(panel);

        solicitudesButton.addActionListener(e -> {
            // Código para manejar la acción del botón de solicitudes
            JOptionPane.showMessageDialog(this, "Botón de Solicitudes presionado");
        });

        perfilButton.addActionListener(e -> {
            // Código para manejar la acción del botón de perfil
            JOptionPane.showMessageDialog(this, "Botón de Perfil presionado");
        });
    }
}
