package exercise_1;

public class Storage<V> {

    private V value;

    public Storage(V value) {
        this.value = value;
    }

    public V getStoreElement() {
        return value;
    }

}
