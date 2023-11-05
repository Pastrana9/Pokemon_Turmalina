package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerInicio {

	
	@FXML
    private AnchorPane inicioAnchorPane;
	
	@FXML
	private void ButtonJugar(ActionEvent event) {
		try {
	        // Obtener la ventana actual de pantallaInicio
	        Stage pantallaInicioStage = (Stage) inicioAnchorPane.getScene().getWindow();
	        pantallaInicioStage.close();
			
			// Cargar la ventana "Gameplay.fxml" desde el archivo FXML
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Gameplay.fxml"));
			Parent root = loader.load();

			// Crear una nueva escena
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

}
