package application;

import java.util.Random;

/**
 * La clase abstracta AtaqueEspecialRandom extiende la clase Pokemon e implementa la interfaz AtaqueEspecial.
 * Proporciona una implementación de un ataque especial aleatorio y declara un método de ataque seguro que debe ser implementado por sus subclases.
 */

public abstract class AtaqueEspecialRandom extends Pokemon implements AtaqueEspecial {

    /**
     * Constructor de la clase AtaqueEspecialRandom.
     *
     * @param nombre Nombre del Pokemon.
     * @param vidaTotal Puntos de vida totales del Pokemon.
     * @param vida Puntos de vida actuales del Pokemon.
     * @param nivel Nivel del Pokemon.
     * @param genero Género del Pokemon.
     * @param img Ruta de la imagen del Pokemon.
     */
    public AtaqueEspecialRandom(String nombre, int vidaTotal, int vida, int nivel, char genero, String img) {
        super(nombre, vidaTotal, vida, nivel, genero, img);
    }

    /**
     * Implementación del método de la interfaz AtaqueEspecial para realizar un ataque muy arriesgado.
     *
     * @return El daño causado por el ataque, un número aleatorio entre 0 y 50.
     */
    @Override
    public int ataqueMuyArriesgado() {
        Random random = new Random();
        int damage = random.nextInt(51);
        return damage;
    }

    /**
     * Método abstracto que debe ser implementado por las subclases para realizar un ataque seguro.
     *
     * @return El daño causado por el ataque seguro.
     */
    public abstract int ataqueSeguro();
}

