package CarHup;

import java.awt.event.*;

import javafx.event.ActionEvent;

public class CarHupControlle implements ActionListener {
    CarHup ventana;
    ConfiguracionModel add;
    
    public CarHupControlle(){
      ventana = new CarHup("Car HUP");
      add = new ConfiguracionModel();

    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
