public class MyQueue <T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    static class Node<T> {
        T element;
        Node<T> next;
        Node<T> previous;

        public Node(T element) {
            this.element = element;
        }
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    public T peek() {
        if (head == null) {
            System.out.println("Queue is empty");
            return null;
        }
        return head.element;
    }

    public T poll() {
        if (head == null) System.out.println("Queue is empty");
        Node<T> firstElement = head;
        head = head.next;
        head.previous = null;
        size--;
        return firstElement.element;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node<T> current = head;
        int i = size;
        while (i != 0) {
            System.out.print(current.element + " ");
            current = current.next;
            i--;
        }
        System.out.println();
    }
}