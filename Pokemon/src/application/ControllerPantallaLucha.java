package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ControllerPantallaLucha {
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
    private Button curar;

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
    
    private int vidaUsuario = 100;
    private int vidaRival = 100;

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
    private void botonCurar() {
    	System.out.println("CURARSE");
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
    	actualizarVidaRival(10);
    	System.out.println("ataqueSeguro");
    }
    
    @FXML
    public void ataqueArriesgado(){
    	actualizarVidaRival(20);
    	System.out.println("ataqueArriesgado");
    }
    
    @FXML
    public void ataqueMuyArriesgado(){
    	actualizarVidaRival(40);
    	System.out.println("ataqueMuyArriesgado");
    }
    
    @FXML
    public void cancelar(){
        idAtaque1.setVisible(false);
        idAtaque2.setVisible(false);
        idAtaque3.setVisible(false);
        idCancelar.setVisible(false);
    }
        
 // Método para actualizar la vida del usuario
    public void actualizarVidaUsuario(int damage) {
    	vidaUsuario -= damage; 
        idPb.setProgress((double)vidaUsuario/100);
    }

    // Método para actualizar la vida del rival
    public void actualizarVidaRival(int damage) {
        vidaRival -= damage; 
        idPbRival.setProgress((double)vidaRival/100);
    }

}
