package monjes.vikingos;

public class Natural implements Estado {
	EstadoActual ea;
	public Natural() {
		ea = EstadoActual.NATURAL;
	}
	
	@Override
	public Estado calmarse() {
		return new Meditacion();
	}

	@Override
	public Estado recibirAtaque(int ataque) {
		
		return null;
	}

}
