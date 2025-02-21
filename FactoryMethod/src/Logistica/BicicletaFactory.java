package Logistica;

public class BicicletaFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new Bicicleta();
    }
}
