package application;

/**
 * La clase Gengar representa a un Pokemon específico que extiende la clase abstracta AtaqueEspecialRandom.
 * Gengar tiene un ataque especial aleatorio y un ataque seguro implementados.
 */

public class Gengar extends AtaqueEspecialRandom {

    /**
     * Constructor de la clase Gengar.
     * Inicializa los atributos de Gengar con sus valores .
     */
	
    public Gengar() {
        super("Gengar", 100, 100, 50, 'M', "/application/img/Gengar.gif");
    }
    
    /**
     * Implementación del método de ataque seguro específico de Gengar.
     *
     * @return El daño causado por el ataque seguro de Gengar.
     */
    
    @Override
    public int ataqueSeguro() {
        return 0; 
    }
}
