package application;

/**
 * La clase Mew representa a un Pokemon específico que extiende la clase abstracta AtaqueEspecialRandom.
 * Mew tiene un ataque especial aleatorio y un ataque seguro implementados.
 */

public class Mew extends AtaqueEspecialRandom {

    /**
     * Constructor de la clase Mew.
     * Inicializa los atributos de Mew con sus valores .
     */
	
	public Mew() {
		super("Mew", 200, 200, 80, 'M', "/application/img/Rival3.gif");
	}
	
    /**
     * Implementación del método de ataque seguro específico de Mew.
     *
     * @return El daño causado por el ataque seguro de Mew.
     */
	
    @Override
    public int ataqueSeguro() {
        return 0; 
    }
}
