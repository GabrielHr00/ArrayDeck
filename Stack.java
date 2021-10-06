import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Stack{
//    NOTE: add at the end and then remove the last added
//    LIFO princip
//    index to add and to remove from
    private Node topElement;
    private int size;

    private static class Node {
        private int value;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public Stack() {}

    public void push (int element){
        Node newNode = new Node(element);

        if(this.topElement != null){
            newNode.prev = this.topElement;
        }
        this.topElement = newNode;
        this.size++;
    }

    public int peek(){
        checkIfThereIsElement();
        return this.topElement.value;
    }

    public int pop(){
        checkIfThereIsElement();
        int popped = this.topElement.value;

        this.topElement = this.topElement.prev;
        this.size--;

        return popped;
    }

    private void checkIfThereIsElement() {
        if(this.topElement == null){
            throw new NoSuchElementException("No such element at this place!");
        }
    }
    public int size() {
        return this.size;
    }

    public void forEach(Consumer<Integer> consumer){
        Node temp = this.topElement;

        while(temp != null){
            consumer.accept(temp.value);
            temp = temp.prev;
        }
    }
}
