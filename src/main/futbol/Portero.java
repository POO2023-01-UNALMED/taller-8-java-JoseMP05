package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	
	
	public short getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	@Override
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}
	
	@Override
	public int compareTo(Futbolista futbolista) {
		Portero portero = (Portero) futbolista;
		return Math.abs(this.golesRecibidos - portero.golesRecibidos);
	}
	
	public boolean jugarConLasManos() {
		if(this.getPosicion().equalsIgnoreCase("Portero"))
			return true;
		return false;
	};
}
