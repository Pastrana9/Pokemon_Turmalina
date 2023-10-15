package Pokemon_Turmalina;

import java.util.Scanner;

public class Pikachu extends Pokemon{
	
	private int  rayo=40;
	private int placaje=10;
	
	public Pikachu(String nombre,String tipo,int HP)
	{
		super(nombre,tipo,HP);
	}
	
	public int getRayo()
	{
		return rayo;
	}
	public int getPlacaje()
	{
		return placaje;
	}
	
	@Override
	public int selector()
	{
		int opcion,damage=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Que ataque quieres: 1.- Rayo , 2.-Placaje");
		
		opcion=input.nextInt();
		
		switch(opcion)
		{
			case 1:
				damage=getRayo();
				break;
			case 2:
				damage=getPlacaje();
				break;
		}
		return damage;
	}

}
