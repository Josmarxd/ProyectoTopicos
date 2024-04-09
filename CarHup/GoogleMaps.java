import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;

public class GoogleMaps extends JPanel {

    public GoogleMaps() {
        initMapa();
    }

    private void initMapa() {
        JFXPanel jfxPanel = new JFXPanel();
        Platform.runLater(() -> {
            WebView webView = new WebView();
            webView.getEngine().load("https://www.google.com/maps");

            Scene scene = new Scene(webView);
            jfxPanel.setScene(scene);
            add(jfxPanel, BorderLayout.CENTER);
        });
    }
}

