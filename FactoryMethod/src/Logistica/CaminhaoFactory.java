/**
 * 
 */
package Logistica;

/**
 * 
 */
public class CaminhaoFactory extends TransporteFactory {
	@Override
	public Transporte criarTransporte() {
		return new Caminhao();
	}
}