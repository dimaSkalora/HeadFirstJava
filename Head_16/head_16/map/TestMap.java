package head_16.map;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("Keti",42);
        scores.put("Bert",343);
        scores.put("Scailer",420);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}
