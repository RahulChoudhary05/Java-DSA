package HashTable.HashSet;

import java.util.LinkedList;
import java.util.List;

public class Question706 {
    //Pair
public class Pair<U, V> {
    U first;
    V second;

    public Pair(U f, V s) {
        first = f;
        second = s;
    }
}

//Bucket
class Bucket {
    List<Pair<Integer, Integer>> list;

    public Bucket() {
        list = new LinkedList<Pair<Integer, Integer>>(); 
    }

    public void put(int key, int value) {
        // update the value by its key
        for (Pair<Integer, Integer> p : list) {
            if (p.first.equals(key)) {
                p.second = value;
                return;
            }
        }
        list.add(new Pair<Integer, Integer>(key, value));
    }

    public int get(int key) {
        // update the value by its key
        for (Pair<Integer, Integer> p : list) {
            if (p.first.equals(key)) {
                return p.second;
            }
        }
        // if don't exist
        return -1;
    }

    public void remove(int key) {
        // update the value by its key
        for (Pair<Integer, Integer> p : list) {
            if (p.first.equals(key)) {
                list.remove(p);
                return;
            }
        }
    }
}

class MyHashMap {
    int keyRange = 769;
    Bucket[] buckets;

    public MyHashMap() {
        this.buckets = new Bucket[this.keyRange];

        for (int i = 0; i < keyRange; i++) {
            this.buckets[i] = new Bucket();
        }
    }

    public int getBucketKeyIndex(int key) {
        return key % keyRange;
    }
    
    public void put(int key, int value) {
        // take bucket(by its index - getBucketKeyIndex)
        int bucketIndex = this.getBucketKeyIndex(key);
        this.buckets[bucketIndex].put(key, value);
    }
    
    public int get(int key) {
        // take bucket(by its index - getBucketKeyIndex)
        int bucketIndex = this.getBucketKeyIndex(key);
        return this.buckets[bucketIndex].get(key);
    }
    
    public void remove(int key) {
        // take bucket(by its index - getBucketKeyIndex)
        int bucketIndex = this.getBucketKeyIndex(key);
        this.buckets[bucketIndex].remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

}
