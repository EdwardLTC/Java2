package lab8;

import java.io.IOException;

public class Manager {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Product p1 = new Product("iPhone9", 1000.0);
        Product p2 = new Product("Samsung Start", 3000.0);

        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);

        dao.store("PS23247-ThanhCong.java2/src/main/java/lab8/text.txt");

        ProductDAO dao2 = new ProductDAO();
        dao2.load("PS23247-ThanhCong.java2/src/main/java//lab8/text.txt");
        Product p = dao2.find("iPhone9");
        System.out.println(">Name: " + p.name);
        System.out.println(">Price: " + p.price);

    }
}
