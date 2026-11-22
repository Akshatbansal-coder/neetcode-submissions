class MyHashMap {

    
        HashMap<Integer,Integer> x=new HashMap<>();

    public MyHashMap() {
    }
    
    public void put(int key, int value) {
        x.put(key,value);
    }
    
    public int get(int key) {
        if (x.containsKey(key)){
            return x.get(key);
        }
        else {
            return -1;
        }
        
    }
    
    public void remove(int key) {
        x.remove(key);
    }
}