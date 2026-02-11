//Eager Initialization
class ConfigurationManager{

    private static final ConfigurationManager instance = new ConfigurationManager();

    private ConfigurationManager(){}

    public static ConfigurationManager getInstance(){
        return instance;
    }

    public String getConfig(String key){
        return key;
    }
}
