/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Edward
 */

public class PolyStudent {

    public String fullName;
    public Career career;

    public void print() {
        System.out.println(">Fullname: " + this.fullName);
        switch (this.career) {
            case UDPM:
                System.out.println(">Career: Ứng dụng phần mềm");
                break;
            case TKTW:
                System.out.println(">Career: Thiết kế trang web");
                break;
            case LTDD:
                System.out.println(">Career: Lập trình di động");
                break;
            case TKDH:
                System.out.println(">Career: Thiết kế đồ họa");
                break;
        }
    }
}
