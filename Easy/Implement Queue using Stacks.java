class MyQueue {

    Stack<Integer> st1 ;
    Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack();
        st2 = new Stack();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.empty()){
            int x = st1.pop();
            st2.push(x);
        }
        int a = st2.pop();
        while(!st2.empty()){
            int x = st2.pop();
            st1.push(x);
        }
        return a;
    }
    
    public int peek() {
        while(!st1.empty()){
            int x = st1.pop();
            st2.push(x);
        }
        int a = st2.peek();
        while(!st2.empty()){
            int x = st2.pop();
            st1.push(x);
        }
        return a;
    }
    
    public boolean empty() {
        return st1.empty();
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
