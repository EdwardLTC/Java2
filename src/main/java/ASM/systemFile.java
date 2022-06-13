package ASM;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;



public class systemFile implements staffInterface {
    public static ArrayList<staff> staffList = new ArrayList<>();

    @Override
    public void save(staff Obj) {
        staff tempObj = find(Obj.getId());
        if (tempObj == null)
            staffList.add(Obj);
    }

    @Override
    public boolean delete(String id) {
        for (staff oj : staffList) {
            if (oj.getId().equalsIgnoreCase(id)) {
                staffList.remove(oj);
                return true;
            }
        }

        return false;
    }

    @Override
    public void update(int pos, staff temp) {
        staffList.get(pos).setAge(temp.getAge());
        staffList.get(pos).setName(temp.getName());
        staffList.get(pos).setMail(temp.getMail());
        staffList.get(pos).setSalary(temp.getSalary());
    }

    @Override
    public ArrayList<staff> getList() {
        return staffList;
    }

    @Override
    public void fileOpen() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList <staff> tempstaff = new ArrayList<>();
        tempstaff = (ArrayList<staff>) xfile.readObj("\\PS23247-ThanhCong.java2\\src\\main\\java\\ASM\\text.txt");
        
        for (int i = 0; i < tempstaff.size(); i++) {
            staffList.add(tempstaff.get(i));
        }

    }

    @Override
    public void fileSave() throws IOException, FileNotFoundException, ClassNotFoundException {
        xfile.writeObject("\\PS23247-ThanhCong.java2\\src\\main\\java\\ASM\\text.txt", staffList);

    }

    @Override
    public staff getObj(int pos) {
        return staffList.get(pos);
    }

    @Override
    public int getPosObj(String id) {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getId().equalsIgnoreCase(id)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int listSize() {
        return staffList.size();
    }

    @Override
    public staff find(String id) {
        for (staff oj : staffList) {
            if (oj.getId().equalsIgnoreCase(id))
                return oj;
        }
        return null;
    }

    @Override
    public void sortBySalary() {
        Collections.sort(staffList, (a, b) -> a.getSalary() < b.getSalary() ? 1 : -1);
    }

}
