class Node {
    int data;
    int min;
    Node next;
    
    public Node(int data, int min){
        this.data = data;
        this.min = min;
    }
}

public class MinStack {
    Node top;

    /** initialize your data structure here. */
    public MinStack() {
    }
    
    public void push(int x) {
        if(top == null){
            top = new Node(x, x);
        } else{
            Node newNode = new Node(x, (int) Math.min(x, top.min));
            newNode.next = top;
            top = newNode;
        }
    }
    
    public void pop() {
        if(top == null){
            return;
        }
        Node temp = top.next;
        top.next = null;
        top = temp;
    }
    
    public int top() {
        if(top == null){
            return -1;
        }
        return top.data;
    }
    
    public int getMin() {
        if(top == null){
            return -1;
        }
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */