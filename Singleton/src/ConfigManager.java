public class ConfigManager {
    // Instância única do Singleton
    private static ConfigManager instance;

    // Atributo para armazenar as configurações
    private String properties="\n app.name=Sistema Empresarial \n app.version=1.0 \n app.language=pt-BR \n currency=BRL \n timeout=300 segundos";

    // Método público para obter a instância única
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }
    // Método para obter um valor da configuração
    public String getPropriedades() {
        return properties;
    }
}