package monjes.vikingos;


public class Berserker implements Estado {

	private short cantCalmas = 0;
	EstadoActual ea;
	
	public Berserker(){
		ea = EstadoActual.BERSERKER;
	}
	
	@Override
	public Estado calmarse() {
		if (++cantCalmas >= 3){
			//((Vikingo)this).setEstado(EstadoActual.NATURAL);
			return new Natural();
		}
		
		return null;
		
	}

	@Override
	public Estado recibirAtaque(int ataque) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
