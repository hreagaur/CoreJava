package Array_Lists;

import java.util.HashMap;

public class People {
  public static void main(String[] args) {

    HashMap <String, Integer> people = new HashMap <String, Integer>();

    people.put("Gopi", 32);
    people.put("Coco", 30);
    people.put("Raja", 33);

    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));
    }
  }
}
