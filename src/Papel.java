
public class Papel extends Elemento {
	public String jugarCon (Elemento ele) {
		return "ele";
	}
	
	public String jugarCon(Tijera t) {
		return"Gana tijera";
	}
	
	public String jugarCon(Piedra p) {
		return "Gana papel";
	}
	
	public String jugarCon (Papel p) {
		return "Empate";
	}
}
