public class Queue {
    // we define the max value as an invalid value
    int INVALID_VALUE = Integer.MAX_VALUE;

    // queue node class
    private class Node {
        public int value;
        public Node nextNode = null;

        // node constructor
        public Node(int value) {
            this.value = value;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    // adds a new node to the end of the queue
    public void enqueue(int value) {
        Node newNode = new Node(value); // create the new node and assign null to the nextNode
        if(this.size == 0) { // if the queue is empty
            this.head = newNode; // assign the new node to the head
            this.tail = this.head; // the tail is the head
        } else { // if the queue is not empty
            this.tail.nextNode = newNode; // assign the current tail's next node to the new node
            this.tail = newNode; // change the tail to be the new node
        }
        this.size++;
    }

    // removes and returns the first element from the queue (null if empty)
    public int dequeue() {
        if(this.size != 0) {
            Node currentHead = this.head; // keep track of the head node before removing it
            this.head = this.head.nextNode;
            currentHead.nextNode = null;
            this.size--; // decrease the size of the queue
            return currentHead.value;
        }
        return INVALID_VALUE;
    }

    // returns first element of the queue without removing it (null if empty)
    public int first() {
        if(this.size != 0) {
            return this.head.value;
        }
        return INVALID_VALUE;
    }

    // returns the size of the queue
    public int size() {
        return this.size;
    }

    // returns a boolean indicating if the queue is empty
    public boolean isEmpty() {
        return this.size == 0;
    }

    // convert a node to a string
    private static String nodeToString(Node currentNode) {
        if(currentNode.nextNode == null) { // if the current node is the last node
            return currentNode.value + "";
        }
        else {
            return currentNode.value + ", " + nodeToString(currentNode.nextNode); // check next node
        }
    }

    // use nodeToString to convert the whole queue to a string
    @Override
    public String toString() {
        Node currentNode = this.head;

        if(currentNode == null) { // if the first node is null
            return "The list is empty.";
        }
        else {
            return nodeToString(currentNode); // convert current node to string
        }
    }
}
