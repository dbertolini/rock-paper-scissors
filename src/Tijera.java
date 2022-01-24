
public class Tijera extends Elemento {
	public String jugarCon (Elemento ele) {
		return "ele";
	}
	
	public String jugarCon(Tijera t) {	
		return"Empate";
	}
	
	public String jugarCon(Piedra p) {
		return "Gana Piedra";
	}
	
	public String jugarCon (Papel p) {
		return "Gana Tijera";
	}
}