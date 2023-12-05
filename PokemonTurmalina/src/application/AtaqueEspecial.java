package application;

/**
 * La interfaz AtaqueEspecial define metodos para relaizar distitnos ataques de los pokemons.
 * Implementar esta interfaz permite a las clases proporcionar su propia lógica para realizar distintos ataques.
 */
public interface AtaqueEspecial {

    /**
     * Realiza un ataque muy arriesgado.
     *
     * @return El valor numérico que representa el resultado del ataque.
     */
    int ataqueMuyArriesgado();
    /**
     * Realiza un ataque seguro.
     *
     * @return El valor numérico que representa el resultado del ataque.
     */
    
    int ataqueSeguro();
}

