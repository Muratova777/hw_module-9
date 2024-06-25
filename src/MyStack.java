public class MyStack <T> {
    private int length = 10;
    private T[] data = (T[]) new Object[length];
    private int size = 0;

    public void push(T element) {
        if (size >= data.length) {
            length = data.length + data.length / 2;
            T[] bufferArray = (T[]) new Object[data.length];
            int j = 0;
            for (int i = 0; i < data.length; i++) {
                bufferArray[j] = data[i];
                j++;
            }
            data = (T[]) new Object[length];
            j = 0;
            for (int i = 0; i < bufferArray.length; i++) {
                data[i] = bufferArray[j];
                j++;
            }
        }
        data[size] = element;
        size++;
    }

    public void remove(int index) {
        T[] bufferArray = (T[]) new Object[data.length];
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            bufferArray[j] = data[i];
            j++;
        }
        j = 0;
        for (int i = 0; i < bufferArray.length - 1; i++) {
            if (i == index) continue;
            data[j] = bufferArray[i];
            j++;
        }
    }

    public void clear() {
        data = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (data == null) {
            System.out.println("Stack is empty");
            return null;
        }
        return data[0];
    }

    public T pop() {
        if (data == null) {
            System.out.println("Stack is empty");
            return null;
        }
        T firstElement = data[0];
        remove(0);
        size--;
        return firstElement;
    }

    public void print() {
        for (T element : data) {
            if (element != null)
                System.out.print(element + " ");
        }
        System.out.println();
    }
}
