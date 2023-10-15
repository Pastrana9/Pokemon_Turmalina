package Pokemon_Turmalina;

import java.util.Random;

public class Rival {
	
	private String nombre;
	private Pokemon [] equipo= new Pokemon[2];
	
	public Rival(String nombre, Pokemon [] equipo)
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
	
	public Pokemon cambio()
	{
		
		Random random = new Random();
		int indiceAleatorio;
		do
		{
			indiceAleatorio = random.nextInt(equipo.length);
		}while(equipo[indiceAleatorio].getDerrotado());
		System.out.println(indiceAleatorio);
        return equipo[indiceAleatorio];
		
	}

}
