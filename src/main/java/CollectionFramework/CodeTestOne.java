package CollectionFramework;
/*
Modify and return the given map as follows: if the key “a”
has a value, set the key “b” to have that value, and set the key
“a” to have the value “”. Basically “b” is a bully, taking the value
and replacing it with the empty string.

mapBully({“a”: “candy”, “b”: “dirt”}) → {“a”: “”, “b”: “candy”}
mapBully({“a”: “candy”}) → {“a”: “”, “b”: “candy”}
mapBully({“a”: “candy”, “b”: “carrot”, “c”: “meh”}) → {“a”: “”, “b”: “candy”, “c”: “meh”}
 */

import java.util.Arrays;
import java.util.HashMap;

public class CodeTestOne {
    public static void main(String[] args) {
//        HashMap<String, String> strPairOne = new HashMap<>();
//        strPairOne.put("a", "candy");
//        strPairOne.put("b", "dirt");
//        System.out.println(mapBully(strPairOne));
        HashMap<String, String> strPairTwo = new HashMap<>();
//        strPairTwo.put("a", "aaa");
//        strPairTwo.put("b", "bbb");
//        strPairTwo.put("c", "ccc");

//        strPairTwo.put("b", "xyz");
//        strPairTwo.put("c", "ccc");

        strPairTwo.put("a", "aaa");
        strPairTwo.put("c", "meh");
        strPairTwo.put("d", "hi");

        System.out.println(mapShare(strPairTwo));
    }
    public static HashMap mapBully(HashMap<String, String> strPair) {
        if (!strPair.get("a").isEmpty()) {
            strPair.replace("b", strPair.get("b"), strPair.get("a"));
            strPair.replace("a", strPair.get("a"), "");
        }
        return strPair;
    }
    public static HashMap mapShare(HashMap<String, String> strPair) {
        if (strPair.containsKey("c")) {
            strPair.remove("c");
        }
        if (strPair.containsKey("a") && !strPair.get("a").isEmpty()) {
            if (strPair.containsKey("b")) {
                strPair.replace("b", strPair.get("b"), strPair.get("a"));
            } else {
                strPair.put("b", strPair.get("a"));
            }
        }
        return strPair;
    }
}
