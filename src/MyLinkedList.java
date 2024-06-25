import java.util.Objects;

public class MyLinkedList<T> {
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

    public T get(int index) {
        Objects.checkIndex(index, size);
        if (index == 0 && head != null) {
            return head.element;
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);

        if (index < size / 2) {
            removeFromHead(index);
        } else {
            removeFromTil(index);
        }
        size--;
    }

    private void removeFromTil(int index) {
        Node<T> elementToDelete = tail;
        int i = size - 1;
        while (index < i) {
            elementToDelete = elementToDelete.previous;
            i--;
        }
        Node<T> prevOfDeletedElement = elementToDelete.previous;
        Node<T> nextOfDeletedElement = elementToDelete.next;
        if (prevOfDeletedElement != null && size != 1) {
            prevOfDeletedElement.next = nextOfDeletedElement;
        }
        if (nextOfDeletedElement != null && size != 1) {
            nextOfDeletedElement.previous = prevOfDeletedElement;
        }
        if (index == size) tail = prevOfDeletedElement;
    }


    private void removeFromHead(int index) {
        Node<T> elementToDelete = head;
        int i = 0;
        while (i < index) {
            elementToDelete = elementToDelete.next;
            i++;
        }
        Node<T> prevOfDeletedElement = elementToDelete.previous;
        Node<T> nextOfDeletedElement = elementToDelete.next;
        if (prevOfDeletedElement != null && size != 1) {
            prevOfDeletedElement.next = nextOfDeletedElement;
        }
        if (nextOfDeletedElement != null && size != 1) {
            nextOfDeletedElement.previous = prevOfDeletedElement;
        }
        if (index == 0) head = nextOfDeletedElement;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = tail = null;
        size = 0;
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
