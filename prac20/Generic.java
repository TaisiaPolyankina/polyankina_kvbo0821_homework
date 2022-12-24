package polyankina_kvbo0821.prac20;

import java.security.PrivateKey;

public class Generic < T extends String, V extends Animal, K> {

    private T t;
    private V v;
    private K k;

    public Generic(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void show() {
        System.out.println("t: " + t.getClass().getName());
        System.out.println("v: " + v.getClass().getName());
        System.out.println("k: " + k.getClass().getName());
    }

}
