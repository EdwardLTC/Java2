package ASM;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface staffInterface {
    void save(staff oj); // save function

    boolean delete(String id); // delete function

    staff find(String id); // find function

    void fileOpen() throws FileNotFoundException, IOException, ClassNotFoundException; // get data from file

    void fileSave() throws FileNotFoundException, IOException, ClassNotFoundException; // save data to file

    ArrayList<staff> getList(); // return list staff

    staff getObj(int pos); // return staff of staff's positon in stafflist

    int listSize(); // return list size

    int getPosObj(String id); // return positon of ID in arraylist

    void sortBySalary(); // sort by salary of staffs in arraylist

    void update(int pos, staff temp);
}
