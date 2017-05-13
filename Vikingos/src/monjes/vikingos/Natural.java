package monjes.vikingos;

public class Natural implements Estado {
	EstadosPosibles ea;
	public Natural() {
		ea = EstadosPosibles.NATURAL;
	}
	
	@Override
	public Estado calmarse() {
		return new Meditacion();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Natural";
	}

	@Override
	public Estado recibirAtaque(int ataque) {
		
		return null;
	}

}
