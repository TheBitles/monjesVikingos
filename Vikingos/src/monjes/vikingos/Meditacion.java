package monjes.vikingos;

public class Meditacion implements Estado {
	EstadoActual ea;
	
	public Meditacion() {
		ea = EstadoActual.MEDITACION;
	}

	@Override
	public Estado calmarse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado recibirAtaque(int ataque) {
		// TODO Auto-generated method stub
		return null;
	}

}
