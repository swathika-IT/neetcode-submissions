class MyHashSet {
   HashSet<Integer> h=new HashSet<>();
    public MyHashSet() {
     
       // this.h=h;
       h=this.h;
    }
    
    public void add(int key) {
        if(!h.contains(key)){
            h.add(key);
        }
    }
    
    public void remove(int key) {
        if(contains(key)){
            h.remove(key);
        }
    }
    
    public boolean contains(int key) {
        if(h.contains(key)){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */