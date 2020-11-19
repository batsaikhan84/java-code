package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> strPair = new HashMap<>();
        strPair.put("a", "Hi");
        strPair.put("b", "There");
        System.out.println(mapAB(strPair));
    }
    public static HashMap mapAB(HashMap<String, String> strPair) {
        if (strPair.containsKey("a") && (strPair.containsKey("b"))) {
            strPair.put("ab", strPair.get("a") + strPair.get("b"));
        }
        return strPair;
    }
}
