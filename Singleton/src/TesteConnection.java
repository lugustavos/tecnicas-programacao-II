public class TesteConnection {
    public static void main(String[] args) {
//        obter conexão-instância
     DatabaseConnection conexaoRH = DatabaseConnection.getInstance();
        DatabaseConnection conexaoTI = DatabaseConnection.getInstance();
        DatabaseConnection conexaoVendas = DatabaseConnection.getInstance();
    }
}
