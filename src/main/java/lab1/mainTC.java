package lab1;

import java.util.Scanner;

public class mainTC {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        product product1 = new product("product1",10000);
        product product2 = new NoTaxProduct("product2",100000);
        product product3 = new product("product3",1000000);
        product product4 = new product("product4",10000000);
        product product5 = new product("product5",100000000);

        System.out.println(product1);
    }
}
