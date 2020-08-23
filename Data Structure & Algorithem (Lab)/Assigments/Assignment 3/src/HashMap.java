public class HashMap<K, V> {

    Entry<K, V>[] table;
    int capacity = 4;

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    HashMap() {
        table = new Entry[capacity];
    }

    void add(K newKey, V data) {
        if (newKey == null) {
            return;
        }

        int hash = hash(newKey);

        Entry<K, V> newEntry = new Entry<K, V>(newKey, data, null);

        if (table[hash] == null) {
            table[hash] = newEntry;
        } else {
            Entry<K, V> previous = null;
            Entry<K, V> current = table[hash];

            while (current != null) {
                if (current.key.equals(newKey)) {
                    newEntry.next = current.next;
                    if (previous == null) {
                        table[hash] = newEntry;
                    } else {
                        previous.next = newEntry;
                    }
                    return;
                }
                previous = current;
                current = current.next;
            }
            previous.next = newEntry;
        }
    }

    boolean delete(K deleteKey) {

        int hash = hash(deleteKey);

        if (table[hash] != null) {

            Entry<K, V> previous = null;
            Entry<K, V> current = table[hash];

            while (current != null) {
                if (current.key.equals(deleteKey)) {
                    if (previous == null) {
                        table[hash] = table[hash].next;
                    } else {
                        previous.next = current.next;
                    }
                    return true;
                }
                previous = current;
                current = current.next;
            }
        }
        return false;

    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

}
