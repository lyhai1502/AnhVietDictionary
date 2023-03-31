import java.util.HashMap;

public class Dictionary<K, V> {
    private HashMap<K, V> map;

    public Dictionary() {
        map = new HashMap<K, V>();
    }

    public void add(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    public boolean containsValue(V value) {
        return map.containsValue(value);
    }

    public void remove(K key) {
        map.remove(key);
    }

    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public void clear() {
        map.clear();
    }
}
