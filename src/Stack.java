class Node{
    char data;
    Node next;

    Node (char data){
        this.data = data;
    }
}

class Stack {
    Node head;

    void push (char data){
        if (head == null){
            head = new Node(data);
        }else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }
    void pop (){
        head = head.next;
    }
    boolean isEmpty(){
        if (head == null) return true;
        return false;
    }
    char peek (){
        return head.data;
    }
}
