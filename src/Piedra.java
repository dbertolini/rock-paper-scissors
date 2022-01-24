
public class Piedra extends Elemento {
	public String jugarCon (Elemento ele) {
		return "ele";
	}
	
	public String jugarCon(Tijera t) {	
		return"Gana piedra";
	}
	
	public String jugarCon(Piedra p) {
		return "Empate";
	}
	
	public String jugarCon (Papel p) {
		return "Gana Papel";
	}	
}
