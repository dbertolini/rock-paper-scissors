
public class Jugador {
	private String nombre;
	private int puntaje;
	private Elemento mano;
	
	
	
	
	public Jugador(String nombre) {
		this.nombre = nombre;
	}
	
	public int jugar(int mano) {
		System.out.println("juego");
		
		return mano;
	}
	
	public Elemento getMano() {
		return mano;
	}

	public void setMano(Elemento mano) {
		this.mano = mano;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	

}
