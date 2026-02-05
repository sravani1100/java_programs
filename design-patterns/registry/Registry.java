import java.util.Map;
import java.util.HashMap;

public class Registry{

    private Map<String, Employee> registry = new HashMap<>();

    public void register(String key, Employee employee){
        registry.put(key, employee);
    }

    public Employee getClone(String key){
        System.out.println("Registry getClone()");
        return registry.get(key).clone();
    }


}