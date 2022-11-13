import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class Node<T> {
    private T val;

    private Node next;


}

public class MyLinkedList<T> {

    Node<T> head;
    Node<T> tail;



    void insert(T t) {
        Node<T> node = new Node<>();
        node.setVal(t);
        node.setNext(null);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    void print() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.getVal() + " -> ");
            ptr = ptr.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        list.print();
        list.print();
    }


}


