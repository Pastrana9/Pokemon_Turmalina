package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import java.util.Random;
import javafx.animation.PauseTransition;
import javafx.util.Duration;
import javafx.stage.Stage;

public class ControllerLucha{
    @FXML
    private GridPane idLayout;

    @FXML
    private Label idNombre;

    @FXML
    private ImageView idImagenRival;

    @FXML
    private Label idNombreRival;

    @FXML
    private ImageView idGeneroRival;

    @FXML
    private Label idNivelRival;

    @FXML
    private ImageView idImagen;

    @FXML
    private ImageView idGenero;

    @FXML
    private Button atacar;

    @FXML
    private Button idAtaque1;

    @FXML
    private Button idAtaque2;

    @FXML
    private Button idCancelar;

    @FXML
    private Button idAtaque3;
    
    @FXML
    private Label idPSRival;
    
    @FXML
    private ProgressBar idPbRival;
    
    @FXML
    private Label idPS;
    
    @FXML
    private ProgressBar idPb;
    
    
    private ControllerEquipo equipo;    
    private int vidaUsuario = 100;
    private int vidaRival = 100;
    private PauseTransition pausa = new PauseTransition(Duration.seconds(1));
    
    

    public void initialize() {
    	System.out.println("SE HA INICIADO EL ControllerPantallaLucha");
    	idPbRival.setProgress(1);
    	idPb.setProgress(1);
    }

    @FXML
    private void botonAtacar() {
        idAtaque1.setVisible(true);
        idAtaque2.setVisible(true);
        idAtaque3.setVisible(true);
        idCancelar.setVisible(true);
    }

    @FXML
    public void mostrarPSRival(){
    	
    	System.out.println("MOSTRANDO PS DEL RIVAL");
    }
    
    @FXML
    public void mostrarVidaRival(){
    	System.out.println("MOSTRANDO LA VIDA DEL RIVAL");
    }
    
    @FXML
    public void mostrarVida(){
    	System.out.println("MOSTRANDO LA VIDA");
    }
    
    @FXML
    public void mostrarPS(){
    	System.out.println("MOSTRANDO PS");
    }
    
    @FXML
    public void ataqueSeguro(){
    	ataqueRival();
    	pausa.play();	
        pausa.setOnFinished(event -> {
            actualizarVidaRival(10); //
        });   
        cancelar();
    }
    
    @FXML
    public void ataqueArriesgado(){
    	ataqueRival();
    	pausa.play();	
        pausa.setOnFinished(event -> {
            actualizarVidaRival(20); //
        });
        cancelar();
    }
    
    @FXML
    public void ataqueMuyArriesgado(){
    	ataqueRival();
    	pausa.play();	
        pausa.setOnFinished(event -> {
            actualizarVidaRival(40); //
        });
        cancelar();
    }
    
    @FXML
    public void cancelar(){
        idAtaque1.setVisible(false);
        idAtaque2.setVisible(false);
        idAtaque3.setVisible(false);
        idCancelar.setVisible(false);
    }
    
    public void ataqueRival()
    {
    	Random random = new Random();
    	int indiceAtaqueRival = random.nextInt(4);
    	
    	switch(indiceAtaqueRival)
    	{
    	case 0:
    		actualizarVidaUsuario(10);
    		break;
    	case 1:
    		actualizarVidaUsuario(15);
    		break;
    	case 2:
    		actualizarVidaUsuario(20);
    		break;
    	case 3:
    		actualizarVidaUsuario(40);
    		break;
    	}
    }
        
    public void actualizarVidaUsuario(int damage) {
    	vidaUsuario -= damage; 
        idPb.setProgress((double)vidaUsuario/100);
        
        if(vidaUsuario<=0)
        	cerrarVentanaActual();
    }

    public void actualizarVidaRival(int damage) {
        vidaRival -= damage; 
        idPbRival.setProgress((double)vidaRival/100);
        
        if(vidaRival<=0)
        	cerrarVentanaActual();
    }
    private void cerrarVentanaActual() {
        Stage stage = (Stage) idLayout.getScene().getWindow();
        stage.close();
    }
    public void setControllerEquipo(ControllerEquipo equipo) {
        this.equipo = equipo;
    }


}

