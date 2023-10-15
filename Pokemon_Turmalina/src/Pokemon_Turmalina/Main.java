package Pokemon_Turmalina;

public class Main {

	public static void main(String[] args) {
		

		Pikachu pikachu = new Pikachu("Pikachu","electrico",10);
		Charmander charmander = new Charmander("Charmarden","fuego",20);
		
		Pokemon [] equipo = new Pokemon[2];
		Pokemon [] equipoR = new Pokemon[2];
		
		equipo[0]=pikachu;
		equipo[1]=charmander;
		equipoR[0]=charmander;
		equipoR[1]=pikachu;
				
		Entrenador pepo = new Entrenador("pepo",equipo);
		Rival npc= new Rival("Jose",equipoR);
		
		Battle batalla = new Battle(pepo,npc); 
		
		batalla.iniciar();

	}
}
