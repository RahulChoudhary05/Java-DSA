package HashTable.HashSet;

import java.util.ArrayList;
import java.util.List;

class Bucket {
    private List<Integer> container;

    public Bucket() {
        this.container = new ArrayList<Integer>();
    }

    public void insert(Integer value) {
        int index = this.container.indexOf(value);
        if (index == -1) {
            this.container.add(value);
        }
    }

    public void remove(Integer value) {
        this.container.remove(value);
    }

    public boolean contains(Integer value) {
        int index = this.container.indexOf(value);
        return index != -1;
    }
}

class MyHashSet {
    int numBuckets = 769;
    Bucket[] buckets;

    public MyHashSet() {
        this.buckets = new Bucket[this.numBuckets];

        for (int i = 0; i < numBuckets; i++) {
            this.buckets[i] = new Bucket();
        }
    }
    
    private int getIndex(int key) {
        return key % numBuckets;
    }

    public void add(int key) {
        //take bucket
        int bucketIndex = this.getIndex(key);
        this.buckets[bucketIndex].insert(key);
    }
    
    public void remove(int key) {
        //take bucket
        int bucketIndex = this.getIndex(key);
        this.buckets[bucketIndex].remove(key);
    }
    
    public boolean contains(int key) {
        //take bucket
        int bucketIndex = this.getIndex(key);
        return this.buckets[bucketIndex].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
// Time Complexity: O(1)
// Space Complexity: O(n)
