
public class Juego {
	
	//1 = piedra
	//2 = papel
	//3 = tijera
	private Jugador j1;
	private Jugador j2;	
	
	
	
	public Juego(Jugador j1, Jugador j2) {
		this.j1 = j1;
		this.j2 = j2;
	}



	public String jugar() {
		
		j1.setMano(new Piedra());
		j2.setMano(new Papel());
		
return "jugar de juego";
		
		
		
	}
	
	

}
