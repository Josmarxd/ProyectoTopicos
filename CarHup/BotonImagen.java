import javax.swing.*;
import java.awt.*;

public class BotonImagen extends JButton {

    private ImageIcon imagenIcono;

    public BotonImagen(ImageIcon imagenIcono) {
        this.imagenIcono = imagenIcono;
        setPreferredSize(new Dimension(imagenIcono.getIconWidth()/7, imagenIcono.getIconHeight()/7)); // Tamaño del botón según el tamaño de la imagen
        setContentAreaFilled(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagenIcono.getImage(), 0, 0, getWidth(), getHeight(), this);
    }

    @Override
    protected void paintBorder(Graphics g) {
    }
}

