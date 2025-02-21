package Logistica;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int op;
        TransporteFactory transporteFactory;
        Transporte transporte;

        String menu = "\n Bem-vindo ao Sistema de Logística. " +
                "\n 1. Transporte Terrestre (Caminhão)" +
                "\n 2. Transporte Marítimo (Navio)" +
                "\n 3. Transporte Aéreo (Avião)" +
                "\n 4. Transporte Não-Motorizado (Bicicleta)" +
                "\n 0. Sair" +
                "\n \n Escolha uma opção:";

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {
                case 1:
                    transporteFactory = new CaminhaoFactory();
                    break;
                case 2:
                    transporteFactory = new NavioFactory();
                    break;
                case 3:
                    transporteFactory = new AviaoFactory();
                    break;
                case 4:
                    transporteFactory = new BicicletaFactory();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            transporte = transporteFactory.criarTransporte();
            transporte.entregar();

        } while (op != 0);
    }
}
