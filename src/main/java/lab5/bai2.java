package lab5;

import java.io.IOException;
import java.util.ArrayList;

public class bai2 {
    public static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) throws ClassNotFoundException {
        String url = "src/main/java/lab5/Edward.txt";
        list.add(new Student("Tuấn", 5, "CNTT"));
        try {
            Edward.writeObject(url, list.get(0));
            Student st = (Student) Edward.readObject(url);
            System.out.print(st.name);
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
}
