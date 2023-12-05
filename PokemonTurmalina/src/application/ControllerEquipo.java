package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Controlador para la interfaz del equipo.
 * Maneja eventos y acciones relacionadas con PantallaEquipo.fxml.
 */

public class ControllerEquipo{

    @FXML
    private GridPane idLayout2;

	@FXML
	private Label vida, vida2, vida3, vida4, vida5, vida6;

	@FXML
	private Label nombre, nombre2, nombre3, nombre4, nombre5, nombre6;

	@FXML
	private Label nivel, nivel2, nivel3, nivel4, nivel5, nivel6;

	@FXML
	private ProgressBar pb, pb2, pb3, pb4, pb5, pb6;
	
	private static Equipo equipo;
    private static Pokemon pokemonLucha;
	
    
    /**
     * Inicializa el controlador con los distintos atributos de los pokemons.
     */
    public void initialize() {
    	   	
    	vida.setText(equipo.getPokemon1().getVida()+ " / " + equipo.getPokemon1().getVida_total());
    	vida2.setText(equipo.getPokemon2().getVida() + " / " + equipo.getPokemon2().getVida_total());
        vida3.setText(equipo.getPokemon3().getVida() + " / " + equipo.getPokemon3().getVida_total());
        vida4.setText(equipo.getPokemon4().getVida() + " / " + equipo.getPokemon4().getVida_total());
        vida5.setText(equipo.getPokemon5().getVida() + " / " + equipo.getPokemon5().getVida_total());
        vida6.setText(equipo.getPokemon6().getVida() + " / " + equipo.getPokemon6().getVida_total());
        
    	pb.setProgress((double)equipo.getPokemon1().getVida()/equipo.getPokemon1().getVida_total());
    	pb2.setProgress((double)equipo.getPokemon2().getVida()/equipo.getPokemon2().getVida_total());
    	pb3.setProgress((double)equipo.getPokemon3().getVida()/equipo.getPokemon3().getVida_total());
    	pb4.setProgress((double)equipo.getPokemon4().getVida()/equipo.getPokemon4().getVida_total());
    	pb5.setProgress((double)equipo.getPokemon5().getVida()/equipo.getPokemon5().getVida_total());
    	pb6.setProgress((double)equipo.getPokemon6().getVida()/equipo.getPokemon6().getVida_total());
        
        nombre.setText(equipo.getPokemon1().getNombre());
        nombre2.setText(equipo.getPokemon2().getNombre());
        nombre3.setText(equipo.getPokemon3().getNombre());
        nombre4.setText(equipo.getPokemon4().getNombre());
        nombre5.setText(equipo.getPokemon5().getNombre());
        nombre6.setText(equipo.getPokemon6().getNombre());
        
        
        nivel.setText("Nv. " + equipo.getPokemon1().getNivel());
        nivel2.setText("Nv. " + equipo.getPokemon2().getNivel());
        nivel3.setText("Nv. " + equipo.getPokemon3().getNivel());
        nivel4.setText("Nv. " + equipo.getPokemon4().getNivel());
        nivel5.setText("Nv. " + equipo.getPokemon5().getNivel());
        nivel6.setText("Nv. " + equipo.getPokemon6().getNivel());
            
    } 
    /**
     * Establece el equipo para el controlador.
     *
     * @param equipo Variable con el equipo de pokemons actualizado.
     */
    public void setEquipo(Equipo equipo) {
    	ControllerEquipo.equipo=equipo;
    }
    
    /**
     * Maneja el evento de elegir el segundo Pokémon.
     */

    @FXML
    public void elegir1() {
    	if(equipo.getPokemon1().getVida()>0) {
    	pokemonLucha=equipo.getPokemon1();
    	cerrarVentanaActual();
    	}
    }    
    
    /**
     * Maneja el evento de elegir el segundo Pokémon.
     */
    @FXML
    public void elegir2() {
    	if(equipo.getPokemon2().getVida()>0) {
    	pokemonLucha=equipo.getPokemon2();
    	cerrarVentanaActual();
    	}
    }  
    
    /**
     * Maneja el evento de elegir el tercer Pokémon.
     */
    @FXML
    public void elegir3() {
    	if(equipo.getPokemon3().getVida()>0) {
    	pokemonLucha=equipo.getPokemon3();
    	cerrarVentanaActual();
    	}
    }    
    
    /**
     * Maneja el evento de elegir el cuarto Pokémon.
     */
    @FXML
    public void elegir4() {
    	if(equipo.getPokemon4().getVida()>0) {
    	pokemonLucha=equipo.getPokemon4();
    	cerrarVentanaActual();
    	}
    }    
    
    /**
     * Maneja el evento de elegir el quinto Pokémon.
     */
    @FXML
    public void elegir5() {
    	if(equipo.getPokemon5().getVida()>0) {
    	pokemonLucha=equipo.getPokemon5();
    	cerrarVentanaActual();
    	}
    }    
    
    /**
     * Maneja el evento de elegir el sexto Pokémon.
     */
    @FXML
    public void elegir6() {
    	if(equipo.getPokemon6().getVida()>0) {
    	pokemonLucha=equipo.getPokemon6();
    	cerrarVentanaActual();
    	}
    }    
    
    /**
     * Devuelve el Pokémon seleccionado para la batalla.
     *
     * @return El Pokémon seleccionado para la batalla.
     */
    public Pokemon getPokemonSeleccionado() {
        return pokemonLucha;
    }

    /**
     * Maneja el evento del botón "Volver", cerrando la ventana actual.
     *
     * @param event El evento de acción generado por el botón "Volver".
     */
    
    @FXML
    public void Buttonvolver(ActionEvent event) {
        Scene scene = idLayout2.getScene();
        Stage stage = (Stage) scene.getWindow();
        stage.close();
    }
    
    private void cerrarVentanaActual() {
        Stage stage = (Stage) idLayout2.getScene().getWindow();
        stage.close();
    }


}
