/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Edward
 */
public class User {
    private String Username;
    private String Password;
    private String role;

    public User() {

    }

    public User(String Username, String Password, String role) {
        this.Username = Username;
        this.Password = Password;
        this.role = role;
    }

    public String getUsername() {
        return Username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public void setUsername(String username) {
        this.Username = username;
    }
}
