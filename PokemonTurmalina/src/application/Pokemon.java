package application;

/**
 * Contiene información como nombre, vida, nivel, género e imagen del Pokémon.
 */

public class Pokemon {

	private final String nombre;
	private final int vida_total;
	private int vida;
	private final int nivel;
	private final char genero;
	private String img;

	/**
	 * Constructor de la clase Pokémon.
	 *
	 * @param nombre     El nombre del Pokémon.
	 * @param vida_total La vida total del Pokémon.
	 * @param vida       La vida actual del Pokémon.
	 * @param nivel      El nivel del Pokémon.
	 * @param genero     El género del Pokémon.
	 * @param img        La ruta de la imagen del Pokémon.
	 */

	public Pokemon(String nombre, int vida_total, int vida, int nivel, char genero, String img) {
		this.nombre = nombre;
		this.vida_total = vida_total;
		this.vida = vida;
		this.nivel = nivel;
		this.genero = genero;
		this.img = img;
	}

	/**
	 * Obtiene el nombre del Pokémon.
	 *
	 * @return El nombre del Pokémon.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene la vida total del Pokémon.
	 *
	 * @return La vida total del Pokémon.
	 */
	public int getVida_total() {
		return vida_total;
	}

	/**
	 * Obtiene la vida actual del Pokémon.
	 *
	 * @return La vida actual del Pokémon.
	 */
	public int getVida() {
		return vida;
	}

	/**
	 * Establece la vida actual del Pokémon.
	 *
	 * @param vida La nueva vida del Pokémon.
	 */
	public void setVida(int vida) {
		this.vida = vida;
	}

	/**
	 * Obtiene el nivel del Pokémon.
	 *
	 * @return El nivel del Pokémon.
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * Obtiene el género del Pokémon.
	 *
	 * @return El género del Pokémon.
	 */
	public char getGenero() {
		return genero;
	}

	/**
	 * Obtiene la ruta de la imagen del Pokémon.
	 *
	 * @return La ruta de la imagen del Pokémon.
	 */
	public String getImg() {
		return img;
	}
}
