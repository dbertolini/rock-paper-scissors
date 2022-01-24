
public class main {

	public static void main(String[] args) {
		
		String res;
		Jugador j1 = new Jugador("juan");
		Jugador j2 = new Jugador("pepe");
		
		Juego juego1 = new Juego(j1,j2);
		
		res = juego1.jugar();
		
		System.out.println(res);
		
		
		
		Piedra p = new Piedra();
		Elemento t = new Tijera();
		
		p.jugarCon(t);
		
		/*
		Elemento p = new Piedra();
		Elemento t = new Tijera();
		
		p.jugarCon(t);
		 */
		
		

	}

}
