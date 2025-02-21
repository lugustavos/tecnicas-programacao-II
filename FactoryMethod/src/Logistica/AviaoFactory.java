package Logistica;

public class AviaoFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new Aviao();
    }
}
