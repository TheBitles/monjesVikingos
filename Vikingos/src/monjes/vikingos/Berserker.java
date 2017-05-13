package monjes.vikingos;


public class Berserker implements Estado {

	private short cantCalmas = 0;
	EstadosPosibles ea;
	
	public Berserker(){
		ea = EstadosPosibles.BERSERKER;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Berserker -> cantCalmas=" + String.valueOf(cantCalmas);
	}

	@Override
	public Estado calmarse() {
		if (++cantCalmas >= 3){
			//((Vikingo)this).setEstado(EstadoActual.NATURAL);
			return new Natural();
		}
		
		return this;
		
	}

	@Override
	public Estado recibirAtaque(double porcentaje) {
		--cantCalmas;
		return this;
	}
	
	

}
