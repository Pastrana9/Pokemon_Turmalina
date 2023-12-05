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
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controlador para la interfaz del mapa del pozo.
 * Maneja eventos y acciones relacionadas con PantallaPozo.fxml.
 */

public class ControllerPozo implements Initializable{
	
	private double Xusuario = 219.0;
	private double Yusuario = 55.0;
	private TranslateTransition transition;
	private int distancia = 12;
	private double hitboxX = 30; 
	private double hitboxY = 30;
	private double imagenX = 90;
	private double imagenY = 10;
	private double imagenXX = 385;
	private double imagenYY = 340;
	private ControllerMapa posicion;
	private ControllerLucha controllerLucha = new ControllerLucha();
	private ControllerEquipo controllerEquipo = new ControllerEquipo();
	private static Boolean winBoss = false;
	private static Equipo equipo;
	
    @FXML
    private AnchorPane PozoAnchorPane;
    
    @FXML
    private ImageView sprite;
    
    
    /**
     * Inicializa el controlador del pozo.
     * Configura la transición y la gestión de eventos de teclado.
     * Además, carga el controlador del mapa y los controladores de combate y equipo.
     *
     * @param location  La ubicación relativa al archivo FXML.
     * @param resources Los recursos específicos de localización.
     */
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		transition = new TranslateTransition();
		PozoAnchorPane.setOnKeyPressed(this::handleKeyPress);
		PozoAnchorPane.setFocusTraversable(true);
		PozoAnchorPane.requestFocus();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaMapa.fxml"));
		try {
			Parent root = loader.load();
	        posicion = loader.getController();
		} catch (IOException e) {
			e.printStackTrace();
		}
		controllerLucha.setEquipo(equipo);
		controllerEquipo.setEquipo(equipo);	
	}
	
    /**
     * Establece el equipo actual en el controlador del pozo.
     *
     * @param equipo El equipo a establecer.
     */
	
	public void setEquipo(Equipo equipo) {
		ControllerPozo.equipo = equipo;
	}
	
    /**
     * Maneja los eventos de teclado para mover al jugador en la pantalla del pozo.
     * Verifica colisiones con la escalera y el jefe (boss) del pozo.
     *
     * @param event El evento de teclado que desencadena la función.
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
		
		if (newX < imagenX || newY < imagenY || newX > imagenXX || newY > imagenYY)
			return;
		if(colisionEscalera(newX,newY))
			superficie(null);
		if(colisionBoss(newX,newY))
			if(!winBoss)
				fightBoss(null);
			else
				return;
		
			
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
	 * Comprueba si el jugador está en la hitbox de las escaleras
	 * 
     * @param newX La nueva posición X del jugador.
     * @param newY La nueva posición Y del jugador.
	 * @return Si el usuario se ha encontrado o no con las escaleras
	 */
	
	public boolean colisionEscalera(double newX, double newY){
		double npcX = 236.0;
		double npcY = 46.0;

		return (newX < npcX  && newX + hitboxX > npcX && newY < npcY && newY + hitboxY > npcY);
	}
	
	/**
	 * Comprueba si el jugador está en la hitbox del boss
	 * 
     * @param newX La nueva posición X del jugador.
     * @param newY La nueva posición Y del jugador.
	 * @return Si el usuario se ha encontrado o no con el boss
	 */
	
	private boolean colisionBoss(double newX, double newY) {

		double npcX = 222.0;
		double npcY = 195.0;
	    double bossHitboxX = 60; 
	    double bossHitboxY = 60; 
	    
	    return (newX < npcX + bossHitboxX && newX + hitboxX > npcX && newY < npcY + bossHitboxY && newY + hitboxY > npcY);
	}
	
    /**
     * Mueve al jugador a la superficie, cerrando la pantalla del pozo y abriendo la del mapa.
     *
     * @param event El evento de acción que desencadena la función.
     */
	
	@FXML
	public void superficie(ActionEvent event) {
		try {
			
			Stage pantallaPozo = (Stage) PozoAnchorPane.getScene().getWindow();
			pantallaPozo.close();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaMapa.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage mapa = new Stage();
			posicion.setPosicionJugador(550.0, 95.0);
			posicion.setEquipo(equipo);
			mapa.setTitle("Videojuego");
			mapa.setScene(scene);
			mapa.initStyle(StageStyle.UNDECORATED);//hace que no salga el panel de control en la ventana
			mapa.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
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
     * Abre la pantalla de combate contra el jefe (boss) del pozo.
     * Además, marca al jefe como derrotado para evitar combates repetidos.
     *
     * @param event El evento de acción que desencadena la función.
     */
	
	@FXML
	public void fightBoss(ActionEvent event) {
		Pokemon pokemonRival = new Mewtwo();
		winBoss = true;
		controllerLucha.setRival(pokemonRival);
		abrirPantallaFxml("PantallaLucha.fxml");
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
}

