package lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

abstract public class AbDAO<Entity> {
    protected List<Entity> list = new ArrayList<>();

    public void add(Entity entity) {
        list.add(entity);
    }

    public void remove(Entity entity) {
        list.remove(entity);
    }

    public List<Entity> getList() {
        return list;
    }

    public void store(String path) throws ClassNotFoundException, IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));) {
            list = (List<Entity>) ois.readObject();
            ois.close();
        }

    }

    public void load(String path) throws ClassNotFoundException, IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));) {
            oos.writeObject(list);
            oos.close();
        }

    }

    abstract public void update(Entity entity);

    abstract public Entity find(Serializable id);
}
