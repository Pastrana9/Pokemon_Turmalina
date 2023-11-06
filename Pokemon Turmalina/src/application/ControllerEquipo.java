package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;


public class ControllerEquipo implements Initializable{

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
	
	
	private int vidaPokemon1 = 100;
	private int vidaPokemon2 = 100;
	private int vidaPokemon3 = 200;
	private int vidaPokemon4 = 100;
	private int vidaPokemon5 = 100;
	private int vidaPokemon6 = 100;
	
	
    public void initialize(URL url, ResourceBundle rb) {
    	ControllerLucha controllerLucha = new ControllerLucha();
        controllerLucha.setControllerEquipo(this);
        vida.setText(vidaPokemon1 + " / "+ vidaPokemon1);
        vida2.setText(vidaPokemon2 + " / "+ vidaPokemon2);
        vida3.setText(vidaPokemon3 + " / "+ vidaPokemon3);
        vida4.setText(vidaPokemon4 + " / "+ vidaPokemon4);
        vida5.setText(vidaPokemon5 + " / "+ vidaPokemon5);
        vida6.setText(vidaPokemon6 + " / "+ vidaPokemon6);
    } 
    
    public int getVidaPokemon1()
    {
    	return vidaPokemon1;
    }
    public void setVidaPokemon1(int vida)
    {
    	vidaPokemon1=vida;
    }
    
}
