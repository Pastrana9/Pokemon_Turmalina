package application;

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
import javafx.stage.StageStyle;
import javafx.animation.TranslateTransition;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controlador para la interfaz del mapa del juego.
 * Maneja eventos y acciones relacionadas con PantallaMapa.fxml.
 */

public class ControllerMapa implements Initializable {

	private static double Xusuario = 0;
	private static double Yusuario = 287.0;
	private TranslateTransition transition;
	private int distancia = 12;
	private double hitboxX = 30;
	private double hitboxY = 30;
	private double npcHitboxX = 10;
	private double npcHitboxY = 10;
	private double imagenX = 640;
	private double imagenY = 445;
	private ControllerLucha controllerLucha = new ControllerLucha();
	private ControllerPozo controllerPozo = new ControllerPozo();
	private ControllerEquipo controllerEquipo = new ControllerEquipo();
	private static Boolean winNpc1 = false;
	private static Boolean winNpc2 = false;
	private static Boolean winNpc3 = false;
	private static Equipo equipo;

	@FXML
	private AnchorPane MapaAnchorPane;

	@FXML
	private ImageView sprite;

	@FXML
	private Rectangle casa, casa2, casa3, casaGrande1, casaGrande2, casaGrande3, vallaRio, valla, arboles, arboles1,arboles2;

	/**
	 * Inicializa el controlador del mapa al cargar la pantalla correspondiente.
	 * Establece la posición inicial del sprite del jugador y configura la gestión de eventos de teclado.
	 * Si el equipo no está inicializado, crea un equipo predeterminado con seis Pokémon.
	 * Además, asigna este equipo a los controladores de equipo y de combate.
	 *
	 * @param location  La ubicación relativa al archivo FXML.
	 * @param resources Los recursos específicos de localización.
	 */
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		sprite.setLayoutX(Xusuario);
		sprite.setLayoutY(Yusuario);
		if (equipo == null) {
			Pokemon pokemon1 = new Blastoise();
			Pokemon pokemon2 = new Entei();
			Pokemon pokemon3 = new Dialga();
			Pokemon pokemon4 = new Charizard();
			Pokemon pokemon5 = new Bulbasaur();
			Pokemon pokemon6 = new Snorlax();
			equipo = new Equipo(pokemon1, pokemon2, pokemon3, pokemon4, pokemon5, pokemon6);
		}
		controllerEquipo.setEquipo(equipo);
		controllerLucha.setEquipo(equipo);

