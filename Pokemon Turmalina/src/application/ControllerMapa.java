package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMapa implements Initializable {

	
    @FXML
    private AnchorPane gameplayAnchorPane;
    
    @FXML
    private ImageView sprite;
    
    @FXML
    private void fight1(ActionEvent event)
    {
    	try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaLucha.fxml"));
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Agregar un manejador de eventos al AnchorPane
        gameplayAnchorPane.setOnMouseClicked(this::handleAnchorPaneClick);
    }

    // Manejador de eventos para el clic en el AnchorPane
    private void handleAnchorPaneClick(MouseEvent event) {
    	
    	double x = event.getX();
    	double y = event.getY();
    	
    	sprite.setLayoutX(x-22);//los valores enteros son para que la imagen se coloque en el centro del raton
    	sprite.setLayoutY(y-30);

    }
}
