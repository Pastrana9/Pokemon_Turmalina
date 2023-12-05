package application;

/**
 * La clase Snorlax representa a un Pokemon específico que extiende la clase abstracta AtaqueEspecialRandom.
 * Snorlax tiene un ataque especial aleatorio y un ataque seguro implementados.
 */

public class Snorlax extends AtaqueEspecialRandom {

    /**
     * Constructor de la clase Snorlax.
     * Inicializa los atributos de Snorlax con sus valores .
     */
	
    public Snorlax() {
        super("Snorlax ", 500, 500, 100, 'F', "/application/img/5.gif");
    }
    
    /**
     * Implementación del método de ataque seguro específico de Snorlax.
     *
     * @return El daño causado por el ataque seguro de Snorlax.
     */
    
    @Override
    public int ataqueSeguro() {
        return 5; 
    }
}