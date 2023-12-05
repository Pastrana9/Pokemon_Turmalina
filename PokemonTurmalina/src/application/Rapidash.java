package application;

/**
 * La clase Rapidash representa a un Pokemon específico que extiende la clase abstracta AtaqueEspecialRandom.
 * Rapidash tiene un ataque especial aleatorio y un ataque seguro implementados.
 */

public class Rapidash extends AtaqueEspecialRandom {

    /**
     * Constructor de la clase Rapidash.
     * Inicializa los atributos de Rapidash con sus valores .
     */
	
    public Rapidash() {
        super("Rapidash", 125, 125, 60, 'F', "/application/img/Rival2.gif");
    }
    
    /**
     * Implementación del método de ataque seguro específico de Rapidash.
     *
     * @return El daño causado por el ataque seguro de Rapidash.
     */
    
    @Override
    public int ataqueSeguro() {
        return 0; 
    }

}
