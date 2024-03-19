import javax.swing.*;
import java.awt.*;

public class JPanelImage extends JPanel {
    private Image imagen;

    public JPanelImage(String rutaImagen) {
        ImageIcon icono = new ImageIcon(rutaImagen);
        imagen = icono.getImage();
        setLayout(new BorderLayout());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }

}
