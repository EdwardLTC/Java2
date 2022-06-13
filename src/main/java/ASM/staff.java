/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ASM;

import java.io.Serializable;

public class staff implements Serializable {
    private String id;
    private String name;
    private String mail;
    private double salary;
    private int age;

    public staff(staff staff) {

    }

    public staff(String id, String name, String mail, double salary, int age) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.salary = salary;
        this.age = age;
    }

    public String getId() {
        return String.valueOf(this.id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}