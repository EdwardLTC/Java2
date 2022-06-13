package lab8;

public class Genaric<T> {
    private T t;
    
    public Genaric(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
