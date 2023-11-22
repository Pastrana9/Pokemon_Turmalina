package application;


import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerPozo {

    @FXML
    private AnchorPane PozoAnchorPane;
    
    @FXML
    private ImageView sprite;


    @FXML
    private void Ajustes(ActionEvent event)
    {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaAjustes.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena
            Scene scene = new Scene(root);

            // Configurar el escenario (ventana)
            Stage Combate1 = new Stage();
            //Combate1.close();

            //gameplayStage.setFullScreen(true);

            Combate1.setTitle("Videojuego");
            Combate1.setScene(scene);

            // Mostrar la nueva ventana
            Combate1.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void Equipo(ActionEvent event)
    {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaEquipo.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena
            Scene scene = new Scene(root);

            // Configurar el escenario (ventana)
            Stage Combate1 = new Stage();
            

            //gameplayStage.setFullScreen(true);

            Combate1.setTitle("Videojuego");
            Combate1.setScene(scene);

            // Mostrar la nueva ventana
            Combate1.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void Informacion(ActionEvent event)
    {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaInformacion.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena
            Scene scene = new Scene(root);

            // Configurar el escenario (ventana)
            Stage Combate1 = new Stage();
            //Combate1.close();

            //gameplayStage.setFullScreen(true);

            Combate1.setTitle("Videojuego");
            Combate1.setScene(scene);

            // Mostrar la nueva ventana
            Combate1.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

