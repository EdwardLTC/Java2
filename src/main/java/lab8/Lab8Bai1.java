package lab8;

import java.util.ArrayList;
import java.util.List;


public class Lab8Bai1 {
  

    public static void main(String[] args) {
       
        Genaric<Integer> t1 = new Genaric<Integer>(10);
        Genaric<Float> t2 = new Genaric<Float>((float) 10.2);
        Genaric<Boolean> t3 = new Genaric<Boolean>(true);
        Genaric<String> t4 = new Genaric<String>("Ehe");
    
        List<Genaric> arr = new ArrayList();
        arr.add(t1);
        arr.add(t2);
        arr.add(t3);
        arr.add(t4);

        for (Genaric genaric : arr) {
            System.out.println(genaric.getT());
        }

    }   
}
