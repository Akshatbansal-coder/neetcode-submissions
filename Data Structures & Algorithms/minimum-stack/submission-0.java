class MinStack {
    Node head;
 class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next =null;
    }
  }

    public MinStack() {
        
    }
    
    public void push(int val) {
        Node newNode = new Node(val);
        if(isEmpty()){
         head = newNode;
         return;
        }
        newNode.next = head;
         head = newNode;
    }
    
    public void pop() {
        if(isEmpty()){
            return ;
        }
      
       head = head.next;
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        Node currNode = head;
        int lowest = head.data;
        while(currNode!= null){
         if(lowest>currNode.data){
            lowest = currNode.data;
         }
         currNode = currNode.next;
        }
        return lowest;
    }

    public boolean isEmpty(){
        return head==null;
    }
}
