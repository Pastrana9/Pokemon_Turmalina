package application;

/**
 * La clase Bulbasaur representa a un Pokemon específico que extiende la clase abstracta AtaqueEspecialRandom.
 * Bulbasaur tiene un ataque especial aleatorio y un ataque seguro implementados.
 */

public class Bulbasaur extends AtaqueEspecialRandom {

    /**
     * Constructor de la clase Bulbasaur.
     * Inicializa los atributos de Bulbasaur con sus valores .
     */
	
    public Bulbasaur() {
        super("Bulbasaur", 50, 50, 10, 'M', "/application/img/4.gif");
    }
    
    /**
     * Implementación del método de ataque seguro específico de Bulbasaur.
     *
     * @return El daño causado por el ataque seguro de Bulbasaur.
     */
   
    @Override
    public int ataqueSeguro() {
        return 10; 
    }

}