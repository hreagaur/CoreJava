package Array_Lists;

import java.util.ArrayList;
import java.util.Iterator;

public class Students {
  public static void main(String[] args) {
  
    ArrayList<String> student = new ArrayList<String>();
    student.add("Hrea");
    student.add("Vindiya");
    student.add("Rajath");
    student.add("Naveen");
    student.add("Prajan");

    
    Iterator<String> it = student.iterator();
    
    while(it.hasNext()){
      System.out.println(it.next());
        }
    }
  }


