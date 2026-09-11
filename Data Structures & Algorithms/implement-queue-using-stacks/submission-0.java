class MyQueue {
   Node head;
    static class Node{
    int data;
 Node next;
public Node(int data){
this.data = data;
this.next =null;
}
}

public MyQueue() {

   
Stack s = new Stack();
}
public void push(int x) {
    Node newNode = new Node(x);

    if (empty()) {
        head = newNode;
        return;
    }

    Node currNode = head;

    while (currNode.next != null) {
        currNode = currNode.next;
    }

    currNode.next = newNode;
}
public int pop() {
if(empty()){
return -1;
}

int top = head.data;
head = head.next;
return top;
}
public int peek() {
if(empty()){
return -1;
}
return head.data;
}
public boolean empty() {
return head == null;
}
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */