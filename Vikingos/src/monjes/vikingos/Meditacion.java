package monjes.vikingos;

public class Meditacion implements Estado {
	EstadosPosibles ea;
	
	public Meditacion() {
		ea = EstadosPosibles.MEDITACION;
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
		return "Meditacion";
	}

	@Override
	public Estado recibirAtaque(double porcentaje) {
		return porcentaje > 5 ? new Natural() : this;
	}

}
