package Test;

import java.util.ArrayList;

public class SystemFile implements SystemInterface {
    public static ArrayList<Student> _studentList = new ArrayList<>();

    @Override
    public boolean add(Student student) {
        for (Student std : _studentList) {
            if (std.getFullName().equalsIgnoreCase(student.getFullName()))
                return false;
        }
        _studentList.add(student);
        return true;
    }

    @Override
    public boolean RM(Student student) {
        for (Student std : _studentList) {
            if(std.getFullName().equalsIgnoreCase(student.getFullName())){
                _studentList.remove(student);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean Edit(Student student) {
        for (Student std : _studentList) {
            if(std.getFullName().equalsIgnoreCase(student.getFullName())){
                std.setScore(student.getScore());
                return true;
            }
        }
        return false;
    }

    @Override
    public Student Find(String name) {
        for (Student std : _studentList) {
            if(std.getFullName().equalsIgnoreCase(name)){
                return std;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> getList() {
        return _studentList;
    }

  
}
