package lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapstestor {
    
    public static void main(String[] args) {
        Map<String,Student> myMap = new HashMap<>();
        Student sv1 = new Student("TC",(float)7.0,"CNTT");
        Student sv2 = new Student("NY",(float)7.0,"CNTT");
        Student sv3 = new Student("MV",(float)7.0,"CNTT");
        Student sv4 = new Student("HD",(float)7.0,"CNTT");
        myMap.put(sv1.getName(), sv1);
        myMap.put(sv2.getName(), sv2);
        myMap.put(sv3.getName(), sv3);
        myMap.put(sv4.getName(), sv4);


        Set<String> keys = myMap.keySet();

        for(String name : keys){
            Student sv = myMap.get(name);
            System.out.println(">Full Name: " + sv.getName());
            System.out.println(">Rank: " + sv.getRank());
            }
    }
}
