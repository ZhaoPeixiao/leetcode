package warmup.page3.designhashset;

/**
 * @Author: Peixiao Zhao
 */
class MyHashSet {

    /** Initialize your data structure here. */
    boolean[] arr;
    public MyHashSet() {
        arr = new boolean[10000001];
    }

    public void add(int key) {
        arr[key] = true;
    }

    public void remove(int key) {
        arr[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return arr[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
