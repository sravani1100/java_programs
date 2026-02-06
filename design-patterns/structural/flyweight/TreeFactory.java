import java.util.Map;
import java.util.HashMap;

public class TreeFactory{

    private static final Map<String, Tree> treeMap = new HashMap<>();

    public static Tree getTree(String name, String color){
        String key = name +" - " +color;

        if(!treeMap.containsKey(key)){
            treeMap.put(key, new TreeType(name, color));
        }
        return treeMap.get(key);
    }
}