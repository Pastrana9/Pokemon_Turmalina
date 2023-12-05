package application;

/**
 * La clase Entei representa a un Pokemon específico que extiende la clase abstracta AtaqueEspecialRandom.
 * Entei tiene un ataque especial aleatorio y un ataque seguro implementados.
 */

public class Entei extends AtaqueEspecialRandom {

    /**
     * Constructor de la clase Entei.
     * Inicializa los atributos de Entei con sus valores .
     */
	
    public Entei() {
        super("Entei", 100, 100, 70, 'M', "/application/img/1.gif");
    }
    
    /**
     * Implementación del método de ataque seguro específico de Entei.
     *
     * @return El daño causado por el ataque seguro de Entei.
     */
    
    @Override
    public int ataqueSeguro() {
        return 25; 
    }
}