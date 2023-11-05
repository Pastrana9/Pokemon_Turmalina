package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage pantallaInicio) throws Exception {
    	 FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaInicio.fxml"));
         Parent root = loader.load();
         pantallaInicio.setTitle("Pantalla de Inicio");
         pantallaInicio.setScene(new Scene(root, 600, 500));
         pantallaInicio.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}






