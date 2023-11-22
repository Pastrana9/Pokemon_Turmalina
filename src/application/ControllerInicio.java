package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class ControllerInicio {

	
	@FXML
    private AnchorPane inicioAnchorPane;
	
	@FXML
	private void ButtonJugar(ActionEvent event) {
		try {
	        // Obtener la ventana actual de pantallaInicio
	        Stage pantallaInicioStage = (Stage) inicioAnchorPane.getScene().getWindow();
	        pantallaInicioStage.close();
			
			// Cargar la ventana "PantallaMapa.fxml" desde el archivo FXML
			FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaMapa.fxml"));
			Parent root = loader.load();
			ControllerMapa mapa = loader.getController();
			Scene scene = new Scene(root);

			// Configurar el escenario (ventana)
			Stage gameplayStage = new Stage();
			
			//gameplayStage.setFullScreen(true);

			gameplayStage.setTitle("Videojuego");
			gameplayStage.setScene(scene);

			// Mostrar la nueva ventana
			gameplayStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void ButtonSalir(ActionEvent event) {
		System.exit(0);
	}

}
