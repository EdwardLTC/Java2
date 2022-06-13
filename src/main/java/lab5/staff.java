package lab5;

import java.io.Serializable;

public class staff implements Serializable{
    private String fullname;
    private double salary;

    public staff(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
