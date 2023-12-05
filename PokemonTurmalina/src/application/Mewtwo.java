package application;

/**
 * La clase Mewtwo representa a un Pokemon específico que extiende la clase abstracta AtaqueEspecialRandom.
 * Mewtwo tiene un ataque especial aleatorio y un ataque seguro implementados.
 */

public class Mewtwo extends AtaqueEspecialRandom {

    /**
     * Constructor de la clase Mewtwo.
     * Inicializa los atributos de Mewtwo con sus valores .
     */
	
	public Mewtwo() {
		super("Mewtwo", 200, 200, 90, 'M', "/application/img/Mewseventeen.gif");
	}
	
    /**
     * Implementación del método de ataque seguro específico de Mewtwo.
     *
     * @return El daño causado por el ataque seguro de Mewtwo.
     */
	
    @Override
    public int ataqueSeguro() {
        return 0; 
    }
}

