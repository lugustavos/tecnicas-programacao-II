public class DatabaseConnection {
//     instãncia única do Singleton
private static DatabaseConnection instance;

//    construtor privado
private DatabaseConnection(){
        System.out.println("Conexão com o banco de dados estabelecida");
    }
//    método público para obter a instância única
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
//  método  que simula uma operação no banco de dados
    public void executeQuery (String query){
        System.out.println("Executando Query: " + query);
    }
}