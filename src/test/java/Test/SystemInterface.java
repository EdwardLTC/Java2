package Test;

import java.util.ArrayList;

public interface SystemInterface {
    boolean add (Student student);
    boolean RM  (Student student);
    boolean Edit (Student student);
    Student Find (String name);
    ArrayList<Student> getList();

 }
