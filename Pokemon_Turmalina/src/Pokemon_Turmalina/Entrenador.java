package Pokemon_Turmalina;

import java.util.Scanner;

public class Entrenador {
	
	private String nombre;
	private Pokemon [] equipo= new Pokemon[2];
	
	public Entrenador(String nombre, Pokemon [] equipo)
	{
		this.nombre=nombre;
		this.equipo=equipo;
	}
	public String getNombre()
	{
		return nombre;
	}
	public Pokemon[] getEquipo()
	{
		return equipo;
	}
	public void setEquipo(Pokemon[] equipo)
	{
		this.equipo=equipo;
	}
	
	public void verEquipo()
	{
		int contador=1;
		for(Pokemon p:equipo)
		{
			System.out.println(contador + ".- " + p.getNombre());
			contador++;
		}
	}
	
	public Pokemon cambio()
	{
		Scanner input = new Scanner(System.in);
		int posicion;
		
		verEquipo();//Llamo a la función que muestra todo tu equipo
		
		
		
		System.out.println("Que pokemon quieres elegir: (Escribe el numero)");
		posicion=input.nextInt();
		posicion--;
		
		Pokemon pokemonSeleccionado = equipo[posicion];
		
		if (pokemonSeleccionado.getDerrotado()) {
	        System.out.println("¡No puedes seleccionar a un Pokémon derrotado!");
	        return cambio(); // Vuelve a pedir la selección
	    } else {
	        return pokemonSeleccionado;
	    }
		
		
	}

}
