/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Edward
 */
public class Student {
    private String name;
    private Float score;
    private String major;

    public Student() {

    }

    public Student(String name, Float score, String major) {
        this.name = name;
        this.score = score;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getRank() {
        if (this.score < 3) {
            return "kem";
        } else if (this.score < 5) {
            return "yeu";
        } else if (this.score < 6.5) {
            return "trung binh";
        } else if (this.score < 7.5) {
            return "Kha";
        } else if (this.score < 9) {
            return " gioi";
        }
        return "xuat sac";
    }

    public boolean isBonus() {
        return this.score >= 7.5;
    }
}
