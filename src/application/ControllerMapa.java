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
import javafx.animation.TranslateTransition;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMapa implements Initializable {

	
	private double Xusuario = 0;
	private double Yusuario = 287.0;
	private TranslateTransition transition;
	private int distancia = 12;
	private double hitboxX = 30; 
	private double hitboxY = 30; 
	private double npcHitboxX = 10; 
	private double npcHitboxY = 10; 
    private double imagenX = 640;
    private double imagenY = 445;


	
    @FXML
    private AnchorPane MapaAnchorPane;
    
    @FXML
    private ImageView sprite;
        
    @FXML 
    private Rectangle casa;
    
    @FXML 
    private Rectangle casa2;
    
    @FXML 
    private Rectangle casa3;
    
    @FXML 
    private Rectangle casaGrande1;
    
    @FXML 
    private Rectangle casaGrande2;
    
    @FXML 
    private Rectangle casaGrande3;
    
    @FXML 
    private Rectangle vallaRio;
    
    @FXML 
    private Rectangle valla;
    
    @FXML 
    private Rectangle arboles;
    
    @FXML 
    private Rectangle arboles1;
    
    @FXML 
    private Rectangle arboles2;
    
    
    @FXML
    private void fight1(ActionEvent event)
    {
    	try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaLucha1.fxml"));
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
    private void fight2(ActionEvent event)
    {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaLucha2.fxml"));
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
    private void fight3(ActionEvent event)
    {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaLucha3.fxml"));
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
    private void Pozo(ActionEvent event)
    {
        try {

            Stage pantallaMapa = (Stage) MapaAnchorPane.getScene().getWindow();
            pantallaMapa.close();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaPozo.fxml"));
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
    private void NoSalida(ActionEvent event)
    {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("VentanaNoSalida.fxml"));
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
    	
        ControllerEquipo controllerEquipo = new ControllerEquipo();
        ControllerLucha controllerLucha = new ControllerLucha();
        
        Pokemon pokemon1 = new Pokemon("Blastoise", 100, 100, 1, 'M');
        Pokemon pokemon2 = new Pokemon("Entei", 100, 100, 1, 'M');
        Pokemon pokemon3 = new Pokemon("Dialga", 200, 200, 1, 'F');
        Pokemon pokemon4 = new Pokemon("Charizard", 200, 200, 1, 'F');
        Pokemon pokemon5 = new Pokemon("Bulbasaur", 200, 200, 1, 'M');
        Pokemon pokemon6 = new Pokemon("Snorlax ", 500, 500, 1, 'F');
        Equipo equipo = new Equipo(pokemon1,pokemon2,pokemon3,pokemon4,pokemon5,pokemon6);
        
        controllerEquipo.setEquipo(equipo);
        controllerLucha.setEquipo(equipo);
    	
        // Inicializar la transición para el movimiento suave del sprite
        transition = new TranslateTransition();

        // Agregar un manejador de eventos al AnchorPane
        MapaAnchorPane.setOnKeyPressed(this::handleKeyPress);

        // Configurar el AnchorPane para recibir eventos de teclado
        MapaAnchorPane.setFocusTraversable(true);
        MapaAnchorPane.requestFocus();
    }

    private void handleKeyPress(KeyEvent event) {
    	
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
         
        
        if(colisionesMapa(newX,newY) || newX < 0 || newY < 0 || newX > imagenX || newY > imagenY)
        	return;
        
        if (colisionConNpc1(newX, newY))
            fight1(null); 
        if (colisionConNpc2(newX, newY))
            fight3(null);
        if (colisionConNpc3(newX, newY))
            fight2(null);
        if (colisionPozo(newX, newY))
            Pozo(null);
        if (colisionNoSalida(newX, newY))
            NoSalida(null);


        moveSprite(newX, newY);
    }

    private void moveSprite(double newX, double newY) {
        transition.setToX(newX - Xusuario);
        transition.setToY(newY - Yusuario);
        transition.play();

        Xusuario = newX;
        Yusuario = newY;
        
        sprite.setLayoutX(newX);
        sprite.setLayoutY(newY);
    }
    private boolean colisionConNpc1(double newX, double newY) {

        double npcX = 142.0; 
        double npcY = 248.0; 

        return (newX < npcX + npcHitboxX &&newX + hitboxX > npcX &&newY < npcY + npcHitboxY &&newY + hitboxY > npcY);
    }
    private boolean colisionConNpc2(double newX, double newY) {

        double npcX = 591.0; 
        double npcY = 338.0; 

        return (newX < npcX + npcHitboxX &&newX + hitboxX > npcX &&newY < npcY + npcHitboxY &&newY + hitboxY > npcY);
    }
    private boolean colisionConNpc3(double newX, double newY) {

        double npcX = 258.0; 
        double npcY = 93.0; 

        return (newX < npcX + npcHitboxX &&newX + hitboxX > npcX &&newY < npcY + npcHitboxY &&newY + hitboxY > npcY);
    }

    private boolean colisionPozo(double newX, double newY) {

        double npcX = 585.0;
        double npcY = 98.0;

        return (newX < npcX + npcHitboxX &&newX + hitboxX > npcX &&newY < npcY + npcHitboxY &&newY + hitboxY > npcY);
    }

    private boolean colisionNoSalida(double newX, double newY) {

        double npcX = 454.0;
        double npcY = 7.0;

        return (newX < npcX + npcHitboxX &&newX + hitboxX > npcX &&newY < npcY + npcHitboxY &&newY + hitboxY > npcY);
    }
    private boolean colisionesMapa(double newX, double newY) {    	
    	Boolean colision = false;
    	
        if(casa.getBoundsInParent().contains(newX,newY))
        	colision = true;
        if(casa2.getBoundsInParent().contains(newX,newY))
        	colision = true;
        if(casa3.getBoundsInParent().contains(newX,newY))
        	colision = true;
        if(casaGrande1.getBoundsInParent().contains(newX,newY))
        	colision = true;
        if(casaGrande2.getBoundsInParent().contains(newX,newY))
        	colision = true;
        if(casaGrande3.getBoundsInParent().contains(newX,newY))
        	colision = true;
        if(vallaRio.getBoundsInParent().contains(newX,newY))
        	colision = true;
        if(valla.getBoundsInParent().contains(newX,newY))
        	colision = true;
        if(arboles.getBoundsInParent().contains(newX,newY))
        	colision = true;
        if(arboles1.getBoundsInParent().contains(newX,newY))
        	colision = true;
        if(arboles2.getBoundsInParent().contains(newX,newY))
        	colision = true;
        return colision;
    }

}

