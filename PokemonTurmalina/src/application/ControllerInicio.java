package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 * Controlador para la interfaz del inicio.
 * Maneja eventos y acciones relacionadas con PantallaInicio.fxml.
 */

public class ControllerInicio {

	@FXML
    private AnchorPane inicioAnchorPane;
	
    /**
     * Maneja el evento del botón "Jugar". Ejecuta la la interfaz gráfica PantallaMapa.fxml.
     *
     * @param event El evento de acción del botón.
     */
	
	@FXML
	public void ButtonJugar(ActionEvent event) {
		try {
	       
	        Stage pantallaInicioStage = (Stage) inicioAnchorPane.getScene().getWindow();
	        pantallaInicioStage.close();
			
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaMapa.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			
			Stage gameplayStage = new Stage();
			
			//gameplayStage.setFullScreen(true);

			gameplayStage.setTitle("Videojuego");
			gameplayStage.setScene(scene);
			gameplayStage.initStyle(StageStyle.UNDECORATED);//hace que no salga el panel de control en la ventana

			
			gameplayStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    /**
     * Maneja el evento del botón "Salir", cerrando la aplicación.
     *
     * @param event El evento de acción del botón.
     */
	
	@FXML
	public void ButtonSalir(ActionEvent event) {
		System.exit(0);
	}

}
