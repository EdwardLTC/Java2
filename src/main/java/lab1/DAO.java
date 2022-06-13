package lab1;

public interface DAO {
    void insert(product obj);
    void update(product obj);
    void delete(product obj);
    void select();
    int findObj(String Name);
}
