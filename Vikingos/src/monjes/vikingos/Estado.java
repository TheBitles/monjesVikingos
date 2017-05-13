package monjes.vikingos;

public interface Estado {
	
	//public EstadosPosibles estadoActualEnEstado = EstadosPosibles.NATURAL;
	
	public Estado calmarse();
	public Estado recibirAtaque(int ataque);
}


