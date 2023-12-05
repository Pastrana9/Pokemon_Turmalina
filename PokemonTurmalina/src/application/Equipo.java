package application;

import java.util.ArrayList;
import java.util.List;

public class Equipo  {
	
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private Pokemon pokemon3;
    private Pokemon pokemon4;
    private Pokemon pokemon5;
    private Pokemon pokemon6;

    public Equipo(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3,Pokemon pokemon4, Pokemon pokemon5, Pokemon pokemon6) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.pokemon3 = pokemon3;
        this.pokemon4 = pokemon4;
        this.pokemon5 = pokemon5;
        this.pokemon6 = pokemon6;
    }
    
    public Pokemon getPokemon1() {
        return pokemon1;
    }
    public Pokemon getPokemon2() {
        return pokemon2;
    }
    public Pokemon getPokemon3() {
        return pokemon3;
    }
    public Pokemon getPokemon4() {
        return pokemon4;
    }
    public Pokemon getPokemon5() {
        return pokemon5;
    }
    public Pokemon getPokemon6() {
        return pokemon6;
    }
    public ArrayList<Pokemon> getListaPokemon() {
        ArrayList<Pokemon> listaPokemon = new ArrayList<>();

		listaPokemon.add(pokemon1);
		listaPokemon.add(pokemon2);
		listaPokemon.add(pokemon3);
		listaPokemon.add(pokemon4);
		listaPokemon.add(pokemon5);
		listaPokemon.add(pokemon6);

        return listaPokemon;
    }
    
}
