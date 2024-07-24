package Array_Lists;

import java.util.ArrayList;
import java.util.Collections;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> mynum = new ArrayList<Integer>();
        mynum.add(20);
        mynum.add(40);
        mynum.add(60);
        mynum.add(70);
        mynum.add(80);
        mynum.add(90);
        mynum.add(10);
        mynum.add(200);

        Collections.sort(mynum, Collections.reverseOrder());

        for(Integer i: mynum){
            System.out.println(i);
        }


    }
}
