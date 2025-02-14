public class TesteConfigManager {
    public static void main(String[] args) {
//        obter instância única do gerenciador
        ConfigManager config = ConfigManager.getInstance();
        System.out.println(config.getPropriedades());
    }
}