		transition = new TranslateTransition();
		MapaAnchorPane.setOnKeyPressed(this::handleKeyPress);
		MapaAnchorPane.setFocusTraversable(true);
		MapaAnchorPane.requestFocus();
	}
	
    /**
     * Establece el equipo para el controlador.
     *
     * @param equipo El equipo de Pokémon del jugador.
     */
	
	public void setEquipo(Equipo equipo) {
		ControllerMapa.equipo= equipo;
	}
	
	/**
	 * Abre una ventana de fxml
	 * 
	 * @param pantallafxml nombre de la ventana fxml que se quiere abrir
	 */
	
	public void abrirPantallaFxml(String pantallafxml) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(pantallafxml));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage pantalla = new Stage();
			pantalla.setTitle("Videojuego");
			pantalla.setScene(scene);
			pantalla.initStyle(StageStyle.UNDECORATED);//hace que no salga el panel de control en la ventana
			pantalla.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 *  Maneja el evento de iniciar un combate con el primer entrenador.
	 *  Además, pasa al controllerLucha el Pokémon rival
	 * 
	 * @param event El evento de acción que desencadena la función
	 */
	
	@FXML
	public void fight1(ActionEvent event) {
		Pokemon pokemonRival = new Gengar();
		winNpc1 = true;
		controllerLucha.setRival(pokemonRival);
		abrirPantallaFxml("PantallaLucha.fxml");
	}

	/**
	 *  Maneja el evento de iniciar un combate con el segundo entrenador.
	 *  Además, pasa al controllerLucha el Pokémon rival
	 * 
	 * @param event El evento de acción que desencadena la función
	 */
	
	@FXML
	public void fight2(ActionEvent event) {
		Pokemon pokemonRival = new Rapidash();
		winNpc2 = true;
		controllerLucha.setRival(pokemonRival);
		abrirPantallaFxml("PantallaLucha.fxml");
	}

	/**
	 * Maneja el evento de iniciar un combate con el tercer entrenador.
	 * Además, pasa al controllerLucha el Pokémon rival.
	 *
	 * @param event El evento de acción que desencadena la función.
	 */
	
	@FXML
	public void fight3(ActionEvent event) {
		Pokemon pokemonRival = new Mew();
		winNpc3 = true;
		controllerLucha.setRival(pokemonRival);
		abrirPantallaFxml("PantallaLucha.fxml");
	}

	/**
	 * Maneja el evento de seleccionar la opción "No Salida".
	 *
	 * @param event El evento de acción que desencadena la función.
	 */
	
	@FXML
	public void NoSalida(ActionEvent event) {
		abrirPantallaFxml("VentanaNoSalida.fxml");
	}

    /**
     * Abre la pantalla de ajustes.
     *
     * @param event El evento de acción que desencadena la función.
     */
	
	@FXML
	public void Ajustes(ActionEvent event) {
		abrirPantallaFxml("PantallaAjustes.fxml");
	}

    /**
     * Abre la pantalla del equipo.
     *
     * @param event El evento de acción que desencadena la función.
     */
	
	@FXML
	public void Equipo(ActionEvent event) {
		abrirPantallaFxml("PantallaEquipo.fxml");
	}

    /**
     * Abre la pantalla de información.
     *
     * @param event El evento de acción que desencadena la función.
     */
	
	@FXML
	public void Informacion(ActionEvent event) {
		abrirPantallaFxml("PantallaInformacion.fxml");
	}

	/**
	 * Maneja el evento de seleccionar la opción "Pozo".
	 * Abre la pantalla del pozo, transfiriendo el equipo actual al controlador del pozo.
	 *
	 * @param event El evento de acción que desencadena la función.
	 */
	
	@FXML
	public void Pozo(ActionEvent event) {
		try {
			Equipo equipo = controllerLucha.getEquipo();
			controllerPozo.setEquipo(equipo);			
			
			Stage pantallaMapa = (Stage) MapaAnchorPane.getScene().getWindow();
			pantallaMapa.close();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaPozo.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage pozo = new Stage();
			pozo.setTitle("Videojuego");
			pozo.setScene(scene);
			pozo.initStyle(StageStyle.UNDECORATED);//hace que no salga el panel de control en la ventana
			pozo.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Maneja el evento de presionar una tecla para mover al jugador en el mapa.
	 * Calcula la nueva posición del jugador según la tecla presionada y verifica las colisiones.
	 * Si no hay colisiones, actualiza la posición del sprite del jugador.
	 *
	 * @param event El evento de tecla presionada.
	 */
	
	public void handleKeyPress(KeyEvent event) {

		double newX = Xusuario;
		double newY = Yusuario;

		if (event.getCode() == KeyCode.W) {
			newY -= distancia;
		} else if (event.getCode() == KeyCode.S) {
			newY += distancia;
		} else if (event.getCode() == KeyCode.A) {
			newX -= distancia;
		} else if (event.getCode() == KeyCode.D) {
			newX += distancia;
		}

		if (colisionesMapa(newX, newY) || newX < 0 || newY < 0 || newX > imagenX || newY > imagenY)
			return;

		if (colisionConNpc1(newX, newY))
		{
			if(!winNpc1)
				fight1(null);
			else 
				return;
		}
			
		if (colisionConNpc2(newX, newY))
		{
			if(!winNpc2)
				fight2(null);
			else 
				return;
		}
		if (colisionConNpc3(newX, newY))
		{
			if(!winNpc3)
				fight3(null);
			else 
				return;
		}
		if (colisionPozo(newX, newY))
			Pozo(null);
		if (colisionNoSalida(newX, newY))
			NoSalida(null);

		moveSprite(newX, newY);
	}

    /**
     * Mueve al jugador a la nueva posición especificada.
     *
     * @param newX La nueva posición X del jugador.
     * @param newY La nueva posición Y del jugador.
     */
	
	public void moveSprite(double newX, double newY) {
		transition.setToX(newX - Xusuario);
		transition.setToY(newY - Yusuario);
		transition.play();

		Xusuario = newX;
		Yusuario = newY;

		sprite.setLayoutX(newX);
		sprite.setLayoutY(newY);
	}
	
	/**
	 * Comprueba si el jugador está en la hitbox del primer entrendor Pokemon
	 * 
     * @param newX La nueva posición X del jugador.
     * @param newY La nueva posición Y del jugador.
	 * @return Si el usuario se ha encontrado o no el primer entrenador
	 */

	public boolean colisionConNpc1(double newX, double newY) {

		double npcX = 142.0;
		double npcY = 248.0;

		return (newX < npcX + npcHitboxX && newX + hitboxX > npcX && newY < npcY + npcHitboxY && newY + hitboxY > npcY);
	}

	/**
	 * Comprueba si el jugador está en la hitbox del segundo entrendor Pokemon
	 * 
     * @param newX La nueva posición X del jugador.
     * @param newY La nueva posición Y del jugador.
	 * @return Si el usuario se ha encontrado o no el segundo entrenador
	 */
	
	public boolean colisionConNpc2(double newX, double newY) {

		double npcX = 591.0;
		double npcY = 338.0;

		return (newX < npcX + npcHitboxX && newX + hitboxX > npcX && newY < npcY + npcHitboxY && newY + hitboxY > npcY);
	}

	/**
	 * Comprueba si el jugador está en la hitbox del tercer entrendor Pokemon
	 * 
     * @param newX La nueva posición X del jugador.
     * @param newY La nueva posición Y del jugador.
	 * @return Si el usuario se ha encontrado o no el tercer entrenador
	 */
	
	public boolean colisionConNpc3(double newX, double newY) {

		double npcX = 258.0;
		double npcY = 93.0;

		return (newX < npcX + npcHitboxX && newX + hitboxX > npcX && newY < npcY + npcHitboxY && newY + hitboxY > npcY);
	}
	
	/**
	 * Comprueba si el jugador está en la hitbox del pozo
	 * 
     * @param newX La nueva posición X del jugador.
     * @param newY La nueva posición Y del jugador.
	 * @return Si el usuario se ha encontrado o no el pozo
	 */

	public boolean colisionPozo(double newX, double newY) {

		double npcX = 585.0;
		double npcY = 98.0;

		return (newX < npcX + npcHitboxX && newX + hitboxX > npcX && newY < npcY + npcHitboxY && newY + hitboxY > npcY);
	}

	/**
	 * Comprueba si el jugador está en la hitbox del la salida del pueblo
	 * 
     * @param newX La nueva posición X del jugador.
     * @param newY La nueva posición Y del jugador.
	 * @return Si el usuario se ha encontrado o no la salida del pueblo
	 */
	
	public boolean colisionNoSalida(double newX, double newY) {

		double npcX = 454.0;
		double npcY = 7.0;

		return (newX < npcX + npcHitboxX && newX + hitboxX > npcX && newY < npcY + npcHitboxY && newY + hitboxY > npcY);
	}

	/**
	 * Comprueba que el jugador no se pueda subir a los edificios 
	 * 
     * @param newX La nueva posición X del jugador.
     * @param newY La nueva posición Y del jugador.
	 * @return Si el usuario se ha encontrado o no con un edificio
	 */
	
	public boolean colisionesMapa(double newX, double newY) {
		Rectangle[] obstaculos = { casa, casa2, casa3, casaGrande1, casaGrande2, casaGrande3, vallaRio, valla, arboles,arboles1, arboles2 };

		for (Rectangle aux : obstaculos) {
			if (aux.getBoundsInParent().contains(newX, newY)) {
				return true;
			}
		}
		return false;
	}

    /**
     * Configura la posición inicial del jugador en el mapa.
     *
     * @param Xusuario La posición X inicial del jugador.
     * @param Yusuario La posición Y inicial del jugador.
     */
	
	public void setPosicionJugador(double Xusuario, double Yusuario) {
		ControllerMapa.Xusuario = Xusuario;
		ControllerMapa.Yusuario = Yusuario;
	}
}
