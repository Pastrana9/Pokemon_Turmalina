package application;

/**
 * La clase Dialga representa a un Pokemon específico que extiende la clase abstracta AtaqueEspecialRandom.
 * Dialga tiene un ataque especial aleatorio y un ataque seguro implementados.
 */

public class Dialga extends AtaqueEspecialRandom {

    /**
     * Constructor de la clase Dialga.
     * Inicializa los atributos de Dialga con sus valores .
     */
	
    public Dialga() {
        super("Dialga", 200, 200, 64, 'F', "/application/img/2.gif");
    }
    
    /**
     * Implementación del método de ataque seguro específico de Dialga.
     *
     * @return El daño causado por el ataque seguro de Dialga.
     */
    
    @Override
    public int ataqueSeguro() {
        return 5; 
    }

}