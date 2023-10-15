package Pokemon_Turmalina;

import java.util.Scanner;

public class Charmander extends Pokemon{
	
	private int  ascuas=20;
	private int furia=10;
	
	public Charmander(String nombre,String tipo,int HP)
	{
		super(nombre,tipo,HP);
	}
	public int getAscuas()
	{
		return ascuas;
	}
	public int getFuria()
	{
		return furia;
	}
	
	@Override
	public int selector()
	{
		int opcion,damage=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Que ataque quieres: 1.- ascuas , 2.-furia");
		
		opcion=input.nextInt();
		
		switch(opcion)
		{
			case 1:
				damage=getAscuas();
				break;
			case 2:
				damage=getFuria();
				break;
		}
		return damage;
	}

}
