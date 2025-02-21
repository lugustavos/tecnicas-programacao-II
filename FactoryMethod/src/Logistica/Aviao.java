package Logistica;

public class Aviao implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega feita por avião");
    }
}
