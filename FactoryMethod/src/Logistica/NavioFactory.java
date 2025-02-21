package Logistica;

public class NavioFactory extends TransporteFactory {

	@Override
	public Transporte criarTransporte() {
		return new Navio();
	}

}
