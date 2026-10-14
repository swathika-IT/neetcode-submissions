class MyHashMap {
HashMap<Integer,Integer> m=new HashMap<>();
    public MyHashMap() {
        m=this.m;
    }
    
    public void put(int key, int value) {
        // if(m.containsKey(value)){  
        //     m.put(key,m.get(value)+1);

        //       }
        //       else{
                m.put(key,value);
  //         }
    }
    
    public int get(int key) {
        return m.containsKey(key)?m.get(key):-1;
    }
    
    public void remove(int key) {
      //  int t=m.get(key);
        m.remove(key);
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */