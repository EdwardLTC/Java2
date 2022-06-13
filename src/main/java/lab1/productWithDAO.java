package lab1;

import java.util.ArrayList;

public class productWithDAO implements DAO{
    public  static ArrayList<product>  products  = new ArrayList<>();

    @Override
    public void insert(product obj) {
        products.add(obj);
        System.out.println("insert success");
    }

    @Override
    public void update(product obj) { 
        int pos = findObj(obj.getName());
        if (pos!=-1){
            products.set(pos,obj);
            System.out.println("set object success");
        }
        else {
            System.out.println("Object does not exited");
        }
    }

    @Override
    public void delete(product obj) {
        int pos = findObj(obj.getName());
        if (pos!=-1){
            products.remove(pos);
            System.out.println("remove success");
        }
        else {
            System.out.println("Object does not exited");
        }
    }

    @Override
    public void select() {
        for (product product: products) {
            System.out.println(product);
        }
    }

    @Override
    public int findObj(String Name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(Name)){
                return i;
            }
        }
        return  -1;
    }
}
