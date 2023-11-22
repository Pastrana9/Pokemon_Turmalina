package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class ControllerEquipo{
	
	@FXML
	private Label vida; 
	@FXML
	private Label vida2; 
	@FXML
	private Label vida3; 
	@FXML
	private Label vida4; 
	@FXML
	private Label vida5; 
	@FXML
	private Label vida6; 
	
	@FXML
	private Label nombre; 
	@FXML
	private Label nombre2; 
	@FXML
	private Label nombre3; 
	@FXML
	private Label nombre4;
	@FXML
	private Label nombre5;
	@FXML
	private Label nombre6;
	
	@FXML
	private Label nivel;
	@FXML
	private Label nivel2;
	@FXML
	private Label nivel3;
	@FXML
	private Label nivel4;
	@FXML
	private Label nivel5;
	@FXML
	private Label nivel6;
	@FXML
	private ProgressBar pb;
	
	private static Equipo equipo;
    private static ControllerLucha lucha;
	
    public void initialize() {
    	
    	//pb.setProgress(equipo.getPokemon1().getVida() / 100);
    	
    	lucha = new ControllerLucha();
    	vida.setText(equipo.getPokemon1().getVida()+ " / " + equipo.getPokemon1().getVida_total());
    	vida2.setText(equipo.getPokemon2().getVida() + " / " + equipo.getPokemon2().getVida_total());
        vida3.setText(equipo.getPokemon3().getVida() + " / " + equipo.getPokemon3().getVida_total());
        vida4.setText(equipo.getPokemon4().getVida() + " / " + equipo.getPokemon4().getVida_total());
        vida5.setText(equipo.getPokemon5().getVida() + " / " + equipo.getPokemon5().getVida_total());
        vida6.setText(equipo.getPokemon6().getVida() + " / " + equipo.getPokemon6().getVida_total());
        
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
    public void setEquipo(Equipo equipo) {
    	ControllerEquipo.equipo=equipo;
    }

    @FXML
    private void elegir2() {
    	lucha.setPokemonUsuario(equipo.getPokemon2());
    }
}
