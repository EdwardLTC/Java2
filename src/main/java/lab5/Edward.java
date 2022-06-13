/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author Edward
 */
public class Edward {

    // mmuon doc 1 file can phai biet duoc do dai byte cua du lieu va doc theo byte
    public static byte[] read(String url) throws FileNotFoundException, IOException{
        try(FileInputStream fis = new FileInputStream(url);){
            byte[] length = new byte[fis.available()];
            fis.read(length);
            return length;
        }
    }

    public static void write(String url, byte[] data) throws FileNotFoundException, IOException{
        try(FileOutputStream fos = new FileOutputStream(url);){
            fos.write(data);
        }
    }
    
    public static Object readObject(String url) throws ClassNotFoundException, IOException{
        try(ObjectInputStream ois = new ObjectInputStream( new FileInputStream(url));){
            return ois.readObject();
        }
    }

    public static void writeObject(String url,Object obj) throws FileNotFoundException, IOException{
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(url));){
            oos.writeObject(obj);
        }
    }
}
