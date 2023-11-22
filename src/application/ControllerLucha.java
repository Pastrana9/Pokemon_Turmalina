package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import java.util.Random;
import javafx.animation.PauseTransition;
import javafx.util.Duration;
import javafx.stage.Stage;

public class ControllerLucha {
	@FXML
	private GridPane idLayout;

	@FXML
	private Label idNombre;

	@FXML
	private Label idNivel;

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
	private Button cambiar;

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

	@FXML
	private TextArea cuadroTexto;

	private static Equipo equipo;
	private static Pokemon pokemonUsuario;
	private int vidaUsuario;
	private int vidaRival = 100;
	private PauseTransition pausa = new PauseTransition(Duration.seconds(1));

	public void initialize() {
    	
    	
		pokemonUsuario = equipo.getPokemon1();
		vidaUsuario = pokemonUsuario.getVida();

		idNombre.setText(pokemonUsuario.getNombre());
		idNivel.setText("Nv. " + pokemonUsuario.getNivel());

		cuadroTexto.setText("¿Qué hará " + pokemonUsuario.getNombre() + "?");

		idPbRival.setProgress(1);
		idPb.setProgress(pokemonUsuario.getVida() / 100);
	}

	public void setEquipo(Equipo equipo) {
		ControllerLucha.equipo = equipo;
	}

	@FXML
	private void botonAtacar() {

		cuadroTexto.setVisible(false);
		idAtaque1.setVisible(true);
		idAtaque2.setVisible(true);
		idAtaque3.setVisible(true);
		idCancelar.setVisible(true);
	}

	@FXML
	private void botonCambiar() {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaEquipo.fxml"));
			Parent root = loader.load();

			// Crear una nueva escena
			Scene scene = new Scene(root);

			// Configurar el escenario (ventana)
			Stage Combate1 = new Stage();
			// Combate1.close();

			// gameplayStage.setFullScreen(true);

			Combate1.setTitle("Videojuego");
			Combate1.setScene(scene);

			// Mostrar la nueva ventana
			Combate1.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void mostrarPSRival() {

		System.out.println("MOSTRANDO PS DEL RIVAL");
	}

	@FXML
	public void mostrarVidaRival() {
		System.out.println("MOSTRANDO LA VIDA DEL RIVAL");
	}

	@FXML
	public void mostrarVida() {
		System.out.println(pokemonUsuario.getVida());
	}

	@FXML
	public void mostrarPS() {
		System.out.println("MOSTRANDO PS");
	}

	@FXML
	public void ataqueSeguro() {
		ataqueRival();
		pausa.play();
		pausa.setOnFinished(event -> {
			cuadroTexto.setText(pokemonUsuario.getNombre() + " usó ataque seguro");
			actualizarVidaRival(10); //
		});
		cancelar();
	}

	@FXML
	public void ataqueArriesgado() {
		ataqueRival();
		pausa.play();
		pausa.setOnFinished(event -> {
			cuadroTexto.setText(pokemonUsuario.getNombre() + " usó ataque arriesgado");
			actualizarVidaRival(20); //
		});
		cancelar();
	}

	@FXML
	public void ataqueMuyArriesgado() {
		ataqueRival();
		pausa.play();
		pausa.setOnFinished(event -> {
			cuadroTexto.setText(pokemonUsuario.getNombre() + " usó ataque muy arriesgado");
			actualizarVidaRival(40); //
		});
		cancelar();
	}

	@FXML
	public void cancelar() {
		idAtaque1.setVisible(false);
		idAtaque2.setVisible(false);
		idAtaque3.setVisible(false);
		idCancelar.setVisible(false);
		cuadroTexto.setVisible(true);

	}

	public void ataqueRival() {
		Random random = new Random();
		int indiceAtaqueRival = random.nextInt(4);

		switch (indiceAtaqueRival) {
		case 0:
			cuadroTexto.setText(" El rival usó ataque de 10");
			actualizarVidaUsuario(10);
			break;
		case 1:
			cuadroTexto.setText(" El rival usó ataque de 15");
			actualizarVidaUsuario(15);
			break;
		case 2:
			cuadroTexto.setText(" El rival usó ataque de 20");
			actualizarVidaUsuario(20);
			break;
		case 3:
			cuadroTexto.setText(" El rival usó ataque de 40");
			actualizarVidaUsuario(40);
			break;
		}
	}

	public void actualizarVidaUsuario(int damage) {
		vidaUsuario -= damage;
		pokemonUsuario.setVida(vidaUsuario);

		idPb.setProgress((double) pokemonUsuario.getVida() / 100);
		if (pokemonUsuario.getVida() <= 0) {
			pokemonUsuario = equipo.getPokemon2();

			cerrarVentanaActual();
		}
	}

	public void actualizarVidaRival(int damage) {
		vidaRival -= damage;
		idPbRival.setProgress((double) vidaRival / 100);

		if (vidaRival <= 0)
			cerrarVentanaActual();
	}

	private void cerrarVentanaActual() {
		Stage stage = (Stage) idLayout.getScene().getWindow();
		stage.close();
	}

	public void setPokemonUsuario(Pokemon pokemon) {
		pokemonUsuario = pokemon;
	}
}
