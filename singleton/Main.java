package singleton;
public class Main {

    public static void main(String[] args) {
       
        ConfigManager configManager = ConfigManager.getInstance();

        
        String databaseUrl = configManager.getProperty("db.url");
        System.out.println("URL do Banco de Dados: " + databaseUrl);

        
        configManager.setConfigFile("test-config.properties");

       
        String testDatabaseUrl = configManager.getProperty("db.url");
        System.out.println("URL do Banco de Dados de Teste: " + testDatabaseUrl);
    }
}
