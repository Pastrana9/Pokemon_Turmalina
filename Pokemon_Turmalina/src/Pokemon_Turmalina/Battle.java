package Pokemon_Turmalina;

public class Battle {
	
	Entrenador jugador;
	Rival rival;
	
	public Battle(Entrenador jugador, Rival rival)
	{
		this.jugador=jugador;
		this.rival=rival;
	}
	public Pokemon[] modificarEquipo(Pokemon derrotado, Pokemon [] equipo)
	{
		for(int i=0;i<equipo.length;i++)
		{
			if(equipo[i].getNombre()==derrotado.getNombre())
				equipo[i]=derrotado;
		}
		return equipo;
	}
	public void iniciar()
	{
		int contador=1;

	    Pokemon[] equipoEntrenador = jugador.getEquipo();
	    Pokemon[] equipoRival = rival.getEquipo();

	    Pokemon pokemonCampoUsuario = equipoEntrenador[0];
	    Pokemon pokemonCampoNpc = equipoRival[0];
		
		while(true)
		{
			System.out.println("Turno numero " + contador);
			System.out.println();
			
			System.out.println("Turno de " + jugador.getNombre());
			System.out.println(jugador.getNombre() + " ha sacado a " + pokemonCampoUsuario.getNombre());
			
			pokemonCampoUsuario.atacar(pokemonCampoNpc, pokemonCampoUsuario.selector());
			
			if(pokemonCampoNpc.getHP()<=0)//Si el pokemon rival es derrotado se muestra un mensaje y se obliga al usuario a cambiar de pokemon
			{
				pokemonCampoNpc.setDerrotado();
				rival.setEquipo(modificarEquipo(pokemonCampoNpc, rival.getEquipo()));
				System.out.println(pokemonCampoNpc.getNombre() + " ha sido derrotado");
				pokemonCampoNpc=rival.cambio();
			}

			
			System.out.println();
			
			System.out.println("Turno de " + rival.getNombre());
			System.out.println(rival.getNombre() + " ha sacado a " + pokemonCampoNpc.getNombre());
			
			pokemonCampoNpc.atacar(pokemonCampoUsuario, pokemonCampoNpc.selector());
			
			if(pokemonCampoUsuario.getHP()<=0)
			{
				pokemonCampoUsuario.setDerrotado();
				jugador.setEquipo(modificarEquipo(pokemonCampoUsuario, jugador.getEquipo()));
				System.out.println(pokemonCampoUsuario.getNombre() + " ha sido derrotado");
				pokemonCampoUsuario=jugador.cambio();
			}

			contador++;
			System.out.println();
		}

	}

}
