import java.util.HashMap;
import java.util.Map;

public class MainEx1 {
    public static void main(String[] args) {
        Map<String, String> toy = new HashMap<>();
        toy.put("машинка", "toy1");
        toy.put("пистолет", "toy2");
        toy.put("самолёт", "toy3");
        toy.put("лего", "toy4");
        toy.put("лук", "toy5");

        System.out.println(toy.entrySet().toString());
        System.out.println();

        for (String key : toy.values()) {
            System.out.println(key);
        }
        System.out.println();

        for (String key: toy.values()) {
            System.out.println(key);
        }

    }
    }
