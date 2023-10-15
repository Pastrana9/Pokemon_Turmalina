package Pokemon_Turmalina;

public abstract class Pokemon {
	
	private String nombre;
	private String tipo;
	private int HP;
	private Boolean derrotado=false;

	public Pokemon(String nombre,String tipo,int HP)
	{
		this.nombre=nombre;
		this.tipo=tipo;
		this.HP=HP;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public int getHP()
	{
		return HP;
	}
	public Boolean getDerrotado()
	{
		return derrotado;
	}
	public void setDerrotado()
	{
		derrotado=true;
	}
	public void atacar(Pokemon rival, int damage)
	{
		System.out.println(rival.nombre  + " ha recibido " + damage + " de damage");
		rival.HP-=damage;
		System.out.println(rival.nombre + " tiene " + rival.HP + " de vida ");
		
	}
	public abstract int selector();
	
	
}
