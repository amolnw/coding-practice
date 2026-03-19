// Last updated: 3/18/2026, 6:01:13 PM
1class MinStack {
2
3    int[] element;
4    Stack<int[]> stack;
5
6    public MinStack() {
7        this.element = new int[2];
8        this.stack = new Stack<>();
9    }
10    
11    public void push(int val) {
12        if (this.stack.size() > 0) {
13            int[] topElement = this.stack.peek();
14            int[] newElement = {val, Math.min(val, topElement[1])};
15            this.stack.push(newElement);
16        }
17        else {
18            int[] newElement = {val, val};
19            this.stack.push(newElement);
20        }
21        
22    }
23    
24    public void pop() {
25        this.stack.pop();
26    }
27    
28    public int top() {
29        return this.stack.peek()[0];
30    }
31    
32    public int getMin() {
33        return this.stack.peek()[1];
34    }
35}
36
37/**
38 * Your MinStack object will be instantiated and called as such:
39 * MinStack obj = new MinStack();
40 * obj.push(val);
41 * obj.pop();
42 * int param_3 = obj.top();
43 * int param_4 = obj.getMin();
44 */
45
46