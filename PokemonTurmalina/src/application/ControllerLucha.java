package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.Random;
import javafx.animation.PauseTransition;
import javafx.util.Duration;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Controlador para la interfaz del combate.
 * Maneja eventos y acciones relacionadas con PantallaLucha.fxml.
 */

public class ControllerLucha {
	@FXML
	private GridPane idLayout;

	@FXML
	private Label idNombre,idNivel, idNombreRival, idNivelRival, idPSRival, idPS;
	
	@FXML
	private ImageView idImagenRival, idGeneroRival, idImagen, idGenero;

	@FXML
	private Button idAtaque1, idAtaque2, idAtaque3, idCancelar;

	@FXML
	private ProgressBar idPbRival, idPb;

	@FXML
	private TextArea cuadroTexto;

	private static Equipo equipo;
	private static Pokemon pokemonUsuario;
	private static Pokemon pokemonRival;
	private PauseTransition pausa = new PauseTransition(Duration.seconds(1));
    private boolean turnoUsuario = true;
    private boolean turnoRival = true;
	
    /**
     * Inicializa el controlador con los Pokémon del jugador y el Pokémon rival.
     */
	public void initialize() {
		pokemonUsuario = equipo.getPokemon1();
		if (pokemonUsuario.getVida() == 0)
			cambiarPokemon();
		asignarElementosFx();
		asignarElementosFxRival();
		cuadroTexto.setText("¿Qué hará " + pokemonUsuario.getNombre() + "?");
	}
	
    /**
     * Devuelve el equipo actual.
     *
     * @return El equipo actual.
     */
	
	public Equipo getEquipo(){
		return equipo;
	}
	private void asignarElementosFx()
	{
		idNombre.setText(pokemonUsuario.getNombre());
		idNivel.setText("Nv. " + pokemonUsuario.getNivel());
		idImagen.setImage(new Image(getClass().getResourceAsStream(pokemonUsuario.getImg())));
		idPb.setProgress((double)pokemonUsuario.getVida() / pokemonUsuario.getVida_total());
	}
	private void asignarElementosFxRival()
	{
		idNombreRival.setText(pokemonRival.getNombre());
		idNivelRival.setText("Nv. " + pokemonRival.getNivel());
		idImagenRival.setImage(new Image(getClass().getResourceAsStream(pokemonRival.getImg())));
		idPbRival.setProgress((double)pokemonRival.getVida() / pokemonRival.getVida_total());
	}
	
	private void cambiarPokemon() {
		Boolean pokemonConVidaEncontrado = false;
		for (Pokemon aux : equipo.getListaPokemon()) {
			if (aux.getVida() > 0) {
				pokemonUsuario = aux;
				pokemonConVidaEncontrado = true;
				break;
			}
		}
		if (!pokemonConVidaEncontrado)
			System.exit(0);
	}
	
    /**
     * Establece el equipo para el controlador.
     *
     * @param equipo El equipo de Pokémon del jugador.
     */
	
	public void setEquipo(Equipo equipo) {
		ControllerLucha.equipo = equipo;
	}
	
    /**
     * Establece el Pokémon rival para el controlador.
     *
     * @param pokemonRival El Pokémon rival.
     */
	
	public void setRival(Pokemon pokemonRival) {
		ControllerLucha.pokemonRival= pokemonRival; 
	}

	@FXML
	private void botonAtacar() {
            combate();
	}

	@FXML
	private void botonCambiar() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaEquipo.fxml"));
			Parent root = loader.load();
			ControllerEquipo pantallaEquipoController = loader.getController();
			Scene scene = new Scene(root);
			Stage equipo = new Stage();
			equipo.setTitle("Videojuego");
			equipo.setScene(scene);
			equipo.initStyle(StageStyle.UNDECORATED);// hace que no salga el panel de control en la ventana
			equipo.showAndWait();

			Pokemon nuevoPokemonUsuario = pantallaEquipoController.getPokemonSeleccionado();

