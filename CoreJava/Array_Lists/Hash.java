package Array_Lists;

import java.util.HashSet;

public class Hash {
  public static void main(String[] args) {

    HashSet<Integer> numbers = new HashSet<Integer>();

    numbers.add(2);
    numbers.add(7);
    numbers.add(8);
    numbers.add(5);
    numbers.add(6);
    numbers.add(6);
    numbers.add(9);


   for(int i = 0; i<=10 ;i++){
    if(numbers.contains(i)){
      System.out.println(+i+"the number exists");
    }
    else{
      System.out.println(+i+"not there!!!");
      }
    }
   }
}
