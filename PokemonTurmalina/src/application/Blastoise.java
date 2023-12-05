package application;

/**
 * La clase Blastoise representa a un Pokemon específico que extiende la clase abstracta AtaqueEspecialRandom.
 * Blastoise tiene un ataque especial aleatorio y un ataque seguro implementados.
 */

public class Blastoise extends AtaqueEspecialRandom {

    /**
     * Constructor de la clase Blastoise.
     * Inicializa los atributos de Blastoise con sus valores .
     */
    public Blastoise() {
        super("Blastoise", 100, 100, 45, 'M', "/application/img/Blastoise.gif");
    }

    /**
     * Implementación del método de ataque seguro específico de Blastoise.
     *
     * @return El daño causado por el ataque seguro de Blastoise.
     */
    @Override
    public int ataqueSeguro() {
        return 20; 
    }
}
