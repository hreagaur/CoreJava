package Array_Lists;
import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;

public class Cats {
  public static void main(String[] args){
    ArrayList<String> cats = new ArrayList <String>();
    cats.add("HREO");
    cats.add("BELLA");
    cats.add("CHIKKI");
    cats.add("PINGU");
    cats.add("BISCUIT");
    cats.add("GAPPU");

    Collections.sort(cats);
for(String i : cats){
    System.out.println(i);
}

    System.out.println(cats);
    System.out.println(cats.size());
  }
}
