package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Controlador para la interfaz de ajustes.
 * Maneja eventos y acciones relacionadas con PantallaAjustes.fxml.
 */


public class ControllerAjustes {

    @FXML
    private AnchorPane ajustesAnchorPane;

    /**
     * Maneja el evento del botón "Volver", cerrando la ventana actual de ControllerAjustes.
     *
     * @param event El evento de acción generado por el botón "Volver", cierra ControllerAjustes.
     */
    @FXML
    public void ButtonVolver(ActionEvent event) {
        Stage pantallaAjustes = (Stage) ajustesAnchorPane.getScene().getWindow();
        pantallaAjustes.close();
    }

    /**
     * Maneja el evento del botón "Salir", cerrando la aplicación.
     *
     * @param event El evento de acción generado por el botón "Salir", termina la ejecución de la aplicación.
     */
    @FXML
    public void ButtonSalir(ActionEvent event) {
        System.exit(0);
    }
}

