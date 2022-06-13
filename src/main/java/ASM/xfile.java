package ASM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class xfile {

    public static Object readObj(String url) throws ClassNotFoundException, IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(url));) {
            Object obj = ois.readObject();
            return obj;
        }

    }

    public static void writeObject(String url, Object obj) throws FileNotFoundException, IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(url));) {
            oos.writeObject(obj);

        }
    }
}
