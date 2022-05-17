import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        /************************ TacoBox ******************************/
        TripleTacoBox tacoBox1 = new TripleTacoBox();
        tacoBox1.eat();
        System.out.println(tacoBox1.tacosRemaining());
        /******************* SetAsMethodParameter *************/
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));
        /**************** MapAsAMethodParameter *************************/
        Map<String, String> names2 = new HashMap<>();
        names2.put("1", "first");
        names2.put("2", "second");

        System.out.println(returnSize(names));

        /*********************ListAsAMethodParameter****************************/
        List<String> names3 = new ArrayList<>();
        names3.add("First");
        names3.add("Second");
        names3.add("Third");

        System.out.println(returnSize(names));

    }

    public static int returnSize(Set names) {
        return names.size();
    }

    public static int returnSize(Map names) {
        return names.size();
    }

    public static int returnSize(List names) {
        return names.size();
    }

}