			if (pokemonUsuario.getVida() != 0) {
				if (nuevoPokemonUsuario == null)
					nuevoPokemonUsuario = pokemonUsuario;
				if (!nuevoPokemonUsuario.getNombre().equals(pokemonUsuario.getNombre())) {
					pokemonUsuario = nuevoPokemonUsuario;
					turnoUsuario = false;
					turnoRival = true;
					combate();
				}
			} else {
				pokemonUsuario = nuevoPokemonUsuario;
				turnoUsuario = true;
				turnoRival = false;
				combate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@FXML
	private void ataqueSeguro() {
		Pokemon aux = pokemonUsuario;
		ataqueRival();
		if(aux.getVida()>0)
		{
			pausa.play();
			pausa.setOnFinished(event -> {
			cuadroTexto.setText(pokemonUsuario.getNombre() + " usó ataque seguro");
			actualizarVidaRival(((AtaqueEspecial) pokemonUsuario).ataqueSeguro()); 
			});
		}
		cancelar();
	}

	@FXML
	private void ataqueArriesgado() {
		Pokemon aux = pokemonUsuario;
		ataqueRival();
		if (aux.getVida() > 0) {
			pausa.play();
			pausa.setOnFinished(event -> {
				cuadroTexto.setText(pokemonUsuario.getNombre() + " usó ataque arriesgado");
				actualizarVidaRival(20); //
			});
			cancelar();
		}
	}

	@FXML
	private void ataqueMuyArriesgado() {
		Pokemon aux = pokemonUsuario;
		ataqueRival();
		if (aux.getVida() > 0) {
			pausa.play();
			pausa.setOnFinished(event -> {
		        cuadroTexto.setText(pokemonUsuario.getNombre() + " usó ataque muy arriesgado");
		        actualizarVidaRival(((AtaqueEspecial) pokemonUsuario).ataqueMuyArriesgado());
			});
	        cancelar();
		}
	}

	@FXML
	private void cancelar() {
		idAtaque1.setVisible(false);
		idAtaque2.setVisible(false);
		idAtaque3.setVisible(false);
		idCancelar.setVisible(false);
		cuadroTexto.setVisible(true);
	}

	/**
	 * Función que hace que el pokemon rival ataque de forma aleatoria entre 4 ataques,
	 * con distintos daños.
	 */
	public void ataqueRival() {
		Random random = new Random();
		int indiceAtaqueRival = random.nextInt(4);

		int damage = switch (indiceAtaqueRival) {
		case 0 -> 10;
		case 1 -> 15;
		case 2 -> 20;
		case 3 -> 40;
		default -> 0;
		};

		cuadroTexto.setText("El rival usó ataque de " + damage);
		actualizarVidaUsuario(damage);
	}
	
	/**
	 * Función que se encarga de actualizar la vida del pokemon del usuario cuando sufre daño
	 * 
	 * @param damage Daño que sufre el pokemon del jugador
	 */
	public void actualizarVidaUsuario(int damage) {
		int vidaUsuario = pokemonUsuario.getVida() - damage;
		pokemonUsuario.setVida(vidaUsuario);
		idPb.setProgress((double)pokemonUsuario.getVida() / pokemonUsuario.getVida_total());
		if (pokemonUsuario.getVida() <= 0) {
			pokemonUsuario.setVida(0);
			botonCambiar();
		}
	}

	/**
	 * Función que se encarga de actualizar la vida del pokemon rival cuando sufre daño
	 * 
	 * @param damage Daño que sufre el pokemon rival
	 */
	public void actualizarVidaRival(int damage) {
		int vidaRival = pokemonRival.getVida() - damage;
		pokemonRival.setVida(vidaRival);
		idPbRival.setProgress((double)pokemonRival.getVida() / pokemonRival.getVida_total());

		if (pokemonRival.getVida() <= 0)
			cerrarVentanaActual();
	}

	@FXML
	private void Buttonhuir(ActionEvent event) {
		// Obtiene la escena desde el GridPane
		Scene scene = idLayout.getScene();

		// Obtiene el Stage desde la escena
		Stage stage = (Stage) scene.getWindow();

		// Cierra la ventana
		stage.close();
	}
	
	/**
	 * Cierra la ventana actual
	 */
	public void cerrarVentanaActual() {
		Stage stage = (Stage) idLayout.getScene().getWindow();
		stage.close();
	}
	
	/**
	 * Se encarga del funcionamiento del combate.
	 */
	
	public void combate() {

		asignarElementosFx();

		if (turnoUsuario) {
			cuadroTexto.setVisible(false);
			idAtaque1.setVisible(true);
			idAtaque2.setVisible(true);
			idAtaque3.setVisible(true);
			idCancelar.setVisible(true);
		} else if (turnoRival) {
			ataqueRival();
			turnoUsuario = true;
			turnoRival = false;
		}
	}
}
