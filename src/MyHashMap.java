public class MyHashMap <K, V> {

    private static final int DEFOULT_SIZE = 8;
    private Entry<K, V>[] data = (Entry<K, V>[]) new Entry[DEFOULT_SIZE];
    private int size;

    static class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key, V value) {
        int index = culculateIndex(key.hashCode());
        Entry<K, V> newEntry = new Entry<>(key, value);
        if (data[index] == null) {
            data[index] = newEntry;
        } else {
            while (data[index].next != null) {
                data[index].next = newEntry;
            }
        }
        size++;
    }

    private int culculateIndex(int hashcode) {
        return Math.abs(hashcode % data.length);
    }

    public V get(K key) {
        if (size == 0) {
            System.out.println("The map is empty");
            return null;
        }
        int index = culculateIndex(key.hashCode());
        try {
            if (data[index].key == null) throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("There is no element in the HashMap with key: " + key);
            return null;
        }

        if (data[index].key.equals(key)) {
            return data[index].value;
        } else {
            while (data[index].next != null) {
                if (data[index].next.key.equals(key))
                    return data[index].next.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = culculateIndex(key.hashCode());
        if (data[index].key.equals(key)) {
            data[index].value = null;
        } else {
            while (data[index].next != null) {
                if (data[index].next.key.equals(key))
                    data[index].next.value = null;
            }
        }
        data[index].key = null;
        size--;
    }

    public void clear() {
        data = null;
        size = 0;
    }

    public int size() {
        return size;
    }
}
