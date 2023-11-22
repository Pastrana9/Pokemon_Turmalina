package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerAjustes {

	
	@FXML
    private AnchorPane ajustesAnchorPane;


    @FXML
    private void ButtonVolver(ActionEvent event) {
        Stage pantallaAjustes = (Stage) ajustesAnchorPane.getScene().getWindow();
        pantallaAjustes.close();
    }

    @FXML
    private void ButtonTitulo(ActionEvent event)
    {
        try {

            Stage pantallaAjustes = (Stage) ajustesAnchorPane.getScene().getWindow();
            pantallaAjustes.close();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaInicio.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            Stage Inicio = new Stage();

            Inicio.setTitle("Videojuego");
            Inicio.setScene(scene);

            Inicio.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
