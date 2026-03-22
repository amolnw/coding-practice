// Last updated: 3/22/2026, 12:37:06 PM
1class LRUCache {
2
3    int capacity;
4    ListNode head;
5    ListNode tail;
6    HashMap<Integer, ListNode> hashMap;
7
8    class ListNode {
9        int key;
10        int val;
11        ListNode prev;
12        ListNode next;
13
14        public ListNode(int key, int val) {
15            this.key = key;
16            this.val = val;
17        }
18    } 
19
20    public LRUCache(int capacity) {
21        head = null;
22        tail = null;
23        hashMap = new HashMap<>();
24        this.capacity = capacity;
25    }
26    
27    public int get(int key) {
28        ListNode node = hashMap.get(key);
29        if (node == null) {
30            return -1;
31        }
32
33        moveToFront(node);
34        return node.val;
35    }
36    
37    private void moveToFront(ListNode node) {
38        if (node == head)
39            return;
40
41        if (node == tail) {
42            tail = node.prev;
43            tail.next = null;
44        } 
45        else {
46            node.prev.next = node.next;
47            node.next.prev = node.prev;
48        }
49
50        node.prev = null;
51        node.next = head;
52        head.prev = node;
53        head = node;
54
55    }
56
57    private void removeTail() {
58        if (tail == null)
59            return;
60
61        hashMap.remove(tail.key);
62        if (head == tail) {
63            // only 1 node in LL
64            head = null;
65            tail = null;
66        }
67        else {
68            tail = tail.prev;
69            tail.next = null;
70        }
71    }
72
73    public void put(int key, int value) {
74        if (hashMap.containsKey(key)) {
75            ListNode node = hashMap.get(key);
76            node.val = value;
77            moveToFront(node);
78            return;
79        }
80
81        if (hashMap.size() == capacity) {
82            //delete tail
83            removeTail();
84        }
85
86        ListNode curr = new ListNode(key, value);
87        if (head == null) {
88            head = curr;
89            tail = curr;
90        }
91        else {
92            curr.next = head;
93            head.prev = curr;
94            head = curr;
95        }
96
97        hashMap.put(key, curr);
98    }
99}
100
101/**
102 * Your LRUCache object will be instantiated and called as such:
103 * LRUCache obj = new LRUCache(capacity);
104 * int param_1 = obj.get(key);
105 * obj.put(key,value);
106 */
107
108
109 