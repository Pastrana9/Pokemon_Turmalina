package application;

/**
 * La clase Charizard representa a un Pokemon específico que extiende la clase abstracta AtaqueEspecialRandom.
 * Charizard tiene un ataque especial aleatorio y un ataque seguro implementados.
 */

public class Charizard extends AtaqueEspecialRandom {

    /**
     * Constructor de la clase Charizard.
     * Inicializa los atributos de Charizard con sus valores .
     */
	
    public Charizard() {
        super("Charizard", 200, 200, 80, 'F', "/application/img/3.gif");
    }
    
    /**
     * Implementación del método de ataque seguro específico de Charizard.
     *
     * @return El daño causado por el ataque seguro de Charizard.
     */
    
    @Override
    public int ataqueSeguro() {
        return 23; 
    }
}