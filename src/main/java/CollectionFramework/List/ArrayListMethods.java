package CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        for (String e: colors) {
            System.out.println(e);
        }
        colors.add(15, "someColor");
    }
    List<Character> abc = new ArrayList<>();
    // add one color at the first index

}
