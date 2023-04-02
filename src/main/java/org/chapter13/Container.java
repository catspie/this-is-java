package org.chapter13;

public class Container<K, V> {
    private K key;
    private V value;

    public Container(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Container() {
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
