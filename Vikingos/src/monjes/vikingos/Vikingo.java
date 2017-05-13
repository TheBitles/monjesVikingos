package monjes.vikingos;


public class Vikingo {
	
	private Estado estado;
	private int ataque;
	private int salud;
	//private EstadosPosibles estadoActualDelVikingo;
	
	public static void main(String[] args) {
		Vikingo v = new Vikingo(10,100);		
		System.out.println(v.estado.toString());
		//System.out.println(Estado.estadoActualEnEstado);
		v.calmarse();
		System.out.println(v.estado.toString());
		v.calmarse();
		System.out.println(v.estado.toString());
		v.calmarse();
		System.out.println(v.estado.toString());
		v.calmarse();
		System.out.println(v.estado.toString());
		v.calmarse();
		System.out.println(v.estado.toString());
		v.calmarse();
		System.out.println(v.estado.toString());
		v.calmarse();
		System.out.println(v.estado.toString());
		
		//System.out.println(Estado.estadoActualEnEstado);
		//System.out.println(Estado.estadoActualEnEstado.toString());
		
	}

	public Vikingo(int atq, int sld) {
		
		ataque = atq;
		salud = sld;
		estado = new Berserker();
		//estadoActualDelVikingo = EstadosPosibles.NATURAL;
		
	}
	
	public void calmarse() {
		estado = estado.calmarse();
	}
	
	public void recibirAtaque(int ataque) {
		estado = estado.recibirAtaque(100 * ataque / salud);
	}
	
	
	
	
	
	


	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	/**
	 * @return the estado
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	

	

	

	

}
