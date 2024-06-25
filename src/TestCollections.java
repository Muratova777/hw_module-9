public class TestCollections {
    public static void main(String[] args) {
        System.out.println("___________  class MyArrayList <T> _______________");
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Hello");
        myArrayList.add("from");
        myArrayList.add("World");
        myArrayList.add("of");
        myArrayList.add("Java");
        myArrayList.add("!");
        myArrayList.print();

        System.out.println("myArrayList.get(2) = " + myArrayList.get(2));
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.remove(1);
        myArrayList.print();
        myArrayList.clear();
        myArrayList.print();

        System.out.println("___________  class MyLinkedList <T> _______________");

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("Hello");
        myLinkedList.add("from");
        myLinkedList.add("World");
        myLinkedList.add("of");
        myLinkedList.add("Java");
        myLinkedList.add("!");
        myLinkedList.print();

        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0));
        System.out.println("myLinkedList.get(2) = " + myLinkedList.get(2));
        System.out.println("Size = " + myLinkedList.size());
        myLinkedList.remove(2);
        myLinkedList.print();
        System.out.println("Size =" + myLinkedList.size());

        myLinkedList.clear();
        System.out.println("Size =" + myLinkedList.size());

        System.out.println("___________ class MyQueue<T> _______________");
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("Hello");
        myQueue.add("from");
        myQueue.add("World");
        myQueue.add("of");
        myQueue.add("Java");
        myQueue.add("!");
        myQueue.print();

        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue.size() = " + myQueue.size());
        myQueue.clear();
        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println("myQueue.peek() = " + myQueue.peek());


        System.out.println("___________  class MyStack<T> _______________");
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Hello");
        myStack.push("from");
        myStack.push("World");
        myStack.push("of");
        myStack.push("Java");
        myStack.push("!");
        myStack.print();

        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.peek() = " + myStack.peek());
        myStack.pop();
        // myStack.clear();
        System.out.println("Size after pop() " + myStack.size());
        System.out.println("myStack.peek() = " + myStack.peek());
        myStack.print();

        System.out.println("___________  class MyHashMap <T> _______________");
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("1", "Hello");
        myHashMap.put("2", "from");
        myHashMap.put("3", "World");
        myHashMap.put("4", "of");
        myHashMap.put("5", "Java");
        myHashMap.put("6", "!");

        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println("myHashMap.get(\"5\") = " + myHashMap.get("5"));
        myHashMap.remove("3");
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println("myHashMap.get(\"5\") = " + myHashMap.get("3"));
        myHashMap.clear();
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println("myHashMap.get(\"5\") = " + myHashMap.get("1"));
    }
}
