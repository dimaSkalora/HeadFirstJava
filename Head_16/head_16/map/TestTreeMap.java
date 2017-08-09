package head_16.map;

import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> scores = new TreeMap<>();
        scores.put("Scailer",420);
        scores.put("Keti",42);
        scores.put("Bert",343);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}
