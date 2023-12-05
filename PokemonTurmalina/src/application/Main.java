package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Main es la clase principal que inicia el programa.
 * @author Manuel Pastrana Blázquezd
 * @author Álvaro Pereda Sánchez
 */

public class Main extends Application {

    /**
     * Configura la interfaz gráfica de usuario.
     *
     * @param pantallaInicio Objeto Stage que representa la ventana principal de la aplicación.
     */

    @Override
    public void start(Stage pantallaInicio) throws Exception {
        // Cargar la interfaz de usuario desde el archivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaInicio.fxml"));
        Parent root = loader.load();

        // Configurar la ventana principal
        pantallaInicio.setTitle("Pantalla de Inicio");
        pantallaInicio.setScene(new Scene(root, 600, 600));
        pantallaInicio.initStyle(StageStyle.UNDECORATED);//hace que no salga el panel de control en la ventana
        pantallaInicio.show();

        //music();
    }

    /**
     * El método principal que inicia la aplicación.
    */
    public static void main(String[] args) {
        // Lanzar la aplicación JavaFX
        launch(args);
    }

    /**
     * reproductor de musica ambiental
     */

    // MediaPlayer mediaPlayer;
    //public void music() {
    //  String s = "home.mp3";
    //  Media h = new Media(Paths.get(s).toUri().toString());
    //  mediaPlayer = new MediaPlayer(h);
    //  mediaPlayer.play();
    // }
}





