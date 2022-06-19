class LRUCache {
    
    class node{
        node prev=null;
        node next=null;
        int key;
        int val;
        node(int key,int val){
            this.key=key;
            this.val=val;
        }
        
    }
    
    int capacity;
    node head=new node(0,0);
    node tail=new node(0,0);
    HashMap<Integer,node> map=new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.head.next=this.tail;
        this.tail.prev=this.head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            node curr=map.get(key);
            remove(curr);
            insert(curr);
            return curr.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == capacity) {
            remove(tail.prev);
        }
        insert(new node(key, value));
    }
    
    private void remove(node n) {
        map.remove(n.key);
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }

    private void insert(node n) {
        map.put(n.key, n);
        n.next = head.next;
        n.next.prev = n;
        head.next = n;
        n.prev = head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */